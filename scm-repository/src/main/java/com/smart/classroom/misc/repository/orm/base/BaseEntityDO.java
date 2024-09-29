package com.smart.classroom.misc.repository.orm.base;

import lombok.Data;

import java.util.Date;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/29 10:34
 **/
@Data
public class BaseEntityDO {

    public final static String EMPTY_JSON_ARRAY = "[]";
    public final static String EMPTY_JSON_OBJECT = "{}";

    /**
     * 主键
     */
    private Long id;

    /**
     * 创建时间
     */
    private Date createTime = new Date();

    /**
     * 修改时间
     */
    private Date updateTime = new Date();

}