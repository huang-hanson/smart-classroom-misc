package com.smart.classroom.misc.domain.biz.contract.model;

import com.smart.classroom.misc.domain.biz.contract.enums.ContractStatus;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/27 17:56
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ContractModel {

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
     * 名称
     */
    private String name = null;

    /**
     * 内容
     */
    private String content = null;

    /**
     * 专栏id
     */
    private Long columnId = null;

    /**
     * 作者id
     */
    private Long authorId = null;

    /**
     * 状态 NEW/OK/DISABLED 未生效/已生效/已禁用
     */
    private ContractStatus status = ContractStatus.NEW;

    /**
     * 分成比例
     */
    private BigDecimal percentage = null;

    /**
     * 账期日
     */
    private String paymentDay = null;


}