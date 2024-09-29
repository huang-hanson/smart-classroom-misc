package com.smart.classroom.misc.facade.impl.biz.payment.converter;

import com.smart.classroom.misc.domain.biz.payment.info.PreparePaymentInfo;
import com.smart.classroom.misc.facade.biz.payment.response.PreparePaymentDTO;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/29 18:15
 **/
public class PreparePaymentInfo2DTOConverter {

    /**
     * 将DO转换成模型
     */
    public static PreparePaymentDTO convert(PreparePaymentInfo preparePaymentInfo) {
        if (preparePaymentInfo == null) {
            return null;
        }

        PreparePaymentDTO preparePaymentDTO = PreparePaymentDTO.builder()
                .paymentDTO(PaymentModel2DTOConverter.convert(preparePaymentInfo.getPaymentModel()))
                .thirdTransactionNo(preparePaymentInfo.getThirdTransactionNo())
                .nonceStr(preparePaymentInfo.getNonceStr())
                .build();

        return preparePaymentDTO;
    }


}