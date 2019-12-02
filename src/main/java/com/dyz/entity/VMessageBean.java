package com.dyz.entity;

import java.util.Date;

public class VMessageBean {
    private String roomName;

    private String roomType;

    private String message;

    private String fileName;

    private String fileUrl;

    private Date sendedAt;

    private String state;

    private Integer pk;

    private String email;

    private String personnelId;

    private String companyId;

    private String sectionId;

    private String positionId;

    private String familyNameKanji;

    private String personalNameKanji;

    private Boolean attentionFlg;

    private String ngState;

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName == null ? null : roomName.trim();
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType == null ? null : roomType.trim();
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

    public String getNgState() {
        return ngState;
    }

    public void setNgState(String ngState) {
        this.ngState = ngState == null ? null : ngState.trim();
    }
}