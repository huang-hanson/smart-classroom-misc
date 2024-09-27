package com.smart.classroom.misc.domain.biz.article.enums;

import lombok.Getter;

@Getter
public enum ArticleStatus {

    NEW("未发布"),
    OK("已发布"),
    DISABLED("已禁用");


    private final String description;

    ArticleStatus(String description) {
        this.description = description;
    }

}
