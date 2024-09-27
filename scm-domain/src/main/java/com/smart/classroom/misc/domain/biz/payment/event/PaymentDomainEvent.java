package com.smart.classroom.misc.domain.biz.payment.event;

import lombok.Getter;

/**
 * 定义领域事件类型。
 *
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/27 18:11
 **/
@Getter
public enum PaymentDomainEvent {

    PAYMENT_DOMAIN_EVENT_PAID("已支付");


    private final String description;

    PaymentDomainEvent(String description) {
        this.description = description;
    }


    public static String toString(PaymentDomainEvent status) {
        if (status == null) {
            return null;
        }
        return status.name();
    }

    public static PaymentDomainEvent toEnum(String s) {
        if (s == null) {
            return null;
        }
        return PaymentDomainEvent.valueOf(s);
    }


}