package com.smart.classroom.misc.domain.thirdparty.pay;

import com.smart.classroom.misc.domain.biz.payment.model.PaymentModel;
import com.smart.classroom.misc.domain.thirdparty.pay.info.ThirdpartyPayInfo;

/**
 * 第三方支付服务
 *
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/27 18:23
 **/
public interface ThirdpartyPayClient {

    /**
     * 向第三方支付机构下单
     */
    ThirdpartyPayInfo createOrder(PaymentModel paymentModel);


    /**
     * 根据平台订单信息，查询到在第三方机构的订单信息。
     * 可能返回null.
     */
    ThirdpartyPayInfo queryOrder(PaymentModel paymentModel);

}
