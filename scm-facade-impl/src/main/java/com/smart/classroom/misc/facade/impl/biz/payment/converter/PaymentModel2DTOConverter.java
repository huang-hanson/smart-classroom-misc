package com.smart.classroom.misc.facade.impl.biz.payment.converter;

import com.smart.classroom.misc.domain.biz.payment.enums.PayMethod;
import com.smart.classroom.misc.domain.biz.payment.enums.PayStatus;
import com.smart.classroom.misc.domain.biz.payment.model.PaymentModel;
import com.smart.classroom.misc.facade.biz.payment.response.PaymentDTO;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/29 18:15
 **/
public class PaymentModel2DTOConverter {

    /**
     * 将DO转换成模型
     */
    public static PaymentDTO convert(PaymentModel paymentModel) {
        if (paymentModel == null) {
            return null;
        }

        PaymentDTO paymentDTO = PaymentDTO.builder()
                .id(paymentModel.getId())
                .createTime(paymentModel.getCreateTime())
                .updateTime(paymentModel.getUpdateTime())
                .orderNo(paymentModel.getOrderNo())
                .method(PayMethod.toString(paymentModel.getMethod()))
                .thirdTransactionNo(paymentModel.getThirdTransactionNo())
                .amount(paymentModel.getAmount())
                .status(PayStatus.toString(paymentModel.getStatus()))

                .build();

        return paymentDTO;
    }


}