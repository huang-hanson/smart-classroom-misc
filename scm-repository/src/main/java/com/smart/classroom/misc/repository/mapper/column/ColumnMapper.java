package com.smart.classroom.misc.repository.mapper.column;

import com.smart.classroom.misc.repository.orm.column.ColumnDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/29 14:22
 **/
@Mapper
@Repository
public interface ColumnMapper extends ColumnBaseMapper {

    ColumnDO queryTopByName(@Param("name") String name);
}
