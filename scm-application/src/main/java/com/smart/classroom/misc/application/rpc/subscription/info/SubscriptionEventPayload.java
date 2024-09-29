package com.smart.classroom.misc.application.rpc.subscription.info;

import lombok.*;

import java.util.Date;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/29 17:42
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SubscriptionEventPayload {

    /**
     * 读者id
     */
    private Long readerId = null;

    /**
     * 专栏id
     */
    private Long columnId = null;

    /**
     * 订单id
     */
    private Long orderId = null;

    /**
     * 状态 CREATED/OK/DISABLED
     */
    private String status = null;

    /**
     * 时间
     */
    private Date occurTime = null;

}