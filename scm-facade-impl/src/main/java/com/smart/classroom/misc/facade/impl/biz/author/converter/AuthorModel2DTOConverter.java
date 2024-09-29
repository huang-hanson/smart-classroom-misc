package com.smart.classroom.misc.facade.impl.biz.author.converter;

import com.smart.classroom.misc.domain.biz.author.model.AuthorModel;
import com.smart.classroom.misc.facade.biz.author.response.AuthorDTO;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/29 18:06
 **/
public class AuthorModel2DTOConverter {

    /**
     * 将DO转换成模型
     */
    public static AuthorDTO convert(AuthorModel authorModel) {
        if (authorModel == null) {
            return null;
        }

        AuthorDTO authorDTO = AuthorDTO.builder()
                .id(authorModel.getId())
                .createTime(authorModel.getCreateTime())
                .updateTime(authorModel.getUpdateTime())

                .username(authorModel.getUsername())
                .password(authorModel.getPassword())
                .realname(authorModel.getRealname())
                .build();

        return authorDTO;
    }


}