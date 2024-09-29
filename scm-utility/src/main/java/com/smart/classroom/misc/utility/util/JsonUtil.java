package com.smart.classroom.misc.utility.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.smart.classroom.misc.utility.exception.UtilException;
import org.apache.commons.lang3.exception.ExceptionUtils;

import java.text.SimpleDateFormat;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/29 17:34
 **/
public class JsonUtil {

    public final static String EMPTY_JSON_ARRAY = "[]";
    public final static String EMPTY_JSON_OBJECT = "{}";

    public final static ObjectMapper objectMapper;

    static {
        objectMapper = new ObjectMapper();
        //遇到没有定义的字段，反序列化不要报错。
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        // 时间格式化
        objectMapper.setDateFormat(new SimpleDateFormat(DateUtil.DEFAULT_FORMAT));
    }

    //将对象转换成json字符串。
    public static String toJson(Object obj) {


        try {

            return objectMapper.writeValueAsString(obj);

        } catch (JsonProcessingException e) {
            throw new UtilException("转成JSON时出错：{}", ExceptionUtils.getRootCauseMessage(e));
        }
    }
}