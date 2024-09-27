package com.smart.classroom.misc.domain.middleware.mq.info;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/27 15:58
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MqConsumeResultInfo {
    /**
     * mq消费是否成功
     */
    private boolean success;

    /**
     * 消费的消息id
     */
    private String messageId;

    /**
     * 如果消费失败，错误消息是什么
     */
    private String msg;
}