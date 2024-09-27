package com.smart.classroom.misc.facade.biz.column;

import com.smart.classroom.misc.facade.biz.column.request.OmnibusRequest;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/27 10:53
 **/
public interface ColumnWriteFacade {

    /**
     * ！！！此接口仅作为演示用途！！！
     * 一口气创建 作者，作者合同，专栏，课程文章，专栏报价，编辑
     * 为了保证数据库不出现脏数据
     */
    void omnibus(OmnibusRequest request);
}
