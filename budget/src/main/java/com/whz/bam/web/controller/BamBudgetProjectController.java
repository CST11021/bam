package com.whz.bam.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 盖伦
 * @Date 2024/2/19
 */
@RestController
@RequestMapping("/bam/zlb/budget/project")
public class BamBudgetProjectController {

    // @Resource
    // private ZlbBudgetBaseProjectInfoDao zlbBudgetBaseProjectInfoDao;
    //
    // /**
    //  * 查询预算指标
    //  *
    //  * @return
    //  */
    // @PostMapping("/page")
    // public Response<PageRO<ZlbBudgetBaseProjectInfoDO>> page(@RequestBody ZlbBudgetBaseProjectInfoQO qo) {
    //     PageRO<ZlbBudgetBaseProjectInfoDO> pageRO = PageUtil.doSelectPage(qo.getPageNo(), qo.getPageSize(), () -> zlbBudgetBaseProjectInfoDao.list(qo));
    //     return Response.ok(pageRO);
    // }

}
