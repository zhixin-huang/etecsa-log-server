package com.etecsa.log.start.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.etecsa.log.start.domain.LogRecordDto;
import com.etecsa.log.start.domain.LogRecordListDto;
import com.etecsa.log.start.domain.LogRecordVo;
import com.etecsa.log.start.mapper.EtecsaLogRecordMapper;
import com.etecsa.log.start.model.EtecsaLogRecord;
import com.etecsa.log.start.service.EtecsaLogRecordService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

/**
 * @author zhixin.huang
 * @date 2020/7/13 10:08 上午
 */
@Service
public class EtecsaLogRecordServiceImpl implements EtecsaLogRecordService {

    @Resource
    private EtecsaLogRecordMapper etecsaLogRecordMapper;

    @Override
    public boolean save(LogRecordDto logRecordDto) {
        EtecsaLogRecord etecsaLogRecord = new EtecsaLogRecord();
        BeanUtils.copyProperties(logRecordDto, etecsaLogRecord);
        return etecsaLogRecordMapper.insert(etecsaLogRecord) > 0;
    }

    @Override
    public Page<LogRecordVo> list(LogRecordListDto logRecordListDto) {
        QueryWrapper<EtecsaLogRecord> queryWrapper = new QueryWrapper<>();
        if (StringUtils.isNotBlank(logRecordListDto.getServerName())) {
            queryWrapper.eq("SERVER_NAME", logRecordListDto.getServerName());
        }
        if (StringUtils.isNotBlank(logRecordListDto.getServerInstance())) {
            queryWrapper.like("SERVER_INSTANCE", logRecordListDto.getServerInstance());
        }
        if (StringUtils.isNotBlank(logRecordListDto.getServerMethod())) {
            queryWrapper.like("SERVER_METHOD", logRecordListDto.getServerMethod());
        }
        if (StringUtils.isNotBlank(logRecordListDto.getOperatorId())) {
            queryWrapper.eq("OPERATOR_ID", logRecordListDto.getOperatorId());
        }
        if (StringUtils.isNotBlank(logRecordListDto.getOperatorIp())) {
            queryWrapper.like("OPERATOR_IP", logRecordListDto.getOperatorIp());
        }
        if (StringUtils.isNotBlank(logRecordListDto.getOperatorName())) {
            queryWrapper.like("OPERATOR_NAME", logRecordListDto.getOperatorName());
        }
        if (StringUtils.isNotBlank(logRecordListDto.getOperatedMould())) {
            queryWrapper.like("OPERATED_MOULD", logRecordListDto.getOperatedMould());
        }
        if (StringUtils.isNotBlank(logRecordListDto.getOperatedType())) {
            queryWrapper.like("OPERATED_TYPE", logRecordListDto.getOperatedType());
        }
        if (Objects.nonNull(logRecordListDto.getStartTime())) {
            queryWrapper.ge("CREATED_TIME", logRecordListDto.getStartTime());
        }
        if (Objects.nonNull(logRecordListDto.getEndTime())) {
            queryWrapper.le("CREATED_TIME", logRecordListDto.getEndTime());
        }

        List<LogRecordVo> list = etecsaLogRecordMapper.page((logRecordListDto.getPageNo() - 1) * logRecordListDto.getPageSize(), logRecordListDto.getPageSize(), queryWrapper);

        return null;
    }
}
