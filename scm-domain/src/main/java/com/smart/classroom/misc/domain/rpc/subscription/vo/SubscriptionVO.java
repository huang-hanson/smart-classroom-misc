package com.smart.classroom.misc.domain.rpc.subscription.vo;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * @author hanson.huang
 * @version V1.0
 * @ClassName SubscriptionVO
 * @Description TODO
 * @date 2024/9/29 17:36
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SubscriptionVO implements Serializable {

    /**
     * 主键
     */
    private Long id;

    /**
     * 创建时间
     */
    private Date createTime = null;

    /**
     * 修改时间
     */
    private Date updateTime = null;

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

}