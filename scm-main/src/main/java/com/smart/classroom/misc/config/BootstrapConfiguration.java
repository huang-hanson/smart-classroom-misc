package com.smart.classroom.misc.config;

import com.smart.classroom.misc.utility.util.StringUtil;

/**
 * 启动配置
 *
 * @author hanson.huang
 * @version V1.0=
 * @date 2024/9/27 17:15
 **/
public class BootstrapConfiguration {
    public static void start() {

        //配置日志路径。
        String logPath = StringUtil.format("{}/logs/smart-classroom-misc",
                System.getProperty("user.home"));
        System.setProperty("log.path", logPath);
        System.out.println("日志地址：" + logPath);

    }

}