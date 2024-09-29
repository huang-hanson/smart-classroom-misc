package com.smart.classroom.misc.repository.impl.payment.converter;

import com.smart.classroom.misc.domain.biz.payment.model.PaymentModel;
import com.smart.classroom.misc.repository.orm.payment.PaymentDO;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/29 15:30
 **/
public class PaymentDO2ModelConverter {

    /**
     * 将DO转换成模型
     */
    public static PaymentModel convert(PaymentDO paymentDO) {
        if (paymentDO == null) {
            return null;
        }

        return PaymentModel.builder()
                .id(paymentDO.getId())
                .createTime(paymentDO.getCreateTime())
                .updateTime(paymentDO.getUpdateTime())
                .orderNo(paymentDO.getOrderNo())
                .method(paymentDO.getMethod())
                .thirdTransactionNo(paymentDO.getThirdTransactionNo())
                .amount(paymentDO.getAmount())
                .status(paymentDO.getStatus())
                .build();
    }


}