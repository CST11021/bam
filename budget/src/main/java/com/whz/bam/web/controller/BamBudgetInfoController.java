package com.whz.bam.web.controller;

import cn.gov.zcy.common.api.Response;
import cn.gov.zcy.paas.dto.page.PageRO;
import cn.gov.zcy.paas.exception.ZcyCustomWarnException;
import cn.gov.zlb.budget.domain.model.BudgetInfoDO;
import cn.gov.zlb.budget.domain.qo.ZlbBudgetInfoQO;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 盖伦
 * @Date 2024/2/1
 */
@RestController
@RequestMapping("/bam/zlb/budget/info")
public class BamBudgetInfoController {

    /**
     * 查询预算指标
     *
     * @return
     */
    @PostMapping("/page")
    public Response<PageRO<BudgetInfoDO>> page(@RequestBody ZlbBudgetInfoQO qo) {
        PageRO<BudgetInfoDO> pageRO = PageRO.empty();
        return Response.ok(pageRO);
    }

    /**
     * 同步单位的预算指标
     *
     * @return
     */
    @PostMapping("/syncBudgetByOrg")
    public Response syncBudgetByOrg(@RequestBody BudgetInfoDO po) {
        if (po.getYear() == null) {
            throw ZcyCustomWarnException.instanceOf(null, "year参数不能为空");
        }
        if (StringUtils.isBlank(po.getFinancialDistrictCode())) {
            throw ZcyCustomWarnException.instanceOf(null, "financialDistrictCode参数不能为空");
        }
        if (StringUtils.isBlank(po.getOrgCode())) {
            throw ZcyCustomWarnException.instanceOf(null, "orgCode参数不能为空");
        }

        return Response.ok();
    }

    @PostMapping("/reSyncByBudget")
    public Response reSyncByBudget(@RequestBody BudgetInfoDO po) {
        if (po.getYear() == null) {
            throw ZcyCustomWarnException.instanceOf(null, "year参数不能为空");
        }
        if (StringUtils.isBlank(po.getFinancialDistrictCode())) {
            throw ZcyCustomWarnException.instanceOf(null, "financialDistrictCode参数不能为空");
        }
        if (StringUtils.isBlank(po.getFinancialBudgetDetailId())) {
            throw ZcyCustomWarnException.instanceOf(null, "financialBudgetDetailId参数不能为空");
        }

        return Response.ok();
    }

    @Data
    public static class BamBudgetInfoRO extends BudgetInfoDO {
        private String actualUsedAmount;
        private String actualAvailableAmount;
    }

}
