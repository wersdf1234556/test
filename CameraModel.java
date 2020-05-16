package org.tonzoc.model;

import org.tonzoc.annotation.*;

// 摄像头
@Table(value = "cameras")
public class CameraModel extends BaseModel {

    @PrimaryKey
    @NotInsertColumn
    @Column(value = "guid")
    private String guid;
    @Column(value = "deviceSerial")
    private String deviceSerial;  // 序列号
    @Column(value = "chanelNo")
    private String chanelNo;  // 通道号
    @Column(value = "name")
    private String name; // 名称
    @Column(value = "typeId")
    private String typeId; // 类型表id
    @Column(value = "tenderId")
    private String tenderId;

    @Column(value = "brand")
    private String brand; // 品牌
    @Column(value = "projectId")
    private String projectId; // 项目编号
    @Column(value = "remark")
    private String remark;  // 备注
    @Column(value = "lng") // 精度
    private String lng;
    @Column(value = "lat") // 纬度
    private String lat;
    @Column(value = "sortId")
    private Integer sortId; // 排序
    @JoinColumn(value = "name", type = TenderModel.class, leftColumn = "tenderId", rightColumn = "guid")
    private String tenderName;
    @JoinColumn(value = "name", type = CameraTypeModel.class, leftColumn = "typeId", rightColumn = "guid")
    private String cameraTypeName;  // 摄像头类型

    @JoinColumn(value = "name", type = ProjectModel.class, leftColumn = "projectId", rightColumn = "guid")
    private String projectName;  // 项目名称

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getDeviceSerial() {
        return deviceSerial;
    }

    public void setDeviceSerial(String deviceSerial) {
        this.deviceSerial = deviceSerial;
    }

    public String getChanelNo() {
        return chanelNo;
    }

    public void setChanelNo(String chanelNo) {
        this.chanelNo = chanelNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getTenderId() {
        return tenderId;
    }

    public void setTenderId(String tenderId) {
        this.tenderId = tenderId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    public String getTenderName() {
        return tenderName;
    }

    public void setTenderName(String tenderName) {
        this.tenderName = tenderName;
    }

    public String getCameraTypeName() {
        return cameraTypeName;
    }

    public void setCameraTypeName(String cameraTypeName) {
        this.cameraTypeName = cameraTypeName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
