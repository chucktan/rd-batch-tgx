package com.rd.batch.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "RD_BATCH_PROJECT")
public class RdBatchProject {
    /**
     * 批次计划号
     */
    @Id
    @Column(name = "SERIALNO")
    private Integer serialno;

    /**
     * 批次任务号
     */
    @Id
    @Column(name = "TASKNO")
    private Integer taskno;

    /**
     * 批次模型号
     */
    @Column(name = "RELATIVEMODELNO")
    private Integer relativemodelno;

    /**
     * 批次执行周期-正则表达式
     */
    @Column(name = "CORN")
    private String corn;

    /**
     * 备注
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
     * 获取批次计划号
     *
     * @return SERIALNO - 批次计划号
     */
    public Integer getSerialno() {
        return serialno;
    }

    /**
     * 设置批次计划号
     *
     * @param serialno 批次计划号
     */
    public void setSerialno(Integer serialno) {
        this.serialno = serialno;
    }

    /**
     * 获取批次任务号
     *
     * @return TASKNO - 批次任务号
     */
    public Integer getTaskno() {
        return taskno;
    }

    /**
     * 设置批次任务号
     *
     * @param taskno 批次任务号
     */
    public void setTaskno(Integer taskno) {
        this.taskno = taskno;
    }

    /**
     * 获取批次模型号
     *
     * @return RELATIVEMODELNO - 批次模型号
     */
    public Integer getRelativemodelno() {
        return relativemodelno;
    }

    /**
     * 设置批次模型号
     *
     * @param relativemodelno 批次模型号
     */
    public void setRelativemodelno(Integer relativemodelno) {
        this.relativemodelno = relativemodelno;
    }

    /**
     * 获取批次执行周期-正则表达式
     *
     * @return CORN - 批次执行周期-正则表达式
     */
    public String getCorn() {
        return corn;
    }

    /**
     * 设置批次执行周期-正则表达式
     *
     * @param corn 批次执行周期-正则表达式
     */
    public void setCorn(String corn) {
        this.corn = corn;
    }

    /**
     * 获取备注
     *
     * @return CONTENT - 备注
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置备注
     *
     * @param content 备注
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