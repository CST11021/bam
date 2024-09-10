package cn.gov.zlb.budget.domain.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author 盖伦
 * @Date 2023/7/21
 */
@Data
public class BudgetInfoDO implements Serializable {

    private static final long serialVersionUID = 8480466708483245199L;

    /** 主键 */
    private Long id;
    /** 指标主键 */
    private String uk;
    /** 是否预算指标主数据 */
    private Integer main;
    /** 内网预算id */
    private String financialBudgetId;
    /** 内网预算详情id */
    private String financialBudgetDetailId;
    /** 总金额 */
    private Long totalAmount;
    /** 冻结金额 */
    private Long frozenAmount;
    /** 可用金额 */
    private Long availableAmount;
    /** 拆分金额 */
    private Long splitAmount;
    /** 已用金额 */
    private Long usedAmount;


    /** 控制方式,参见：BudgetControlModeEnum */
    private Integer controlMode;
    /** 是否包含政府采购预算，0:是、1：否 */
    private Integer containsGovPurchaseBudget;


    /** 预算年度 */
    private Integer year;
    /** 财政区划编码 */
    private String financialDistrictCode;
    /** 单位Guid */
    private String orgGuid;
    /** 单位代码 */
    private String orgCode;
    /** 单位名称 */
    private String orgName;
    /** 部门id */
    private Long depId;
    /** 部门名称 */
    private String depName;
    /** 子部门使用（0：否 1：是） */
    private Integer isSubUse;


    /** 预算指标文号 */
    private String budgetNo;
    /** 父预算id */
    private Long parentBudgetId;
    /** 发文时间 */
    private Date releaseTime;

    /** 预算项目代码 */
    private String projectCode;

    /** 项目类型编码 */
    private String programType;
    /** 项目类别代码 */
    private String programCategoryCode;
    /** 项目类别名称 */
    private String programCategoryName;

    /** 资金性质Guid */
    private String fundsNatureId;
    /** 资金性质编码 */
    private String fundsNatureCode;
    /** 资金性质名称 */
    private String fundsNatureName;

    /** 支出功能分类科目编码 */
    private String expendFunctionClassifySubjectCode;
    /** 政府支出经济分类编码 */
    private String govExpendEconomicClassifyCode;
    /** 部门支出经济分类编码 */
    private String depExpendEconomicClassifyCode;

    /**  是否科研：0:否，1:是 */
    private Integer isTech;

    /** 备注 */
    private String remark;

    /** 是否补贴到人到企业, 002001-利民项目 002002-惠企项目 */
    private String subsidy;

    /** 数据行创建时间 */
    private Date addTime;
    /** 数据行最后修改时间 */
    private Date modifiedTime;
    /** 是否逻辑删除 0 否,1是 */
    private Integer isDelete;




    /** 状态：0:待发布、1:可使用、2:冻结中、3:不可用 */
    private Integer status;
    /** 是否基建，0：否、1:是 */
    @Deprecated
    private Integer isInfrastructure;
    /** 业务主管处室编码 */
    @Deprecated
    private String businessSupervisorOfficeId;
    /** 业务主管处室名称 */
    @Deprecated
    private String businessSupervisorOfficeName;

    /** 指标类型Guid */
    @Deprecated
    private String budgetTypeGuid;
    /** 指标类型名称 */
    @Deprecated
    private String budgetTypeName;

    /** 采购类型编码 */
    @Deprecated
    private String buyTypeCode;
    /** 采购类型名称 */
    @Deprecated
    private String buyTypeName;

    /** 采购目录编码 */
    @Deprecated
    private String buyCatalogCode;
    /** 采购目录名称 */
    @Deprecated
    private String buyCatalogName;


    /** 采购单位 */
    @Deprecated
    private String unit;
    /** 采购数量 */
    @Deprecated
    private Integer quantity;
    /** 规格型号 */
    @Deprecated
    private String spec;

}
