package com.smart.classroom.misc.domain.thirdparty.pay.info;

import lombok.*;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/27 18:24
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ThirdpartyPayInfo {

    /**
     * 订单号
     */
    String orderNo;

    /**
     * 支付的一些token及信息
     */
    String thirdTransactionNo;

    /**
     * 支付时候的验证信息等。
     */
    String nonceStr;


}