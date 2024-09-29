package com.smart.classroom.misc.repository.mapper.author;

import com.github.pagehelper.Page;
import com.smart.classroom.misc.repository.mapper.base.BaseMapper;
import com.smart.classroom.misc.repository.orm.author.AuthorDO;
import com.smart.classroom.misc.utility.enums.SortDirection;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/29 14:16
 **/
@Mapper
@Repository
public interface AuthorBaseMapper extends BaseMapper<AuthorDO> {

    /**
     * 当入参中含有PageNum和pageSize时，会自动分页。
     */
    Page<AuthorDO> page(
            @Param("pageNum") int pageNum,
            @Param("pageSize") int pageSize,
            @Param("orderCreateTime") SortDirection orderCreateTime,
            @Param("orderUpdateTime") SortDirection orderUpdateTime
    );

}
