package com.rd.batch.service;

import com.rd.batch.pojo.PutoutPaybackSubsidyInfo;

import java.util.List;

/**
 * @author
 * @create 2020-09-09-14:19
 */
public interface PPSubsidyService {

    /**
     * 更新贷还款补贴信息（日）
     * @param  batchDate
     * @param  PJSerialNo
     * @param  PJTaskNo
     */
    public void updatePutoutPaybackSubsidy(String batchDate,int PJSerialNo,int PJTaskNo);

    /**
     * 根据日期查询贷还款补贴信息
     * @param  batchDate
     * @return
     */
    public List<PutoutPaybackSubsidyInfo> queryPPSubsidy(String batchDate);
}
