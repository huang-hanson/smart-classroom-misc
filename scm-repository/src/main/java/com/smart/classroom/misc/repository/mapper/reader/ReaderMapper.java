package com.smart.classroom.misc.repository.mapper.reader;

import com.smart.classroom.misc.repository.orm.reader.ReaderDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/29 14:36
 **/
@Mapper
@Repository
public interface ReaderMapper extends ReaderBaseMapper {

    ReaderDO queryByUsername(String username);
}