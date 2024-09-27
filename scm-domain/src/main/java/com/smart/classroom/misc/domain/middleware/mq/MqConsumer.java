package com.smart.classroom.misc.domain.middleware.mq;

/**
 * MQ消息订阅
 *
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/27 15:56
 **/
public interface MqConsumer {

    /**
     * 监听某个"领域"下的某个"事件"消息。
     *
     * @param eventName 事件由 领域名前缀+事件构成. 需要上下游约定产出。
     */
    void listen(String eventName, MqConsumerListener listener);
}
