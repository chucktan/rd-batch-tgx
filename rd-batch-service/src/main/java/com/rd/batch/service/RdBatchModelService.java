package com.rd.batch.service;

import com.rd.batch.pojo.Bo.RdBatchModelBo;
import com.rd.batch.pojo.RdBatchModel;

/**
 * @author
 * @create 2020-09-14-14:21
 */
public interface  RdBatchModelService {

    /**
     * 新增批次模型
     * @param rdBatchModelBo
     * @return
     */
    public RdBatchModel crateBatchModel(RdBatchModelBo rdBatchModelBo);


    /**
     * 更新批次模型
     * @param rdBatchModelBo
     * @return
     */
    public RdBatchModel updateBatchModel(RdBatchModelBo rdBatchModelBo);

    /**
     * 根据批次名称查询批次模型
     * @param batchName
     * @return
     */
    public RdBatchModel queryBatchModel(String batchName);


    /**
     * 根据批次名称删除批次模型
     * @param batchName
     */
    public boolean deleteBatchModel(String batchName);
}
