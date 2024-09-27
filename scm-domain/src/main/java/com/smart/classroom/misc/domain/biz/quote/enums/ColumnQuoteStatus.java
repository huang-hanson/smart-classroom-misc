package com.smart.classroom.misc.domain.biz.quote.enums;

import lombok.Getter;

@Getter
public enum ColumnQuoteStatus {

    OK("已生效"),
    DISABLED("未生效");


    private final String description;

    ColumnQuoteStatus(String description) {
        this.description = description;
    }


    public static String toString(ColumnQuoteStatus status) {
        if (status == null) {
            return null;
        }
        return status.name();
    }

    public static ColumnQuoteStatus toEnum(String s) {
        if (s == null) {
            return null;
        }
        return ColumnQuoteStatus.valueOf(s);
    }

}
