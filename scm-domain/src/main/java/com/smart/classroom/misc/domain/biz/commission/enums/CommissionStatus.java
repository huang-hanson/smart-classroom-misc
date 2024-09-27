package com.smart.classroom.misc.domain.biz.commission.enums;

import lombok.Getter;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/27 17:35
 **/
@Getter
public enum CommissionStatus {

    CREATED("未收款"),
    RECEIVED("已收款"),
    CANCELED("已取消"),
    CLOSED("已关闭");


    private final String description;

    CommissionStatus(String description) {
        this.description = description;
    }

}