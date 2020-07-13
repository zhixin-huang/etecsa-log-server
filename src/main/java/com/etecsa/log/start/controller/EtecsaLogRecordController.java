package com.etecsa.log.start.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.etecsa.log.start.domain.LogRecordDto;
import com.etecsa.log.start.domain.LogRecordListDto;
import com.etecsa.log.start.domain.LogRecordVo;
import com.etecsa.log.start.message.RestResponse;
import com.etecsa.log.start.service.EtecsaLogRecordService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import static com.etecsa.log.start.domain.PageQuery.pageParamCheck;

/**
 * @author zhixin.huang
 * @date 2020/7/13 9:58
 */
@RestController
@RequestMapping(value = "/record")
@Api(value = "record", tags = "日志记录控制器")
public class EtecsaLogRecordController {

    @Resource
    private EtecsaLogRecordService etecsaLogRecordServiceImpl;

    @PostMapping("/save")
    @ApiOperation(httpMethod = "POST", value = "新增日志记录")
    public RestResponse<Boolean> save(@RequestBody LogRecordDto logRecordDto) {
        return RestResponse.success(etecsaLogRecordServiceImpl.save(logRecordDto));
    }


    @PostMapping("/evaluate/list")
    @ApiOperation(httpMethod = "POST", value = "日志记录分页列表")
    public RestResponse<Page<LogRecordVo>> listEvaluate(@RequestBody LogRecordListDto logRecordListDto) {
        pageParamCheck(logRecordListDto.getPageNo(), logRecordListDto.getPageSize());
        return RestResponse.success(etecsaLogRecordServiceImpl.list(logRecordListDto));
    }
}
