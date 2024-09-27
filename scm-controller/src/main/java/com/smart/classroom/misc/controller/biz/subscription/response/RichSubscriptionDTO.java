package com.smart.classroom.misc.controller.biz.subscription.response;

import com.smart.classroom.misc.facade.biz.column.response.ColumnDTO;
import com.smart.classroom.misc.facade.biz.reader.response.ReaderDTO;
import com.smart.classroom.subscription.facade.biz.order.response.OrderDTO;
import com.smart.classroom.subscription.facade.biz.subscription.response.SubscriptionDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/27 15:15
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RichSubscriptionDTO {
    /**
     * 订阅本身
     */
    private SubscriptionDTO subscription = null;

    /**
     * 专栏
     */
    private ColumnDTO column = null;


    /**
     * 读者
     */
    private ReaderDTO reader = null;


    /**
     * 关联的作者
     */
    private OrderDTO order = null;
}