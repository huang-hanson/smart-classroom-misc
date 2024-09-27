package com.smart.classroom.misc.utility.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.helpers.MessageFormatter;

import java.util.UUID;


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


    /**
     * 生成一个uuid
     *
     * @return 一个唯一的uui
     */
    public static String uuid() {
        return UUID.randomUUID().toString();
    }

    /**
     * 对于太长的文字，取前面和后面的部分，中间用...表示.
     *
     * @param text      需要处理的文本
     * @param maxLength 最多保留多少个字符
     * @param tail      后面保留多少个字符
     * @return 经过处理的字符串
     */
    public static String digest(String text, int maxLength, int tail) {

        if (StringUtil.isEmpty(text)) {
            return text;
        }

        String doString = "...";
        int totalLength = text.length();
        int dotLength = doString.length();
        int head = maxLength - tail - dotLength;

        if (maxLength < tail || tail < 0 || head < 0) {
            throw new RuntimeException("大小指定不符合逻辑");
        }

        if (StringUtil.isBlank(text)) {
            return text;
        } else {
            if (totalLength <= maxLength) {
                return text;
            } else {
                return StringUtil.format("{}:{}:{}", text.substring(0, head), doString, text.substring(totalLength - tail));
            }
        }
    }


}