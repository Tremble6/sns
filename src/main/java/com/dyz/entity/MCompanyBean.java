package com.dyz.entity;

import java.util.Date;

public class MCompanyBean {
    private String companyId;

    private String companyNm;

    private String companyAbb;

    private String companyKindId;

    private String createdBy;

    private Date createdAt;

    private String updatedBy;

    private Date updatedAt;

    private String deletedBy;

    private Date deletedAt;

    private Integer exclusionVersion;

    private Boolean delFlg;

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

    public String getCompanyKindId() {
        return companyKindId;
    }

    public void setCompanyKindId(String companyKindId) {
        this.companyKindId = companyKindId == null ? null : companyKindId.trim();
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getDeletedBy() {
        return deletedBy;
    }

    public void setDeletedBy(String deletedBy) {
        this.deletedBy = deletedBy == null ? null : deletedBy.trim();
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Integer getExclusionVersion() {
        return exclusionVersion;
    }

    public void setExclusionVersion(Integer exclusionVersion) {
        this.exclusionVersion = exclusionVersion;
    }

    public Boolean getDelFlg() {
        return delFlg;
    }

    public void setDelFlg(Boolean delFlg) {
        this.delFlg = delFlg;
    }

    @Override
    public String toString() {
        return "MCompanyBean{" +
                "companyId='" + companyId + '\'' +
                ", companyNm='" + companyNm + '\'' +
                ", companyAbb='" + companyAbb + '\'' +
                ", companyKindId='" + companyKindId + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", createdAt=" + createdAt +
                ", updatedBy='" + updatedBy + '\'' +
                ", updatedAt=" + updatedAt +
                ", deletedBy='" + deletedBy + '\'' +
                ", deletedAt=" + deletedAt +
                ", exclusionVersion=" + exclusionVersion +
                ", delFlg=" + delFlg +
                '}';
    }
}