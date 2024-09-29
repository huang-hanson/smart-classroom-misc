package com.smart.classroom.misc.repository.impl.quote.converter;

import com.smart.classroom.misc.domain.biz.quote.model.ColumnQuoteModel;
import com.smart.classroom.misc.repository.orm.column.ColumnQuoteDO;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/29 15:43
 **/
public class ColumnQuoteModel2DOConverter {

    /**
     * 将模型转换成DO
     */
    public static ColumnQuoteDO convert(ColumnQuoteModel columnQuoteModel) {
        if (columnQuoteModel == null) {
            return null;
        }

        ColumnQuoteDO columnQuoteDO = ColumnQuoteDO.builder()
                .columnId(columnQuoteModel.getColumnId())
                .editorId(columnQuoteModel.getEditorId())
                .price(columnQuoteModel.getPrice())
                .status(columnQuoteModel.getStatus())
                .build();

        columnQuoteDO.setId(columnQuoteDO.getId());
        columnQuoteDO.setCreateTime(columnQuoteDO.getCreateTime());
        columnQuoteDO.setUpdateTime(columnQuoteDO.getUpdateTime());

        return columnQuoteDO;
    }


}