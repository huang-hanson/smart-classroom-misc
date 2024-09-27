package com.smart.classroom.misc.facade.biz.payment.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/27 11:05
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaidCallbackDTO implements Serializable {

    /**
     * 状态
     */
    String code;

    /**
     * 消息
     */
    String msg;

}