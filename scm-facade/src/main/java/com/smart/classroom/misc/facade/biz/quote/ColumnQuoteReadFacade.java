package com.smart.classroom.misc.facade.biz.quote;

import com.smart.classroom.misc.facade.biz.quote.response.ColumnQuoteDTO;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/27 11:07
 **/
public interface ColumnQuoteReadFacade {

    ColumnQuoteDTO queryById(long columnQuoteId);

    ColumnQuoteDTO queryByColumnId(long columnId);

}
