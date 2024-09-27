package com.smart.classroom.misc.facade.biz.payment.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/27 11:06
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PreparePaymentDTO implements Serializable {

    /**
     * 支付单
     */
    PaymentDTO paymentDTO;

    /**
     * 支付的一些token及信息
     */
    String thirdTransactionNo;

    /**
     * 支付时候的验证信息等。
     */
    String nonceStr;

}