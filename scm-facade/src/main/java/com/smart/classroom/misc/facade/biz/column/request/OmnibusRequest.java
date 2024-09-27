package com.smart.classroom.misc.facade.biz.column.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/27 10:25
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OmnibusRequest implements Serializable {
    private String authorName;
    private String columnName;
    private Long editorId;
    private int columnPrice;
}