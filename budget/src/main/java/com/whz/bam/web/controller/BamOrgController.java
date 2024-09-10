package com.whz.bam.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 盖伦
 * @Date 2024/2/20
 */
@RestController
@RequestMapping("/bam/zlb/budget/org")
public class BamOrgController {

    // @Resource
    // private ZlbBudgetOrgMappingDao zlbBudgetOrgMappingDao;
    //
    // @Resource
    // private OrganizationReadServiceAgent organizationReadServiceAgent;
    //
    // @Resource
    // private BudgetOrgMappingManager budgetOrgMappingManager;
    //
    // @PostMapping("/forceMatchOrg")
    // public Response forceMatchOrg(@RequestBody ZlbBudgetOrgMappingDO po) {
    //     if (po.getId() == null) {
    //         throw ZcyCustomWarnException.instanceOf(null, "id不能为空");
    //     }
    //     if (po.getOrgId() == null) {
    //         throw ZcyCustomWarnException.instanceOf(null, "orgId不能为空");
    //     }
    //
    //     budgetOrgMappingManager.updateOrgIdById(po.getId(), po.getOrgId());
    //     return Response.ok();
    // }
    //
    // /**
    //  * 查询预算单位
    //  *
    //  * @return
    //  */
    // @PostMapping("/page")
    // public Response<PageRO<BamOrgRO>> page(@RequestBody BamOrgQO qo) {
    //
    //     Map<Long, ExactInstitution> purchaserMap = null;
    //     if (StringUtils.isNotBlank(qo.getZzdOrgNameLike())) {
    //         purchaserMap = organizationReadServiceAgent.mapByOrgNameLike(qo.getZzdOrgNameLike());
    //
    //         if (MapUtils.isEmpty(purchaserMap)) {
    //             return Response.ok(PageRO.empty());
    //         } else {
    //             qo.setOrgIdList(Lists.newArrayList(purchaserMap.keySet()));
    //         }
    //     }
    //
    //
    //     PageRO pageRO = PageUtil.doSelectPage(qo.getPageNo(), qo.getPageSize(), () -> zlbBudgetOrgMappingDao.list(qo));
    //     pageRO.setData(convert(pageRO.getData(), purchaserMap));
    //     return Response.ok(pageRO);
    // }
    //
    // @Data
    // public static class BamOrgQO extends ZlbBudgetOrgMappingQO {
    //     private String zzdOrgNameLike;
    // }
    //
    // @Data
    // public static class BamOrgRO {
    //     private Long id;
    //     /** 机构code */
    //     private String orgCode;
    //     /** 机构名称 */
    //     private String orgName;
    //     /** 浙里报机构id */
    //     private Long orgId;
    //     /** 机构名称 */
    //     private String zzdOrgName;
    //     /** 统一社会信用代码 */
    //     private String creditCode;
    //     /** 年份 */
    //     private Integer orgYear;
    //     /** 财政区划 */
    //     private String financialDistrictCode;
    //     /** 单位类型 */
    //     private Integer orgType;
    //     /** 推送状态（0：未推送，1已推送） */
    //     private Integer isPush;
    // }
    //
    // private List<BamOrgRO> convert(List<ZlbBudgetOrgMappingDO> doList, Map<Long, ExactInstitution> purchaserMap) {
    //     List<BamOrgRO> roList = new ArrayList<>();
    //     for (ZlbBudgetOrgMappingDO mappingDO : doList) {
    //         BamOrgRO ro = new BamOrgRO();
    //         ro.setId(mappingDO.getId());
    //         ro.setOrgCode(mappingDO.getOrgCode());
    //         ro.setOrgName(mappingDO.getOrgName());
    //         ro.setOrgId(mappingDO.getOrgId());
    //         ro.setCreditCode(mappingDO.getCreditCode());
    //         ro.setOrgYear(mappingDO.getOrgYear());
    //         ro.setFinancialDistrictCode(mappingDO.getFinancialDistrictCode());
    //         ro.setOrgType(mappingDO.getOrgType());
    //         ro.setIsPush(mappingDO.getIsPush());
    //
    //         if (purchaserMap != null) {
    //             ExactInstitution purchaser = purchaserMap.get(mappingDO.getOrgId());
    //             if (purchaser != null) {
    //                 ro.setZzdOrgName(purchaser.getName());
    //             }
    //         }
    //
    //         roList.add(ro);
    //     }
    //
    //     return roList;
    // }

}
