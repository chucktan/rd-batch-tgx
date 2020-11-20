package com.rd.batch.service;

import com.rd.batch.pojo.RdBatchTask;

/**
 * @author
 * @create 2020-09-14-15:18
 */
public interface RdBatchTaskService {

    /**
     * 根据批次计划流水号，批次计划任务号，批次日期新增批次任务
     * @param batchDate
     * @param PJSerialNo
     * @param PJTaskNo
     * @return
     */
    public RdBatchTask crateBatchTask(String batchDate,int PJSerialNo, int PJTaskNo);


    /**
     * 根据批次计划流水号，批次计划任务号，批次日期更新批次任务
     * @param batchDate
     * @param PJSerialNo
     * @param PJTaskNo
     * @param BatchState
     * @return
     */
    public RdBatchTask updateBatchTask(String batchDate,int PJSerialNo, int PJTaskNo,int BatchState);

    /**
     * 根据批次计划流水号，批次计划任务号，批次日期查询批次任务
     * @param batchDate
     * @param PJSerialNo
     * @param PJSerialNo
     * @return
     */
    public RdBatchTask queryBatchTask(String batchDate,int PJSerialNo, int PJTaskNo);
}
