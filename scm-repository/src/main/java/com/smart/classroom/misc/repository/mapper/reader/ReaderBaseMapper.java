package com.smart.classroom.misc.repository.mapper.reader;

import com.github.pagehelper.Page;
import com.smart.classroom.misc.repository.mapper.base.BaseMapper;
import com.smart.classroom.misc.repository.orm.reader.ReaderDO;
import com.smart.classroom.misc.utility.enums.SortDirection;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/29 14:35
 **/
@Mapper
@Repository
public interface ReaderBaseMapper extends BaseMapper<ReaderDO> {

    /**
     * 当入参中含有PageNum和pageSize时，会自动分页。
     */
    Page<ReaderDO> page(
            @Param("pageNum") int pageNum,
            @Param("pageSize") int pageSize,
            @Param("orderCreateTime") SortDirection orderCreateTime,
            @Param("orderUpdateTime") SortDirection orderUpdateTime
    );

}
