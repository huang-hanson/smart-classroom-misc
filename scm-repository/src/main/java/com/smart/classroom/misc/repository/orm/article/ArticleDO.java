package com.smart.classroom.misc.repository.orm.article;

import com.smart.classroom.misc.domain.biz.article.enums.ArticleStatus;
import com.smart.classroom.misc.repository.orm.base.BaseEntityDO;
import lombok.*;

/**
 * 专栏文章表
 *
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/29 11:08
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ArticleDO extends BaseEntityDO {

    /**
     * 名称
     */
    private String name = null;

    /**
     * 内容
     */
    private String content = null;

    /**
     * 专栏id
     */
    private Long columnId = null;

    /**
     * 作者id
     */
    private Long authorId = null;

    /**
     * 状态 NEW/OK/DISABLED 未发布/已生效/已禁用
     */
    private ArticleStatus status = ArticleStatus.NEW;
}