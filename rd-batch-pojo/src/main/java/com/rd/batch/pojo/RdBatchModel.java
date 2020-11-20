package com.rd.batch.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "RD_BATCH_MODEL")
public class RdBatchModel {
    /**
     * 批次模型号
     */
    @Id
    @Column(name = "SERIALNO")
    private Integer serialno;

    /**
     * 批次名称
     */
    @Column(name = "BATCHNAME")
    private String batchname;

    @Column(name = "BATCHPATHTYPE")
    private Integer batchpathtype;

    /**
     * 批次路径
     */
    @Column(name = "BATCHPATH")
    private String batchpath;

    /**
     * 批次描述
     */
    @Column(name = "CONTENT")
    private String content;

    /**
     * 是否使用 0-否，1-是
     */
    @Column(name = "ISUSE")
    private Integer isuse;

    /**
     * 创建人
     */
    @Column(name = "CREATED_BY")
    private String createdBy;

    /**
     * 创建时间
     */
    @Column(name = "CREATED_TIME")
    private String createdTime;

    /**
     * 更新人
     */
    @Column(name = "UPDATED_BY")
    private String updatedBy;

    /**
     * 更新时间
     */
    @Column(name = "UPDATED_TIME")
    private String updatedTime;

    /**
     * 获取批次模型号
     *
     * @return SERIALNO - 批次模型号
     */
    public Integer getSerialno() {
        return serialno;
    }

    /**
     * 设置批次模型号
     *
     * @param serialno 批次模型号
     */
    public void setSerialno(Integer serialno) {
        this.serialno = serialno;
    }

    /**
     * 获取批次名称
     *
     * @return BATCHNAME - 批次名称
     */
    public String getBatchname() {
        return batchname;
    }

    /**
     * 设置批次名称
     *
     * @param batchname 批次名称
     */
    public void setBatchname(String batchname) {
        this.batchname = batchname;
    }

    /**
     * @return BATCHPATHTYPE
     */
    public Integer getBatchpathtype() {
        return batchpathtype;
    }

    /**
     * @param batchpathtype
     */
    public void setBatchpathtype(Integer batchpathtype) {
        this.batchpathtype = batchpathtype;
    }

    /**
     * 获取批次路径
     *
     * @return BATCHPATH - 批次路径
     */
    public String getBatchpath() {
        return batchpath;
    }

    /**
     * 设置批次路径
     *
     * @param batchpath 批次路径
     */
    public void setBatchpath(String batchpath) {
        this.batchpath = batchpath;
    }

    /**
     * 获取批次描述
     *
     * @return CONTENT - 批次描述
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置批次描述
     *
     * @param content 批次描述
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取是否使用 0-否，1-是
     *
     * @return ISUSE - 是否使用 0-否，1-是
     */
    public Integer getIsuse() {
        return isuse;
    }

    /**
     * 设置是否使用 0-否，1-是
     *
     * @param isuse 是否使用 0-否，1-是
     */
    public void setIsuse(Integer isuse) {
        this.isuse = isuse;
    }

    /**
     * 获取创建人
     *
     * @return CREATED_BY - 创建人
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设置创建人
     *
     * @param createdBy 创建人
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * 获取创建时间
     *
     * @return CREATED_TIME - 创建时间
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * 设置创建时间
     *
     * @param createdTime 创建时间
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 获取更新人
     *
     * @return UPDATED_BY - 更新人
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * 设置更新人
     *
     * @param updatedBy 更新人
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * 获取更新时间
     *
     * @return UPDATED_TIME - 更新时间
     */
    public String getUpdatedTime() {
        return updatedTime;
    }

    /**
     * 设置更新时间
     *
     * @param updatedTime 更新时间
     */
    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }
}