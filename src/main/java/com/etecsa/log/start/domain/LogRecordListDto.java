package com.etecsa.log.start.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author zhixin.huang
 * @date 2020/7/13 10:10 上午
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class LogRecordListDto extends PageQuery implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("服务名")
    private String serverName;

    @ApiModelProperty("实例编号")
    private String serverInstance;

    @ApiModelProperty("调用方法")
    private String serverMethod;

    @ApiModelProperty("操作人id")
    private String operatorId;

    @ApiModelProperty("操作人ip")
    private String operatorIp;

    @ApiModelProperty("操作人姓名")
    private String operatorName;

    @ApiModelProperty("操作类型")
    private String operatedType;

    @ApiModelProperty("操作模块")
    private String operatedMould;

    @ApiModelProperty("操作内容")
    private String content;

    @ApiModelProperty("开始时间")
    private LocalDateTime startTime;

    @ApiModelProperty("结束时间")
    private LocalDateTime endTime;
}
