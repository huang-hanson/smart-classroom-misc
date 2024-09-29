package com.smart.classroom.misc.repository.mapper.payment;

import com.github.pagehelper.Page;
import com.smart.classroom.misc.domain.biz.payment.enums.PayMethod;
import com.smart.classroom.misc.domain.biz.payment.enums.PayStatus;
import com.smart.classroom.misc.repository.mapper.base.BaseMapper;
import com.smart.classroom.misc.repository.orm.payment.PaymentDO;
import com.smart.classroom.misc.utility.enums.SortDirection;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/29 14:34
 **/
@Mapper
@Repository
public interface PaymentBaseMapper extends BaseMapper<PaymentDO> {

    /**
     * 当入参中含有PageNum和pageSize时，会自动分页。
     */
    Page<PaymentDO> page(
            @Param("pageNum") int pageNum,
            @Param("pageSize") int pageSize,
            @Param("orderCreateTime") SortDirection orderCreateTime,
            @Param("orderUpdateTime") SortDirection orderUpdateTime,
            @Param("orderNo") String orderNo,
            @Param("method") PayMethod method,
            @Param("thirdTransactionNo") String thirdTransactionNo,
            @Param("status") PayStatus status
    );
}
