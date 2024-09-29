package com.smart.classroom.misc.repository.impl.author.converter;

import com.smart.classroom.misc.domain.biz.author.model.AuthorModel;
import com.smart.classroom.misc.repository.orm.author.AuthorDO;

/**
 * 转换器
 *
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/27 17:28
 **/
public class AuthorDO2ModelConverter {

    /**
     * 将DO转换成模型
     */
    public static AuthorModel convert(AuthorDO authorDO) {
        if (authorDO == null) {
            return null;
        }

        return AuthorModel.builder()
                .id(authorDO.getId())
                .createTime(authorDO.getCreateTime())
                .updateTime(authorDO.getUpdateTime())
                .username(authorDO.getUsername())
                .password(authorDO.getPassword())
                .realname(authorDO.getRealname())
                .build();
    }
}