package com.smart.classroom.misc.repository.orm.payment;

import com.smart.classroom.misc.domain.biz.payment.enums.PayMethod;
import com.smart.classroom.misc.domain.biz.payment.enums.PayStatus;
import com.smart.classroom.misc.repository.orm.base.BaseEntityDO;
import lombok.*;

/**
 * 支付单，用户支付给平台的单据
 *
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/29 13:48
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class PaymentDO extends BaseEntityDO {

    /**
     * 订单编号
     */
    private String orderNo = null;

    /**
     * 支付方式 ALIPAY/WEIXIN 支付宝/微信
     */
    private PayMethod method = PayMethod.ALIPAY;

    /**
     * 支付平台订单号
     */
    private String thirdTransactionNo = null;

    /**
     * 金额(单位：分)
     */
    private Long amount = null;

    /**
     * 支付状态 UNPAID/PAID/CLOSED 未支付/已支付/已关闭
     */
    private PayStatus status = PayStatus.UNPAID;

}