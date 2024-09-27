package com.smart.classroom.misc.domain.biz.author.model;

import lombok.*;

import java.util.Date;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/27 17:37
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthorModel {

    /**
     * 主键
     */
    private Long id = null;

    /**
     * 创建时间
     */
    private Date createTime = null;

    /**
     * 修改时间
     */
    private Date updateTime = null;

    /**
     * 用户名
     */
    private String username = null;

    /**
     * 密码
     */
    private String password = null;

    /**
     * 真实姓名
     */
    private String realname = null;

}