package com.dyz.entity;

public class VSectionOfCompanyBean {
    private String sectionId;

    private String sectionNm;

    private Integer displayOrder;

    private String orgnznameabbr;

    private String companyId;

    private String companyNm;

    private String companyAbb;

    private String names;

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId == null ? null : sectionId.trim();
    }

    public String getSectionNm() {
        return sectionNm;
    }

    public void setSectionNm(String sectionNm) {
        this.sectionNm = sectionNm == null ? null : sectionNm.trim();
    }

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    public String getOrgnznameabbr() {
        return orgnznameabbr;
    }

    public void setOrgnznameabbr(String orgnznameabbr) {
        this.orgnznameabbr = orgnznameabbr == null ? null : orgnznameabbr.trim();
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public String getCompanyNm() {
        return companyNm;
    }

    public void setCompanyNm(String companyNm) {
        this.companyNm = companyNm == null ? null : companyNm.trim();
    }

    public String getCompanyAbb() {
        return companyAbb;
    }

    public void setCompanyAbb(String companyAbb) {
        this.companyAbb = companyAbb == null ? null : companyAbb.trim();
    }
}