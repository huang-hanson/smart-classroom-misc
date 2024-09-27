package com.smart.classroom.misc.domain.biz.column.repository;

import com.smart.classroom.misc.domain.biz.column.model.ColumnModel;
import com.smart.classroom.misc.domain.biz.column.repository.query.ColumnPageQuery;
import com.smart.classroom.misc.utility.result.Pager;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/27 17:51
 **/
public interface ColumnRepository {

    ColumnModel queryById(Long id);


    ColumnModel queryByName(String name);

    //分页查询
    Pager<ColumnModel> page(ColumnPageQuery columnPageQuery);


    ColumnModel insert(ColumnModel author);


}