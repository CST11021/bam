package com.whz.bam.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 盖伦
 * @Date 2024/2/19
 */
@RestController
@RequestMapping("/bam/zlb/budget/info/log")
public class BamBudgetInfoLogController {

    // @Resource
    // private ZlbBudgetInfoLogDao zlbBudgetInfoLogDao;
    //
    // /**
    //  * 查询预算指标
    //  *
    //  * @return
    //  */
    // @PostMapping("/page")
    // public Response<PageRO<ZlbBudgetInfoLogDO>> page(@RequestBody ZlbBudgetInfoLogQO qo) {
    //     PageRO<ZlbBudgetInfoLogDO> pageRO = PageUtil.doSelectPage(qo.getPageNo(), qo.getPageSize(), () -> zlbBudgetInfoLogDao.list(qo));
    //     return Response.ok(pageRO);
    // }

}
