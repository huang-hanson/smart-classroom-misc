package com.smart.classroom.misc.infrastructure.rpc.subscription.converter;

import com.smart.classroom.misc.domain.rpc.subscription.vo.SubscriptionVO;
import com.smart.classroom.subscription.facade.biz.subscription.response.SubscriptionDTO;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/30 10:55
 **/
public class SubscriptionDTO2VOConverter {

    /**
     * 将DO转换成模型
     */
    public static SubscriptionVO convert(SubscriptionDTO subscriptionDTO) {
        if (subscriptionDTO == null) {
            return null;
        }


        return SubscriptionVO.builder()
                .id(subscriptionDTO.getId())
                .createTime(subscriptionDTO.getCreateTime())
                .updateTime(subscriptionDTO.getUpdateTime())
                .readerId(subscriptionDTO.getReaderId())
                .columnId(subscriptionDTO.getColumnId())
                .orderId(subscriptionDTO.getOrderId())

                .status(subscriptionDTO.getStatus())

                .build();
    }


}