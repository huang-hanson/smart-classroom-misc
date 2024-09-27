package com.smart.classroom.misc.domain.biz.payment.info;

import lombok.*;

import java.io.Serializable;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/27 18:11
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaidCallbackInfo implements Serializable {

    /**
     * 状态
     */
    String code;

    /**
     * 消息
     */
    String msg;

}