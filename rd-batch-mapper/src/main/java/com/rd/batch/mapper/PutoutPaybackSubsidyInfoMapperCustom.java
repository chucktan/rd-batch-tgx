package com.rd.batch.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author
 * @create 2020-09-09-15:26
 */
@Component
public interface PutoutPaybackSubsidyInfoMapperCustom {


    public void getPutoutPaybackSubsidy(@Param("paramsMap") Map<String,Object> map);
}
