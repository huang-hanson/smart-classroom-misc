package com.smart.classroom.misc.repository.mapper.column;

import com.smart.classroom.misc.repository.orm.column.ColumnQuoteDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/29 14:25
 **/
@Mapper
@Repository
public interface ColumnQuoteMapper extends ColumnQuoteBaseMapper {

    ColumnQuoteDO queryByColumnIdAndStatusOk(@Param("columnId") long columnId);
}
