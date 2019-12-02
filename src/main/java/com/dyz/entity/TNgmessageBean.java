package com.dyz.entity;

import java.util.Date;

public class TNgmessageBean {
    private Integer pk;

    private Integer messagePk;

    private String messageBak;

    private Integer ngPk;

    private String state;

    private String createdBy;

    private Date createdAt;

    private String updatedBy;

    private Date updatedAt;

    private String deletedBy;

    private Date deletedAt;

    private Integer exclusionVersion;

    private Boolean delFlg;

    public Integer getPk() {
        return pk;
    }

    public void setPk(Integer pk) {
        this.pk = pk;
    }

    public Integer getMessagePk() {
        return messagePk;
    }

    public void setMessagePk(Integer messagePk) {
        this.messagePk = messagePk;
    }

    public String getMessageBak() {
        return messageBak;
    }

    public void setMessageBak(String messageBak) {
        this.messageBak = messageBak == null ? null : messageBak.trim();
    }

    public Integer getNgPk() {
        return ngPk;
    }

    public void setNgPk(Integer ngPk) {
        this.ngPk = ngPk;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
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
}