package com.smart.classroom.misc.repository.impl.quote.converter;

import com.smart.classroom.misc.domain.biz.quote.model.ColumnQuoteModel;
import com.smart.classroom.misc.repository.orm.column.ColumnQuoteDO;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/29 15:38
 **/
public class ColumnQuoteDO2ModelConverter {

    /**
     * 将DO转换成模型
     */
    public static ColumnQuoteModel convert(ColumnQuoteDO columnQuoteDO) {
        if (columnQuoteDO == null) {
            return null;
        }

        return ColumnQuoteModel.builder()
                .id(columnQuoteDO.getId())
                .createTime(columnQuoteDO.getCreateTime())
                .updateTime(columnQuoteDO.getUpdateTime())
                .columnId(columnQuoteDO.getColumnId())
                .editorId(columnQuoteDO.getEditorId())
                .price(columnQuoteDO.getPrice())
                .status(columnQuoteDO.getStatus())
                .build();
    }


}