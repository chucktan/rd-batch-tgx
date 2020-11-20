package com.rd.batch.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "RD_BATCH_TASK")
public class RdBatchTask {
    /**
     * 批次执行流水号
     */
    @Id
    @Column(name = "SERIALNO")
    private String serialno;

    @Column(name = "RELATIVE_PROJECT_SERIALNO")
    private Integer relativeProjectSerialno;

    @Column(name = "RELATIVE_PROJECT_TASKNO")
    private Integer relativeProjectTaskno;


    /**
     * 批次执行状态-0.未执行,1.执行成功,2.执行失败,3.执行中,4.暂停
     */
    @Column(name = "BATCHSTATE")
    private Integer batchstate;

    /**
     * 批次执行日期
     */
    @Column(name = "BATCHDATE")
    private String batchdate;

    /**
     * 批次执行描述
     */
    @Column(name = "BATCHCONTENT")
    private String batchcontent;

    /**
     * 批次开始时间
     */
    @Column(name = "STARTTIME")
    private String starttime;

    /**
     * 批次结束时间
     */
    @Column(name = "ENDTIME")
    private String endtime;

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
     * 获取批次执行流水号
     *
     * @return SERIALNO - 批次执行流水号
     */
    public String getSerialno() {
        return serialno;
    }

    /**
     * 设置批次执行流水号
     *
     * @param serialno 批次执行流水号
     */
    public void setSerialno(String serialno) {
        this.serialno = serialno;
    }

    /**
     * @return RELATIVE_PROJECT_SERIALNO
     */
    public Integer getRelativeProjectSerialno() {
        return relativeProjectSerialno;
    }

    /**
     * @param relativeProjectSerialno
     */
    public void setRelativeProjectSerialno(Integer relativeProjectSerialno) {
        this.relativeProjectSerialno = relativeProjectSerialno;
    }

    /**
     * @return RELATIVE_PROJECT_TASKNO
     */
    public Integer getRelativeProjectTaskno() {
        return relativeProjectTaskno;
    }

    /**
     * @param relativeProjectTaskno
     */
    public void setRelativeProjectTaskno(Integer relativeProjectTaskno) {
        this.relativeProjectTaskno = relativeProjectTaskno;
    }


    /**
     * 获取批次执行状态-0.未执行,1.执行成功,2.执行失败,3.执行中,4.暂停
     *
     * @return BATCHSTATE - 批次执行状态-0.未执行,1.执行成功,2.执行失败,3.执行中,4.暂停
     */
    public Integer getBatchstate() {
        return batchstate;
    }

    /**
     * 设置批次执行状态-0.未执行,1.执行成功,2.执行失败,3.执行中,4.暂停
     *
     * @param batchstate 批次执行状态-0.未执行,1.执行成功,2.执行失败,3.执行中,4.暂停
     */
    public void setBatchstate(Integer batchstate) {
        this.batchstate = batchstate;
    }

    /**
     * 获取批次执行日期
     *
     * @return BATCHDATE - 批次执行日期
     */
    public String getBatchdate() {
        return batchdate;
    }

    /**
     * 设置批次执行日期
     *
     * @param batchdate 批次执行日期
     */
    public void setBatchdate(String batchdate) {
        this.batchdate = batchdate;
    }

    /**
     * 获取批次执行描述
     *
     * @return BATCHCONTENT - 批次执行描述
     */
    public String getBatchcontent() {
        return batchcontent;
    }

    /**
     * 设置批次执行描述
     *
     * @param batchcontent 批次执行描述
     */
    public void setBatchcontent(String batchcontent) {
        this.batchcontent = batchcontent;
    }

    /**
     * 获取批次开始时间
     *
     * @return STARTTIME - 批次开始时间
     */
    public String getStarttime() {
        return starttime;
    }

    /**
     * 设置批次开始时间
     *
     * @param starttime 批次开始时间
     */
    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    /**
     * 获取批次结束时间
     *
     * @return ENDTIME - 批次结束时间
     */
    public String getEndtime() {
        return endtime;
    }

    /**
     * 设置批次结束时间
     *
     * @param endtime 批次结束时间
     */
    public void setEndtime(String endtime) {
        this.endtime = endtime;
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