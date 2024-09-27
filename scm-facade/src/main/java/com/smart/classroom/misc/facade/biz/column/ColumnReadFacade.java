package com.smart.classroom.misc.facade.biz.column;

import com.smart.classroom.misc.facade.biz.column.request.ColumnPageRequest;
import com.smart.classroom.misc.facade.biz.column.response.ColumnDTO;
import com.smart.classroom.misc.facade.common.response.PagerResponse;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/27 10:27
 **/
public interface ColumnReadFacade {

    PagerResponse<ColumnDTO> list(ColumnPageRequest columnPageRequest);

    ColumnDTO queryById(long columnId);
}
