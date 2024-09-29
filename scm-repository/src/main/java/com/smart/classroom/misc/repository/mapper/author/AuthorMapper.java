package com.smart.classroom.misc.repository.mapper.author;

import com.smart.classroom.misc.repository.orm.author.AuthorDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/29 14:17
 **/
@Mapper
@Repository
public interface AuthorMapper extends AuthorBaseMapper {

    AuthorDO queryTopByUsername(String username);
}
