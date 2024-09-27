package com.smart.classroom.misc.controller.base.result;

import com.smart.classroom.misc.utility.exception.ExceptionCode;
import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 * 所有定义的错误码
 *
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/27 9:33
 **/
@Getter
public enum ResultCode {

    OK(HttpStatus.OK, "成功"),
    LOGIN(HttpStatus.BAD_REQUEST, "没有登录"),
    NOT_FOUND(HttpStatus.NOT_FOUND, "资源没找到"),
    BAD_REQUEST(HttpStatus.BAD_REQUEST, "请求不合法"),
    UNAUTHORIZED(HttpStatus.UNAUTHORIZED, "没有权限"),
    PARAMS_ERROR(HttpStatus.BAD_REQUEST, "参数错误"),
    SERVER(HttpStatus.INTERNAL_SERVER_ERROR, "服务器内部出错"),
    UNKNOWN(HttpStatus.INTERNAL_SERVER_ERROR, "服务器未知错误");

    private final HttpStatus httpStatus;

    private final String message;

    ResultCode(HttpStatus httpStatus, String message) {
        this.httpStatus = httpStatus;
        this.message = message;
    }


    //将系统内部的错误转成web错误
    public static ResultCode fromExceptionCode(ExceptionCode exceptionCode) {
        switch (exceptionCode) {
            case OK:
                return OK;
            case LOGIN:
                return LOGIN;
            case NOT_FOUND:
                return NOT_FOUND;
            case UNAUTHORIZED:
                return UNAUTHORIZED;
            case SERVER:
                return SERVER;
            case UNKNOWN:
                return UNKNOWN;
            default:
                return UNKNOWN;
        }
    }
}

