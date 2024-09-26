package com.smart.classroom.misc.controller.auth;

import java.lang.annotation.*;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/26 19:08
 **/
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Feature {

    FeatureType[] value() default {FeatureType.PUBLIC};

}