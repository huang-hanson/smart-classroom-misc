package com.smart.classroom.misc.domain.biz.receipt.enums;

import lombok.Getter;

@Getter
public enum ReceiptMethod {

    ALIPAY("支付宝"),
    WEIXIN("微信");


    private final String description;

    ReceiptMethod(String description) {
        this.description = description;
    }

}
