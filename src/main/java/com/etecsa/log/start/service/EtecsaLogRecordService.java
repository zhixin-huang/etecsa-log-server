package com.etecsa.log.start.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.etecsa.log.start.domain.LogRecordDto;
import com.etecsa.log.start.domain.LogRecordListDto;
import com.etecsa.log.start.domain.LogRecordVo;

/**
 * @author zhixin.huang
 * @date 2020/7/13 10:07 上午
 */
public interface EtecsaLogRecordService {

    boolean save(LogRecordDto logRecordDto);

    Page<LogRecordVo> list(LogRecordListDto logRecordListDto);
}
