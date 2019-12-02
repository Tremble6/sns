package com.dyz.entity;

import java.util.Date;

public class MNgwordBean {
    private Integer pk;

    private String ngWord;

    private String ngType;

    private String sectionId;

    private String createdBy;

    private Date createdAt;

    private String updatedBy;

    private Date updatedAt;

    private String deletedBy;

    private Date deletedAt;

    private Integer exclusionVersion;

    private Boolean delFlg;

    private MSectionBean mSectionBean;

    private MCompanyBean mCompanyBean;

    private TUserBean tUserBean;

    private TmemberBean tmemberBean;

    private TmessageBean tmessageBean;

    private TNgmessageBean tNgmessageBean;

    private String count;

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public TmessageBean getTmessageBean() {
        return tmessageBean;
    }

    public void setTmessageBean(TmessageBean tmessageBean) {
        this.tmessageBean = tmessageBean;
    }

    public TNgmessageBean gettNgmessageBean() {
        return tNgmessageBean;
    }

    public void settNgmessageBean(TNgmessageBean tNgmessageBean) {
        this.tNgmessageBean = tNgmessageBean;
    }

    public TUserBean gettUserBean() {
        return tUserBean;
    }

    public void settUserBean(TUserBean tUserBean) {
        this.tUserBean = tUserBean;
    }

    public TmemberBean getTmemberBean() {
        return tmemberBean;
    }

    public void setTmemberBean(TmemberBean tmemberBean) {
        this.tmemberBean = tmemberBean;
    }

    public void setmSectionBean(MSectionBean mSectionBean) {
        this.mSectionBean = mSectionBean;
    }

    public void setmCompanyBean(MCompanyBean mCompanyBean) {
        this.mCompanyBean = mCompanyBean;
    }

    public MSectionBean getmSectionBean() {
        return mSectionBean;
    }

    public MCompanyBean getmCompanyBean() {
        return mCompanyBean;
    }

    public Integer getPk() {
        return pk;
    }

    public void setPk(Integer pk) {
        this.pk = pk;
    }

    public String getNgWord() {
        return ngWord;
    }

    public void setNgWord(String ngWord) {
        this.ngWord = ngWord == null ? null : ngWord.trim();
    }

    public String getNgType() {
        return ngType;
    }

    public void setNgType(String ngType) {
        this.ngType = ngType == null ? null : ngType.trim();
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId == null ? null : sectionId.trim();
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