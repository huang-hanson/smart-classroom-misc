package com.smart.classroom.misc.facade.biz.author;

import com.smart.classroom.misc.facade.biz.author.response.AuthorDTO;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/27 10:30
 **/
public interface AuthorReadFacade {

    AuthorDTO queryById(long authorId);
}