package com.smart.classroom.misc.domain.biz.column.repository.query;

import com.smart.classroom.misc.domain.biz.column.enums.ColumnStatus;
import com.smart.classroom.misc.utility.enums.SortDirection;
import lombok.*;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/27 17:49
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ColumnPageQuery {

    int pageNum = 1;
    int pageSize = 20;
    SortDirection orderCreateTime;
    SortDirection orderUpdateTime;
    String name;
    Long authorId;
    ColumnStatus status;

}