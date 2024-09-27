package com.smart.classroom.misc.facade.biz.reader;

import com.smart.classroom.misc.facade.biz.reader.response.ReaderDTO;


/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/27 11:08
 **/
public interface ReaderReadFacade {

    ReaderDTO queryById(long readerId);

    ReaderDTO queryByUsername(String username);

}
