package com.rd.batch.service;

import com.rd.batch.pojo.Bo.RdBatchModelBo;
import com.rd.batch.pojo.Bo.RdBatchProjectBo;
import com.rd.batch.pojo.RdBatchModel;
import com.rd.batch.pojo.RdBatchProject;

/**
 * @author
 * @create 2020-09-16-14:52
 */
public interface RdBatchProjectService {

    /**
     * 新增批次计划
     * @param rdBatchProjectBo
     * @return
     */
    public RdBatchProject crateBatchProject(RdBatchProjectBo rdBatchProjectBo);


    /**
     * 更新批次计划
     * @param rdBatchProjectBo
     * @return
     */
    public RdBatchProject updateBatchProject(RdBatchProjectBo rdBatchProjectBo);


    /**
     * 根据批次计划号，任务号查询批次计划
     * @param serialNo
     * @param taskNo
     * @return
     */
    public RdBatchProject queryBatchProject(int serialNo,int taskNo);


    /**
     * 根据批次计划号，任务号删除批次计划
     * @param serialNo
     * @param taskNo
     */
    public boolean deleteBatchProject(int serialNo,int taskNo);
}
