package com.smart.classroom.misc.repository.mapper.column;

import com.github.pagehelper.Page;
import com.smart.classroom.misc.domain.biz.column.enums.ColumnStatus;
import com.smart.classroom.misc.repository.mapper.base.BaseMapper;
import com.smart.classroom.misc.repository.orm.column.ColumnDO;
import com.smart.classroom.misc.utility.enums.SortDirection;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/29 14:21
 **/
@Mapper
@Repository
public interface ColumnBaseMapper extends BaseMapper<ColumnDO> {

    /**
     * 当入参中含有PageNum和pageSize时，会自动分页。
     */
    Page<ColumnDO> page(
            @Param("pageNum") int pageNum,
            @Param("pageSize") int pageSize,
            @Param("orderCreateTime") SortDirection orderCreateTime,
            @Param("orderUpdateTime") SortDirection orderUpdateTime,
            @Param("name") String name,
            @Param("authorId") Long authorId,
            @Param("status") ColumnStatus status
    );

}