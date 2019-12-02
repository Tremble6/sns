package com.dyz.entity;

import java.util.Date;

public class TmemberBean {
    private Integer pk;

    private String email;

    private String personnelId;

    private String companyId;

    private String sectionId;

    private String positionId;

    private String familyNameKanji;

    private String personalNameKanji;

    private Boolean attentionFlg;

    private String createdBy;

    private Date createdAt;

    private String updatedBy;

    private Date updatedAt;

    private String deletedBy;

    private Date deletedAt;

    private Integer exclusionVersion;

    private Boolean delFlg;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private TUserBean tUserBean;

    private MSectionBean mSectionBean;

    private MCompanyBean mCompanyBean;

    public MSectionBean getmSectionBean() {
        return mSectionBean;
    }

    public void setmSectionBean(MSectionBean mSectionBean) {
        this.mSectionBean = mSectionBean;
    }

    public MCompanyBean getmCompanyBean() {
        return mCompanyBean;
    }

    public void setmCompanyBean(MCompanyBean mCompanyBean) {
        this.mCompanyBean = mCompanyBean;
    }

    public void settUserBean(TUserBean tUserBean) {
        this.tUserBean = tUserBean;
    }

    public TUserBean gettUserBean() {
        return tUserBean;
    }

    public Integer getPk() {
        return pk;
    }

    public void setPk(Integer pk) {
        this.pk = pk;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPersonnelId() {
        return personnelId;
    }

    public void setPersonnelId(String personnelId) {
        this.personnelId = personnelId == null ? null : personnelId.trim();
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId == null ? null : sectionId.trim();
    }

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId == null ? null : positionId.trim();
    }

    public String getFamilyNameKanji() {
        return familyNameKanji;
    }

    public void setFamilyNameKanji(String familyNameKanji) {
        this.familyNameKanji = familyNameKanji == null ? null : familyNameKanji.trim();
    }

    public String getPersonalNameKanji() {
        return personalNameKanji;
    }

    public void setPersonalNameKanji(String personalNameKanji) {
        this.personalNameKanji = personalNameKanji == null ? null : personalNameKanji.trim();
    }

    public Boolean getAttentionFlg() {
        return attentionFlg;
    }

    public void setAttentionFlg(Boolean attentionFlg) {
        this.attentionFlg = attentionFlg;
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