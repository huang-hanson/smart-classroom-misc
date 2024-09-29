package com.smart.classroom.misc.repository.mapper.column;

import com.github.pagehelper.Page;
import com.smart.classroom.misc.domain.biz.quote.enums.ColumnQuoteStatus;
import com.smart.classroom.misc.repository.mapper.base.BaseMapper;
import com.smart.classroom.misc.repository.orm.column.ColumnQuoteDO;
import com.smart.classroom.misc.utility.enums.SortDirection;
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
public interface ColumnQuoteBaseMapper extends BaseMapper<ColumnQuoteDO> {

    /**
     * 当入参中含有PageNum和pageSize时，会自动分页。
     */
    Page<ColumnQuoteDO> page(
            @Param("pageNum") int pageNum,
            @Param("pageSize") int pageSize,
            @Param("orderCreateTime") SortDirection orderCreateTime,
            @Param("orderUpdateTime") SortDirection orderUpdateTime,
            @Param("columnId") Long columnId,
            @Param("status") ColumnQuoteStatus status
    );

}
