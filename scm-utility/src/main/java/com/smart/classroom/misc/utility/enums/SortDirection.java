package com.smart.classroom.misc.utility.enums;

import lombok.Getter;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/27 17:50
 **/
@Getter
public enum SortDirection {
    ASC("升序"),
    DESC("降序");;

    private final String description;

    SortDirection(String description) {
        this.description = description;
    }

    public static String toString(SortDirection direction) {
        if (direction == null) {
            return null;
        }
        return direction.name();
    }

    public static SortDirection toEnum(String s) {
        if (s == null) {
            return null;
        }
        return SortDirection.valueOf(s);
    }
}