package com.smart.classroom.misc.domain.rpc.subscription;

import com.smart.classroom.misc.domain.rpc.subscription.vo.SubscriptionVO;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/29 17:37
 **/
public interface SubscriptionWriteFacadeClient {

    /**
     * 支付成功消息补偿。
     */
    SubscriptionVO compensatePaymentPaid(long paymentId);

}
