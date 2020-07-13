package com.etecsa.log.start.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.etecsa.feign.log.domin.LogRecordVo;
import com.etecsa.log.start.model.EtecsaLogRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author zhixin.huang
 * @date 2020/07/13
 */
@Mapper
public interface EtecsaLogRecordMapper extends BaseMapper<EtecsaLogRecord> {

    List<LogRecordVo> page(Long pageNo, Long pageSize, QueryWrapper<EtecsaLogRecord> queryWrapper);
}
