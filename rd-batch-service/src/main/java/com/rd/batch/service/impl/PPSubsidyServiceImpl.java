package com.rd.batch.service.impl;

import com.rd.batch.mapper.PutoutPaybackSubsidyInfoMapper;
import com.rd.batch.mapper.PutoutPaybackSubsidyInfoMapperCustom;
import com.rd.batch.pojo.PutoutPaybackSubsidyInfo;
import com.rd.batch.service.PPSubsidyService;
import com.rd.batch.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author
 * @create 2020-09-09-14:23
 */
@Service
public class PPSubsidyServiceImpl implements PPSubsidyService {

    @Autowired
    private PutoutPaybackSubsidyInfoMapperCustom putoutPaybackSubsidyInfoMapperCustom;

    @Autowired
    private PutoutPaybackSubsidyInfoMapper putoutPaybackSubsidyInfoMapper;


    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void updatePutoutPaybackSubsidy(String batchDate,int PJSerialNo,int PJTaskNo) {

        Map<String,Object> map = new HashMap<>();
        map.put("batchDate", DateUtil.stringToDate(batchDate,"yyyyMMdd"));
        map.put("PJSerialNo", PJSerialNo);
        map.put("PJTaskNo", PJTaskNo);
        putoutPaybackSubsidyInfoMapperCustom.getPutoutPaybackSubsidy(map);

    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<PutoutPaybackSubsidyInfo> queryPPSubsidy(String batchDate) {

        Example ppSubsidyExp = new Example(PutoutPaybackSubsidyInfo.class);
        Example.Criteria criteria = ppSubsidyExp.createCriteria();
        criteria.andEqualTo("createdTime",batchDate);

        return putoutPaybackSubsidyInfoMapper.selectByExample(ppSubsidyExp);

    }
}
