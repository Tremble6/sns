package com.dyz.entity;

import lombok.Data;

import java.util.Date;

@Data
public class TmessageBean {
    private Integer pk;

    private String chatworkId;

    private String roomId;

    private String message;

    private String fileName;

    private String fileUrl;

    private Date sendedAt;

    private String state;

    private String createdBy;

    private Date createdAt;

    private String updatedBy;

    private Date updatedAt;

    private String deletedBy;

    private Date deletedAt;

    private Integer exclusionVersion;

    private Boolean delFlg;

    private TUserBean tUserBean;

    private TmemberBean tmemberBean;

    private VSectionOfCompanyBean vSectionOfCompanyBean;

    private MSnsUserBean mSnsUserBean;

    private TNgmessageBean tNgmessageBean;

    public MSnsUserBean getmSnsUserBean() {
        return mSnsUserBean;
    }

    public void setmSnsUserBean(MSnsUserBean mSnsUserBean) {
        this.mSnsUserBean = mSnsUserBean;
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

    public VSectionOfCompanyBean getvSectionOfCompanyBean() {
        return vSectionOfCompanyBean;
    }

    public void setvSectionOfCompanyBean(VSectionOfCompanyBean vSectionOfCompanyBean) {
        this.vSectionOfCompanyBean = vSectionOfCompanyBean;
    }

    public TmessageBean() {

    }

    public Integer getPk() {
        return pk;
    }

    public void setPk(Integer pk) {
        this.pk = pk;
    }

    public String getChatworkId() {
        return chatworkId;
    }

    public void setChatworkId(String chatworkId) {
        this.chatworkId = chatworkId == null ? null : chatworkId.trim();
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId == null ? null : roomId.trim();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl == null ? null : fileUrl.trim();
    }

    public Date getSendedAt() {
        return sendedAt;
    }

    public void setSendedAt(Date sendedAt) {
        this.sendedAt = sendedAt;
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