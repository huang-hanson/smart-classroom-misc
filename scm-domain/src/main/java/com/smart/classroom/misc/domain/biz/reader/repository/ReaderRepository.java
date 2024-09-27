package com.smart.classroom.misc.domain.biz.reader.repository;

import com.smart.classroom.misc.domain.biz.reader.model.ReaderModel;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/27 18:33
 **/
public interface ReaderRepository {

    ReaderModel queryById(long id);

    ReaderModel queryByUsername(String username);

    ReaderModel insert(ReaderModel readerModel);

}
