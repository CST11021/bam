package com.bam.web;

import com.alibaba.fastjson.JSONArray;
import com.bam.model.Menu;
import com.google.common.collect.Maps;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.bam.BamMenuRouteFilter.ATTRIBUTE_NAME_MENU_PAGE_URL;

@RestController
@RequestMapping("/bam")
public class ManagerController {

    @Value("${bam.menu.config:#{null}}")
    private String bamMenuConfig;

    @RequestMapping("/menu-route")
    public ModelAndView menuRoute(HttpServletRequest request, HttpServletResponse response) {
        String menuPageUrl = (String) request.getAttribute(ATTRIBUTE_NAME_MENU_PAGE_URL);

        return new ModelAndView(menuPageUrl, parseParameter(request));
    }

    private Map<String, String> parseParameter(HttpServletRequest request) {
        Map<String, String[]> parameterMap = request.getParameterMap();
        if (parameterMap == null) {
            return Maps.newHashMap();
        }

        Map<String, String> map = new HashMap<>();
        for (Map.Entry<String, String[]> entry : parameterMap.entrySet()) {
            if (entry.getValue() == null) {
                map.put(entry.getKey(), null);
            }

            if (entry.getValue().length == 1) {
                map.put(entry.getKey(), entry.getValue()[0]);
            }

            if (entry.getValue().length > 1) {
                map.put(entry.getKey(), JSONArray.toJSONString(entry.getValue()));
            }
        }

        return map;
    }

    @GetMapping("/index")
    public ModelAndView index(@RequestParam("target") String target) {


        String menuData = determineMenuData();

        Map<String, Menu> menuMap = new HashMap<>();
        List<Menu> menuList = JSONArray.parseArray(menuData, Menu.class);
        for (Menu menu : menuList) {
            menuMap.put(menu.getCode(), menu);
            if (CollectionUtils.isEmpty(menu.getChildMenus())) {
                continue;
            }

            for (Menu childMenu : menu.getChildMenus()) {
                menuMap.put(childMenu.getCode(), childMenu);
            }
        }

        Map<String, Object> model = new HashMap<>();
        Menu targetMenu = menuMap.get(target);
        if (targetMenu != null) {
            model.put("targetCode", target);
            model.put("targetUrl", targetMenu.getUri());
        }

        model.put("menuList", menuList);
        return new ModelAndView("index", model);
    }

    private String determineMenuData() {

        if (StringUtils.isNotBlank(bamMenuConfig)) {
            return bamMenuConfig;
        }

        File file;
        try {
            file = ResourceUtils.getFile("classpath:bam/default-menu-tree.json");
        } catch (FileNotFoundException e) {
            return null;
        }

        try {
            return FileUtils.readFileToString(file, "UTF-8");
        } catch (IOException e) {
            return null;
        }
    }

    @GetMapping("/testPage")
    public ModelAndView testPage() {
        return new ModelAndView("bak");
    }

}