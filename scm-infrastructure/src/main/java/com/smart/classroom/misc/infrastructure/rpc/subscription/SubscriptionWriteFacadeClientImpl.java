package com.smart.classroom.misc.infrastructure.rpc.subscription;

import com.smart.classroom.misc.domain.rpc.subscription.SubscriptionWriteFacadeClient;
import com.smart.classroom.misc.domain.rpc.subscription.vo.SubscriptionVO;
import com.smart.classroom.misc.infrastructure.rpc.subscription.converter.SubscriptionDTO2VOConverter;
import com.smart.classroom.subscription.facade.biz.subscription.SubscriptionWriteFacade;
import com.smart.classroom.subscription.facade.biz.subscription.response.SubscriptionDTO;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/30 10:55
 **/
@Service
public class SubscriptionWriteFacadeClientImpl implements SubscriptionWriteFacadeClient {

    @DubboReference
    SubscriptionWriteFacade subscriptionWriteFacade;

    @Override
    public SubscriptionVO compensatePaymentPaid(long paymentId) {
        SubscriptionDTO subscriptionDTO = subscriptionWriteFacade.compensatePaymentPaid(paymentId);

        return SubscriptionDTO2VOConverter.convert(subscriptionDTO);
    }
}