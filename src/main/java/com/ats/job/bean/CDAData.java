package com.ats.job.bean;

import com.ats.job.tool.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CDAData {
    public CDAData(Map<String, Object> mdData) {
        pk = StringUtils.isValue(mdData.get("PK"));
        documentUniqueId = StringUtils.isValue(mdData.get("DOCUMENT_UNIQUE_ID"));
        hisId = StringUtils.isValue(mdData.get("HIS_ID"));
        hisDomainId = StringUtils.isValue(mdData.get("HIS_DOMAIN_ID"));
        visitFlowId = StringUtils.isValue(mdData.get("VISIT_FLOW_ID"));
        visitFlowDomain = StringUtils.isValue(mdData.get("VISIT_FLOW_DOMAIN"));
        fromSystemDomainId = StringUtils.isValue(mdData.get("FROM_SYSTEM_DOMAIN_ID"));
        payLoadType = StringUtils.isValue(mdData.get("PAY_LOAD_TYPE"));
        fromSystemVersion = StringUtils.isValue(mdData.get("FROM_SYSTEM_VERSION"));
        customCol.putAll(mdData);
    }

    public String getCustomCol(String code) {
        if (org.apache.commons.lang.StringUtils.isEmpty(code)) return "";
        return StringUtils.isValue(customCol.get(code));
    }

    public List<Map<String, Object>> getCustomColMap(String code) {
        return customCol.get(code) == null ? new ArrayList<>() : (List<Map<String, Object>>) customCol.get(code);
    }

    public void addCustomCol(Map<String, Object> mdData) {
        customCol.putAll(mdData);
    }

    public void addCustomCol(String subName, Map<String, Object> mdData) {
        List<Map<String, Object>> list;
        if (customCol.containsKey(subName)) list = (List<Map<String, Object>>) customCol.get(subName);
        else list = new ArrayList<>();
        list.add(mdData);
        customCol.put(subName, list);
    }

    private String pk;
    private String documentUniqueId;
    private String hisId;
    private String hisDomainId;
    private String visitFlowId;
    private String visitFlowDomain;
    private String fromSystemDomainId;
    private String payLoadType;
    private String fromSystemVersion;

    private Map<String, Object> customCol = new HashMap<>();

    public String getDocumentUniqueId() {
        return documentUniqueId;
    }

    public void setDocumentUniqueId(String documentUniqueId) {
        this.documentUniqueId = documentUniqueId;
    }

    public String getHisId() {
        return hisId;
    }

    public void setHisId(String hisId) {
        this.hisId = hisId;
    }

    public String getHisDomainId() {
        return hisDomainId;
    }

    public void setHisDomainId(String hisDomainId) {
        this.hisDomainId = hisDomainId;
    }

    public String getVisitFlowId() {
        return visitFlowId;
    }

    public void setVisitFlowId(String visitFlowId) {
        this.visitFlowId = visitFlowId;
    }

    public String getVisitFlowDomain() {
        return visitFlowDomain;
    }

    public void setVisitFlowDomain(String visitFlowDomain) {
        this.visitFlowDomain = visitFlowDomain;
    }

    public String getFromSystemDomainId() {
        return fromSystemDomainId;
    }

    public void setFromSystemDomainId(String fromSystemDomainId) {
        this.fromSystemDomainId = fromSystemDomainId;
    }

    public String getPayLoadType() {
        return payLoadType;
    }

    public void setPayLoadType(String payLoadType) {
        this.payLoadType = payLoadType;
    }

    public String getFromSystemVersion() {
        return fromSystemVersion;
    }

    public void setFromSystemVersion(String fromSystemVersion) {
        this.fromSystemVersion = fromSystemVersion;
    }

    public void setCustomCol(Map<String, Object> customCol) {
        this.customCol = customCol;
    }

    public Map<String, Object> getCustomCol() {
        return customCol;
    }

    public String getPk() {
        return pk;
    }

    public void setPk(String pk) {
        this.pk = pk;
    }
}
