package com.bam;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author 盖伦
 * @Date 2022/6/17
 */
@WebFilter(filterName = "bamMenuRouteFilter", urlPatterns = "/bam/menu/*")
public class BamMenuRouteFilter implements Filter {

    public final static String ATTRIBUTE_NAME_MENU_PAGE_URL = "menuPageUrl";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        String menuPageUrl = request.getRequestURL().toString();

        // 菜单页面的路径截取："/bam/menu/budget/budgetInfoList" -> "/budget/budgetInfoList"
        request.setAttribute(ATTRIBUTE_NAME_MENU_PAGE_URL, StringUtils.substringAfterLast(menuPageUrl, "/bam/menu"));
        request.getRequestDispatcher("/bam/menu-route").forward(request, response);
        return;
    }

    @Override
    public void destroy() {

    }
}