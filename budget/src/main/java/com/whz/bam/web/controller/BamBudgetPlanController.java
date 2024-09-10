package com.whz.bam.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 盖伦
 * @Date 2024/2/21
 */
@RestController
@RequestMapping("/bam/zlb/budget/plan")
public class BamBudgetPlanController {

    // @Resource
    // private ZlbBudgetInfoDao zlbBudgetInfoDao;
    //
    // @Resource
    // private ZlbSyncBudgetInfoService zlbSyncBudgetInfoService;
    //
    // @Resource
    // private ZlbSyncBudgetPlanService zlbSyncBudgetPlanService;
    //
    // @Resource
    // private ZlbBudgetPlanClassifyDao zlbBudgetPlanClassifyDao;
    //
    // @Resource
    // private ZlbBudgetPlanDao zlbBudgetPlanDao;
    //
    // @Resource
    // private ZlbBudgetPlanLogDao zlbBudgetPlanLogDao;
    //
    // /**
    //  * 查询限额分类
    //  *
    //  * @return
    //  */
    // @PostMapping("/pagePlanClassify")
    // public Response<PageRO<ZlbBudgetPlanClassifyDO>> pagePlanClassify(@RequestBody ZlbBudgetPlanClassifyQO qo) {
    //     PageRO<ZlbBudgetPlanClassifyDO> pageRO = PageUtil.doSelectPage(qo.getPageNo(), qo.getPageSize(), () -> zlbBudgetPlanClassifyDao.list(qo));
    //     return Response.ok(pageRO);
    // }
    //
    // /**
    //  * 查询限额分类
    //  *
    //  * @return
    //  */
    // @PostMapping("/pagePlan")
    // public Response<PageRO<ZlbBudgetPlanDO>> pagePlan(@RequestBody ZlbBudgetPlanQO qo) {
    //     PageRO<ZlbBudgetPlanDO> pageRO = PageUtil.doSelectPage(qo.getPageNo(), qo.getPageSize(), () -> zlbBudgetPlanDao.list(qo));
    //     return Response.ok(pageRO);
    // }
    //
    // /**
    //  * 查询限额分类
    //  *
    //  * @return
    //  */
    // @PostMapping("/pagePlanLog")
    // public Response<PageRO<ZlbBudgetPlanLogDO>> pagePlanLog(@RequestBody ZlbBudgetPlanLogQO qo) {
    //     PageRO<ZlbBudgetPlanLogDO> pageRO = PageUtil.doSelectPage(qo.getPageNo(), qo.getPageSize(), () -> zlbBudgetPlanLogDao.list(qo));
    //     return Response.ok(pageRO);
    // }
    //
    // /**
    //  * 同步单位的预算指标
    //  *
    //  * @return
    //  */
    // @PostMapping("/syncPlanByOrg")
    // public Response syncPlanByOrg(@RequestBody ZlbBudgetPlanDO po) {
    //     if (po.getYear() == null) {
    //         throw ZcyCustomWarnException.instanceOf(null, "year参数不能为空");
    //     }
    //     if (StringUtils.isBlank(po.getFinancialDistrictCode())) {
    //         throw ZcyCustomWarnException.instanceOf(null, "financialDistrictCode参数不能为空");
    //     }
    //     if (StringUtils.isBlank(po.getOrgCode())) {
    //         throw ZcyCustomWarnException.instanceOf(null, "orgCode参数不能为空");
    //     }
    //
    //     zlbSyncBudgetPlanService.syncByOrg(po.getYear(), po.getFinancialDistrictCode(), po.getOrgCode(), true);
    //     return Response.ok();
    // }
    //
    // @Data
    // public static class BamZlbBudgetPlanClassifyRO extends ZlbBudgetPlanClassifyDO {
    //
    //     /** 可用金额 */
    //     private Long actualAvailableAmount;
    //
    // }

}
