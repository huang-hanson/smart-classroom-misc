package com.smart.classroom.misc.domain.biz.quote.repository;

import com.smart.classroom.misc.domain.biz.quote.model.ColumnQuoteModel;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/27 18:29
 **/
public interface ColumnQuoteRepository {

    ColumnQuoteModel queryById(long columnQuoteId);

    /**
     * 查询某个专栏下有效的报价
     */
    ColumnQuoteModel queryByColumnIdAndStatusOk(long columnId);

    ColumnQuoteModel insert(ColumnQuoteModel columnQuoteModel);

}