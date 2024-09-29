package com.smart.classroom.misc.repository.orm.contract;

import com.smart.classroom.misc.domain.biz.contract.enums.ContractStatus;
import com.smart.classroom.misc.repository.orm.base.BaseEntityDO;
import lombok.*;

import java.math.BigDecimal;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/29 13:37
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ContractDO extends BaseEntityDO {

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