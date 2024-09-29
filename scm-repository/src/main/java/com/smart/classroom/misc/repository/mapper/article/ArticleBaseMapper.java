package com.smart.classroom.misc.repository.mapper.article;


import com.github.pagehelper.Page;
import com.smart.classroom.misc.domain.biz.article.enums.ArticleStatus;
import com.smart.classroom.misc.repository.orm.article.ArticleDO;
import com.smart.classroom.misc.utility.enums.SortDirection;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.smart.classroom.misc.repository.mapper.base.BaseMapper;

/**
 *
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/29 14:11
 **/
@Mapper
@Repository
public interface ArticleBaseMapper extends BaseMapper<ArticleDO> {

    /**
     * 当入参中含有PageNum和pageSize时，会自动分页。
     */
    Page<ArticleDO> page(
            @Param("pageNum") int pageNum,
            @Param("pageSize") int pageSize,
            @Param("orderCreateTime") SortDirection orderCreateTime,
            @Param("orderUpdateTime") SortDirection orderUpdateTime,
            @Param("name") String name,
            @Param("content") String content,
            @Param("columnId") Long columnId,
            @Param("authorId") Long authorId,
            @Param("status") ArticleStatus status
    );
}