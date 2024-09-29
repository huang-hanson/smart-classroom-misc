package com.smart.classroom.misc.repository.impl.author.converter;

import com.smart.classroom.misc.domain.biz.author.model.AuthorModel;
import com.smart.classroom.misc.repository.orm.author.AuthorDO;

/**
 * 转换器
 *
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/29 10:07
 **/
public class AuthorModel2DOConverter {

    /**
     * 将模型转换成DO
     */
    public static AuthorDO convert(AuthorModel authorModel) {
        if (authorModel == null) {
            return null;
        }

        AuthorDO authorDO = AuthorDO.builder()
                .username(authorModel.getUsername())
                .password(authorModel.getPassword())
                .realname(authorModel.getRealname())
                .build();

        authorDO.setId(authorModel.getId());
        authorDO.setCreateTime(authorModel.getCreateTime());
        authorDO.setUpdateTime(authorModel.getUpdateTime());

        return authorDO;

    }
}