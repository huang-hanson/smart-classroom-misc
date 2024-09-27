package com.smart.classroom.misc.domain.biz.payment.repository;

import com.smart.classroom.misc.domain.biz.payment.model.PaymentModel;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/27 18:20
 **/
public interface PaymentRepository {

    PaymentModel queryByOrderNo(String orderNo);

    PaymentModel queryById(long id);

    PaymentModel insert(PaymentModel paymentModel);

    PaymentModel updateStatus(PaymentModel paymentModel);
}
