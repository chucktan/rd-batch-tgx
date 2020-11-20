package com.rd.batch.service.impl;

import com.rd.batch.mapper.RdBatchModelMapper;
import com.rd.batch.pojo.Bo.RdBatchModelBo;
import com.rd.batch.pojo.RdBatchModel;
import com.rd.batch.service.RdBatchModelService;
import com.rd.batch.utils.DateUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @author
 * @create 2020-09-14-14:47
 */
@Service
public class RdBatchModelServiceImpl  implements RdBatchModelService {


    @Autowired
    private RdBatchModelMapper rdBatchModelMapper;


    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public RdBatchModel crateBatchModel(RdBatchModelBo rdBatchModelBo) {

        RdBatchModel rdBatchModel = new RdBatchModel();
        BeanUtils.copyProperties(rdBatchModelBo,rdBatchModel);

        rdBatchModel.setCreatedBy("admin");
        rdBatchModel.setCreatedTime(DateUtil.dateToString(new Date()));
        rdBatchModel.setUpdatedBy("admin");
        rdBatchModel.setUpdatedTime(DateUtil.dateToString(new Date()));

        rdBatchModelMapper.insert(rdBatchModel);
        return rdBatchModel;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public RdBatchModel updateBatchModel(RdBatchModelBo rdBatchModelBo) {

        RdBatchModel rdBatchModel = new RdBatchModel();
        BeanUtils.copyProperties(rdBatchModelBo,rdBatchModel);

        rdBatchModel.setUpdatedBy("admin");
        rdBatchModel.setUpdatedTime(DateUtil.dateToString(new Date()));

        rdBatchModelMapper.updateByPrimaryKey(rdBatchModel);

        return rdBatchModel;
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public RdBatchModel queryBatchModel(String batchName) {

        RdBatchModel rdBatchModel = new RdBatchModel();
        rdBatchModel.setBatchname(batchName);

        return rdBatchModelMapper.selectOne(rdBatchModel);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public boolean deleteBatchModel(String batchName) {


        RdBatchModel rdBatchModel = new RdBatchModel();
        rdBatchModel.setBatchname(batchName);

        int result =  rdBatchModelMapper.delete(rdBatchModel);

        return result ==1?true:false;

    }
}
