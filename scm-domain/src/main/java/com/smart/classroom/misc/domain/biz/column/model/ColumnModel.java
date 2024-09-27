package com.smart.classroom.misc.domain.biz.column.model;

import com.smart.classroom.misc.domain.biz.column.enums.ColumnStatus;
import lombok.*;

import java.util.Date;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/27 17:48
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ColumnModel {

    /**
     * 主键
     */
    private Long id = null;

    /**
     * 创建时间
     */
    private Date createTime = null;

    /**
     * 修改时间
     */
    private Date updateTime = null;

    /**
     * 专栏名称
     */
    private String name = null;

    /**
     * 作者id
     */
    private Long authorId = null;

    /**
     * 状态 NEW/OK/DISABLED 未发布/已生效/已禁用
     */
    private ColumnStatus status = ColumnStatus.NEW;


}