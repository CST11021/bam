package cn.gov.zlb.budget.domain.qo;

import cn.gov.zcy.paas.dto.page.PagePO;
import lombok.Data;

import java.util.List;

/**
 * @Author 盖伦
 * @Date 2023/7/21
 */
@Data
public class ZlbBudgetInfoQO extends PagePO {

    /** 主键 */
    private Long id;
    /** 预算ID */
    private List<Long> idList;

    /** 预算UK */
    private String uk;

    /** 预算Uk */
    private List<String> ukList;

    /** 是否主指标，1是0否 */
    private Integer main;

    /** 财政区划编码 */
    private String financialDistrictCode;

    /** 单位代码 */
    private String orgCode;

    /** 父预算id */
    private Long parentBudgetId;

    /** 部门id */
    private Long depId;

    /** 年份 */
    private Integer year;

    /** 预算指标文号 */
    private String budgetNoLike;

    /** 一体化预算指标ID */
    private String financialBudgetDetailId;

    /** 一体化预算指标ID */
    private List<String> financialBudgetDetailIdList;

    /** 项目code集合 */
    private List<String> projectCodeList;

    /** 部门经济分类code集合 */
    private List<String> depExpendEconomicClassifyCodeList;

    /** 项目 | 部门经济分类code集合 */
    private List<String> projectOrDepEconomyClassifyCodeList;

    /** 内网预算id集合（guid） */
    private List<String> financialBudgetIdList;

    /** 政府支出经济分类编码 */
    private String govExpendEconomicClassifyCode;

    /** 是否包含政府采购（0：不包含，1：包含）*/
    private Integer containsGovPurchaseBudget;

    /** 是否补贴到人到企业, 002001-利民项目 002002-惠企项目 */
    private String subsidy;

    /** 是否是单位预算 */
    private Boolean onlyOrgBudget;

    /** 至少可用金额 */
    private Long atLeastAvailableAmount;

    /** 排除的ID */
    private List<Long> excludeIdList;

    /** 查询资金性质以什么开头 */
    private String fundsNatureStartWith;
}
