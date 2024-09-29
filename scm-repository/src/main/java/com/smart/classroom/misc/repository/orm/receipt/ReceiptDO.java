package com.smart.classroom.misc.repository.orm.receipt;

import com.smart.classroom.misc.domain.biz.receipt.enums.ReceiptMethod;
import com.smart.classroom.misc.repository.orm.base.BaseEntityDO;
import lombok.*;

/**
 * 收款单，作者从平台收款的单据
 *
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/29 13:51
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ReceiptDO extends BaseEntityDO {

    /**
     * 订单编号
     */
    private String orderNo = null;

    /**
     * 收款方式 ALIPAY/WEIXIN 支付宝/微信
     */
    private ReceiptMethod method = ReceiptMethod.ALIPAY;

    /**
     * 收款平台订单号
     */
    private String thirdTransactionNo = null;

    /**
     * 金额(单位：分)
     */
    private Long amount = null;

    /**
     * 支付状态 UNPAID/PAID/CLOSED 未收款/已收款/已关闭
     */
    private String status = "UNPAID";


}