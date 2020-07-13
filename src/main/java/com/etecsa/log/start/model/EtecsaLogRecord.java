package com.etecsa.log.start.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * Table: etecsa_log_record
 *
 * @author zhixin.huang
 * @date 2020/07/13
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@TableName("etecsa_log_record")
public class EtecsaLogRecord extends Model<EtecsaLogRecord> {
    /**
     * 主键
     */
    @TableId(value = "ID", type = IdType.INPUT)
    private String id;

    /**
     * 服务名
     */
    @TableField(value = "SERVER_NAME")
    private String serverName;

    /**
     * 实例编号
     */
    @TableField(value = "SERVER_INSTANCE")
    private String serverInstance;

    /**
     * 调用方法
     */
    @TableField(value = "SERVER_METHOD")
    private String serverMethod;

    /**
     * 操作人id
     */
    @TableField(value = "OPERATOR_ID")
    private String operatorId;

    /**
     * 操作人ip
     */
    @TableField(value = "OPERATOR_IP")
    private String operatorIp;

    /**
     * 操作人姓名
     */
    @TableField(value = "OPERATOR_NAME")
    private String operatorName;

    /**
     * 操作类型
     */
    @TableField(value = "OPERATED_TYPE")
    private String operatedType;

    /**
     * 操作模块
     */
    @TableField(value = "OPERATED_MOULD")
    private String operatedMould;

    /**
     * 操作内容
     */
    @TableField(value = "CONTENT")
    private String content;

    /**
     * 请求参数
     */
    @TableField(value = "REQUEST_PARAM")
    private String requestParam;

    /**
     * 备注
     */
    @TableField(value = "REMARK")
    private String remark;

    /**
     * 乐观锁
     */
    @TableField(value = "REVISION")
    private Integer revision;

    /**
     * 创建人
     */
    @TableField(value = "CREATED_BY")
    private String createdBy;

    /**
     * 创建时间
     */
    @TableField(value = "CREATED_TIME")
    private LocalDateTime createdTime;

    /**
     * 更新人
     */
    @TableField(value = "UPDATED_BY")
    private String updatedBy;

    /**
     * 更新时间
     */
    @TableField(value = "UPDATED_TIME")
    private LocalDateTime updatedTime;

    private static final long serialVersionUID = 1L;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
