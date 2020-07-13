package com.etecsa.log.start.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.etecsa.feign.log.domin.LogRecordDto;
import com.etecsa.feign.log.domin.LogRecordListDto;
import com.etecsa.feign.log.domin.LogRecordVo;
import com.etecsa.feign.log.fegin.EtecsaLogRecordFeign;
import com.etecsa.feign.log.message.RestResponse;
import com.etecsa.log.start.constant.LogConstant;
import com.etecsa.log.start.message.ErrorCodeAndMsg;
import com.etecsa.log.start.service.EtecsaLogRecordService;
import com.etecsa.log.start.tools.RestUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Objects;


/**
 * @author zhixin.huang
 * @date 2020/7/13 9:58
 */
@RestController
@Api(value = "record", tags = "日志记录控制器")
public class EtecsaLogRecordController  implements EtecsaLogRecordFeign {

    @Resource
    private EtecsaLogRecordService etecsaLogRecordServiceImpl;


    @Override
    @ApiOperation(httpMethod = "POST", value = "新增日志记录")
    public RestResponse<Boolean> save(LogRecordDto logRecordDto) {
        if (StringUtils.isBlank(logRecordDto.getServerName()) || logRecordDto.getServerName().length() > LogConstant.FIELD_LENGTH){
            return RestUtil.fail(ErrorCodeAndMsg.SERVER_NAME_ERROR);
        }
        if (StringUtils.isBlank(logRecordDto.getServerInstance()) || logRecordDto.getServerInstance().length() > LogConstant.FIELD_LENGTH){
            return RestUtil.fail(ErrorCodeAndMsg.SERVER_INSTANCE_ERROR);
        }
        if (StringUtils.isBlank(logRecordDto.getServerMethod())){
            return RestUtil.fail(ErrorCodeAndMsg.SERVER_METHOD_NOT_NULL);
        }
        if (StringUtils.isBlank(logRecordDto.getOperatorId()) || logRecordDto.getOperatorId().length() > LogConstant.ID_FIELD_LENGTH){
            return RestUtil.fail(ErrorCodeAndMsg.OPERATOR_ID_ERROR);
        }
        if (StringUtils.isBlank(logRecordDto.getOperatorName()) || logRecordDto.getServerName().length() > LogConstant.FIELD_LENGTH){
            return RestUtil.fail(ErrorCodeAndMsg.OPERATOR_NAME_ERROR);
        }
        if (StringUtils.isBlank(logRecordDto.getOperatedType()) || logRecordDto.getOperatedType().length() > LogConstant.FIELD_LENGTH){
            return RestUtil.fail(ErrorCodeAndMsg.OPERATOR_TYPE_ERROR);
        }
        if (StringUtils.isBlank(logRecordDto.getOperatedMould()) || logRecordDto.getOperatedMould().length() > LogConstant.FIELD_LENGTH){
            return RestUtil.fail(ErrorCodeAndMsg.OPERATOR_MOULD_ERROR);
        }
        return RestResponse.success(etecsaLogRecordServiceImpl.save(logRecordDto));
    }

    @Override
    @ApiOperation(httpMethod = "POST", value = "日志记录分页列表")
    public RestResponse<Page<LogRecordVo>> listEvaluate(LogRecordListDto logRecordListDto) {
        if (Objects.isNull(logRecordListDto.getPageNo())) {
            return RestUtil.fail(ErrorCodeAndMsg.PAGE_NO_ISNOT_NULL);
        }
        if (Objects.isNull(logRecordListDto.getPageSize())) {
            return RestUtil.fail(ErrorCodeAndMsg.PAGE_SIZE_ISNOT_NULL);
        }
        return RestResponse.success(etecsaLogRecordServiceImpl.list(logRecordListDto));
    }
}
