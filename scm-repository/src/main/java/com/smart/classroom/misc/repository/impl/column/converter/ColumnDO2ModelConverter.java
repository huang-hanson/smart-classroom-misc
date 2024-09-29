package com.smart.classroom.misc.repository.impl.column.converter;

import com.smart.classroom.misc.domain.biz.column.model.ColumnModel;
import com.smart.classroom.misc.repository.orm.column.ColumnDO;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/29 14:47
 **/
public class ColumnDO2ModelConverter {

    /**
     * 将DO转换成模型
     */
    public static ColumnModel convert(ColumnDO columnDO) {

        if (columnDO == null) {
            return null;
        }

        return ColumnModel.builder()
                .id(columnDO.getId())
                .createTime(columnDO.getCreateTime())
                .updateTime(columnDO.getUpdateTime())
                .name(columnDO.getName())
                .authorId(columnDO.getAuthorId())
                .status(columnDO.getStatus())
                .build();
    }

}