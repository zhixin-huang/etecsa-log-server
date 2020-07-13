package com.etecsa.log.start.domain;

import com.etecsa.log.start.message.ErrorCodeAndMsg;
import com.etecsa.log.start.message.SystemException;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author zhixin.huang
 * @date 2020/7/8 4:55 下午
 */
@Data
@ApiModel("分页")
public class PageQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("当前页")
    private Long pageNo;

    @ApiModelProperty("每页显示数")
    private Long pageSize;

    public static void pageParamCheck(Long pageNo, Long pageSize) {
        if (Objects.isNull(pageNo)) {
            throw new SystemException(ErrorCodeAndMsg.PAGE_NO_ISNOT_NULL);
        }
        if (Objects.isNull(pageSize)) {
            throw new SystemException(ErrorCodeAndMsg.PAGE_SIZE_ISNOT_NULL);
        }
    }
}
