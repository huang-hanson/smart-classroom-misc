package com.smart.classroom.misc.facade.impl.biz.column.converter;

import com.smart.classroom.misc.domain.biz.column.enums.ColumnStatus;
import com.smart.classroom.misc.domain.biz.column.model.ColumnModel;
import com.smart.classroom.misc.facade.biz.column.response.ColumnDTO;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/29 18:07
 **/
public class ColumnModel2DTOConverter {

    /**
     * 将DO转换成模型
     */
    public static ColumnDTO convert(ColumnModel columnModel) {
        if (columnModel == null) {
            return null;
        }

        ColumnDTO columnDTO = ColumnDTO.builder()
                .id(columnModel.getId())
                .createTime(columnModel.getCreateTime())
                .updateTime(columnModel.getUpdateTime())

                .name(columnModel.getName())
                .authorId(columnModel.getAuthorId())
                .status(ColumnStatus.toString(columnModel.getStatus()))
                .build();

        return columnDTO;
    }


}