package com.rd.batch.controller;

import com.rd.batch.pojo.PutoutPaybackSubsidyInfo;
import com.rd.batch.pojo.RdBatchProject;
import com.rd.batch.pojo.RdBatchTask;
import com.rd.batch.service.PPSubsidyService;
import com.rd.batch.service.RdBatchProjectService;
import com.rd.batch.service.RdBatchTaskService;
import com.rd.batch.utils.RDBATCHJSONResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author
 * @create 2020-09-10-8:47
 */
@Api(value = "贷还款补贴相关",tags = {"贷还款补贴相关的api接口"})
@RestController
@RequestMapping("PPSubsidy")
public class PPSubsidyController extends  BaseController {

    @Autowired
    private PPSubsidyService ppSubsidyService;

    @Autowired
    private RdBatchTaskService rdBatchTaskService;

    @Autowired
    private RdBatchProjectService rdBatchProjectService;


    @ApiOperation(value = "贷还款补贴批次",notes = "贷还款补贴批次",httpMethod = "POST")
    @PostMapping("/autoUpdatePPkSubsidy")
    public RDBATCHJSONResult autoUpdatePPkSubsidy(
            @ApiParam(name = "batchDate",value = "批次日期",required = true)
            @RequestParam String batchDate,
            @ApiParam(name = "PJSerialNo",value = "批次计划流水号",required = true)
            @RequestParam int PJSerialNo,
            @ApiParam(name = "PJTaskNo",value = "批次计划任务号",required = true)
            @RequestParam int PJTaskNo){


        //1.判断日期不能为空
        if (StringUtils.isBlank(batchDate)) {
            return RDBATCHJSONResult.errorMsg("批次日期不能为空");
        }

        //2.查询流水号和任务号对应的批次计划是否存在
        RdBatchProject rdBatchProject = rdBatchProjectService.queryBatchProject(PJSerialNo,PJTaskNo);
        if (rdBatchProject == null){
            return RDBATCHJSONResult.errorMsg("该批次计划不存在，请创建！");
        }

        //3.查询该日期的任务批次是否存在，不存在则新增
        RdBatchTask rdBatchTask = rdBatchTaskService.queryBatchTask(batchDate,PJSerialNo,PJTaskNo);
        if (rdBatchTask == null){
            rdBatchTask =  rdBatchTaskService.crateBatchTask(batchDate,PJSerialNo,PJTaskNo);

            if (rdBatchTask == null){

                return  RDBATCHJSONResult.errorMsg("通用批次任务创建失败！");
            }
        }

        //2.执行贷还款补贴批次任务
        ppSubsidyService.updatePutoutPaybackSubsidy(batchDate,PJSerialNo,PJTaskNo);

       return  RDBATCHJSONResult.ok();
    }

    @ApiOperation(value = "贷还款补贴查询",notes = "根据日期查询贷还款补贴",httpMethod = "GET")
    @GetMapping("/queryByDate")
    public RDBATCHJSONResult queryByDate(
            @ApiParam(name = "batchDate",value = "批次日期",required = true)
            @RequestParam  String batchDate){

        //1.判断日期不能为空
        if (StringUtils.isBlank(batchDate)) {
            return RDBATCHJSONResult.errorMsg("批次日期不能为空");
        }

        List<PutoutPaybackSubsidyInfo> result = ppSubsidyService.queryPPSubsidy(batchDate);

        return  RDBATCHJSONResult.ok(result);
    }
}
