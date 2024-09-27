package com.smart.classroom.misc.domain.biz.author.repository;

import com.smart.classroom.misc.domain.biz.author.model.AuthorModel;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/27 17:41
 **/
public interface AuthorRepository {

    AuthorModel queryById(Long id);

    AuthorModel queryOneByUsername(String username);

    AuthorModel insert(AuthorModel authorModel);

}
