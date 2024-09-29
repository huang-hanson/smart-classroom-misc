package com.smart.classroom.misc.repository.mapper.payment;

import com.smart.classroom.misc.domain.biz.payment.enums.PayStatus;
import com.smart.classroom.misc.repository.orm.payment.PaymentDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/29 14:35
 **/
@Mapper
@Repository
public interface PaymentMapper extends PaymentBaseMapper {

    PaymentDO queryByOrderNo(@Param("orderNo") String orderNo);

    int updateStatus(@Param("paymentId") long paymentId, @Param("status") PayStatus status);
}
