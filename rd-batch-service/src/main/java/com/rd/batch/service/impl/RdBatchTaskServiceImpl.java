package com.rd.batch.service.impl;

import com.rd.batch.enums.BatchStatusEnum;
import com.rd.batch.mapper.RdBatchTaskMapper;
import com.rd.batch.pojo.RdBatchModel;
import com.rd.batch.pojo.RdBatchTask;
import com.rd.batch.service.RdBatchModelService;
import com.rd.batch.service.RdBatchTaskService;
import com.rd.batch.utils.DateUtil;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;

/**
 * @author
 * @create 2020-09-14-15:42
 */
@Service
public class RdBatchTaskServiceImpl  implements RdBatchTaskService {


    @Autowired
    private RdBatchTaskMapper rdBatchTaskMapper;

    @Autowired
    private Sid sid;


    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public RdBatchTask crateBatchTask(String batchDate, int PJSerialNo, int PJTaskNo) {

        RdBatchTask rdBatchTask = new RdBatchTask();
        rdBatchTask.setSerialno(sid.nextShort());
        rdBatchTask.setRelativeProjectSerialno(PJSerialNo);
        rdBatchTask.setRelativeProjectTaskno(PJTaskNo);
        rdBatchTask.setBatchstate(BatchStatusEnum.INIT.type);
        rdBatchTask.setBatchdate(batchDate);
        rdBatchTask.setCreatedBy("admin");
        rdBatchTask.setCreatedTime(DateUtil.dateToString(new Date(),"yyyyMMdd"));
        rdBatchTask.setUpdatedBy("admin");
        rdBatchTask.setUpdatedTime(DateUtil.dateToString(new Date(),"yyyyMMdd"));

        rdBatchTaskMapper.insert(rdBatchTask);
        return rdBatchTask;
    }


    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public RdBatchTask updateBatchTask(String batchDate, int PJSerialNo, int PJTaskNo,int BatchState
    ) {

        RdBatchTask rdBatchTask = new RdBatchTask();
        rdBatchTask.setBatchstate(BatchState);

        Example example = new Example(RdBatchTask.class);
        Example.Criteria criteria =  example.createCriteria();
        criteria.andEqualTo("relativeProjectSerialno",PJSerialNo);
        criteria.andEqualTo("relativeProjectTaskno",PJTaskNo);
        criteria.andEqualTo("batchdate",batchDate);


        rdBatchTaskMapper.updateByExampleSelective(rdBatchTask,example);

        return  queryBatchTask(batchDate,PJSerialNo,PJTaskNo);

    }


    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public RdBatchTask queryBatchTask(String batchDate, int PJSerialNo, int PJTaskNo ) {
        Example example = new Example(RdBatchTask.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("relativeProjectSerialno",PJSerialNo);
        criteria.andEqualTo("relativeProjectTaskno",PJTaskNo);


        return  rdBatchTaskMapper.selectOneByExample(example);
    }
}
