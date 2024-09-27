package com.smart.classroom.misc.facade.biz.payment;

import com.smart.classroom.misc.facade.biz.payment.response.PaymentDTO;
import com.smart.classroom.misc.facade.biz.payment.response.PreparePaymentDTO;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/27 14:45
 **/
public interface PaymentReadFacade {

    PaymentDTO queryById(long paymentId);

    /**
     * 获取一个支付单对应的支付准备物料等信息。
     */
    PreparePaymentDTO prepare(long paymentId);
}
