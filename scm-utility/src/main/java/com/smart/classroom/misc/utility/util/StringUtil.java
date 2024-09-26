package com.smart.classroom.misc.utility.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.helpers.MessageFormatter;


/**
 * 关于字符串处理的通用方法。
 *
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/26 19:32
 **/
@Slf4j
public class StringUtil extends StringUtils {

    //类似于sl4j的字符串格式化.使用 {} 做占位符。
    public static String format(String messagePattern, Object... arguments) {
        return MessageFormatter.arrayFormat(messagePattern, arguments).getMessage();
    }

}