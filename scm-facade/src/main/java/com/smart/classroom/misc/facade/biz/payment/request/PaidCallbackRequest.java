package com.smart.classroom.misc.facade.biz.payment.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/27 11:03
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaidCallbackRequest implements Serializable {

    /**
     * 订单编号
     */
    private String orderNo = null;


}