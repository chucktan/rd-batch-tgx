package com.rd.batch.service.impl;

import com.rd.batch.mapper.RdBatchProjectMapper;
import com.rd.batch.pojo.Bo.RdBatchProjectBo;
import com.rd.batch.pojo.RdBatchProject;
import com.rd.batch.service.RdBatchProjectService;
import com.rd.batch.utils.DateUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @author
 * @create 2020-09-16-15:05
 */

@Service
public class RdBatchProjectServiceImpl implements RdBatchProjectService {

    @Autowired
    private RdBatchProjectMapper rdBatchProjectMapper;

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public RdBatchProject crateBatchProject(RdBatchProjectBo rdBatchProjectBo) {
        RdBatchProject rdBatchProject = new RdBatchProject();
        BeanUtils.copyProperties(rdBatchProject,rdBatchProjectBo);

        rdBatchProject.setCreatedBy("admin");
        rdBatchProject.setCreatedTime(DateUtil.dateToString(new Date(),"yyyyMMdd"));
        rdBatchProject.setUpdatedBy("admin");
        rdBatchProject.setUpdatedTime(DateUtil.dateToString(new Date(),"yyyyMMdd"));

        rdBatchProjectMapper.insert(rdBatchProject);

        return  rdBatchProject;
    }


    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public RdBatchProject updateBatchProject(RdBatchProjectBo rdBatchProjectBo) {
        RdBatchProject rdBatchProject = new RdBatchProject();
        BeanUtils.copyProperties(rdBatchProject,rdBatchProjectBo);

        rdBatchProject.setUpdatedBy("admin");
        rdBatchProject.setUpdatedTime(DateUtil.dateToString(new Date(),"yyyyMMdd"));
        rdBatchProjectMapper.updateByPrimaryKey(rdBatchProject);

        return rdBatchProject;

    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public RdBatchProject queryBatchProject(int serialNo, int taskNo) {

        RdBatchProject rdBatchProject = new RdBatchProject();
        rdBatchProject.setSerialno(serialNo);
        rdBatchProject.setTaskno(taskNo);

        return  rdBatchProjectMapper.selectOne(rdBatchProject);

    }


    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public boolean deleteBatchProject(int serialNo, int taskNo) {

        RdBatchProject rdBatchProject = new RdBatchProject();
        rdBatchProject.setSerialno(serialNo);
        rdBatchProject.setTaskno(taskNo);
        int result =  rdBatchProjectMapper.delete(rdBatchProject);

        return result==1?true:false;
    }
}
