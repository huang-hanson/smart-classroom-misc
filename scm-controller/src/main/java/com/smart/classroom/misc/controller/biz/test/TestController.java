package com.smart.classroom.misc.controller.biz.test;

import com.smart.classroom.misc.controller.auth.Feature;
import com.smart.classroom.misc.controller.auth.FeatureType;
import com.smart.classroom.misc.controller.base.BaseController;
import com.smart.classroom.misc.controller.base.result.WebResult;
import com.smart.classroom.misc.domain.middleware.mq.MqConsumer;
import com.smart.classroom.misc.domain.middleware.mq.MqProducer;
import com.smart.classroom.misc.domain.middleware.mq.info.MqSendResultInfo;
import com.smart.classroom.misc.utility.util.StringUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/27 15:54
 **/
@Slf4j
@RestController
@RequestMapping("/api/test")
public class TestController extends BaseController {

    @Resource
    MqProducer mqProducer;

    @Resource
    MqConsumer mqConsumer;

    @Feature({FeatureType.PUBLIC})
    @RequestMapping("/mq/send")
    public WebResult<?> mqSend(
            @RequestParam String content
    ) {
        MqSendResultInfo mqSendResultInfo = mqProducer.send("HELLO_EVENT", StringUtil.uuid(), content);

        String result = content + "" + StringUtil.format("消息发送情况：{} {}", mqSendResultInfo.isSuccess(), mqSendResultInfo.getMessageId());

        log.info(result);

        return success(result);
    }


}