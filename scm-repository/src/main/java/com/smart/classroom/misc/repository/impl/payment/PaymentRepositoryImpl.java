package com.smart.classroom.misc.repository.impl.payment;

import com.smart.classroom.misc.domain.biz.payment.model.PaymentModel;
import com.smart.classroom.misc.domain.biz.payment.repository.PaymentRepository;
import com.smart.classroom.misc.repository.impl.payment.converter.PaymentDO2ModelConverter;
import com.smart.classroom.misc.repository.impl.payment.converter.PaymentModel2DOConverter;
import com.smart.classroom.misc.repository.mapper.payment.PaymentMapper;
import com.smart.classroom.misc.repository.orm.payment.PaymentDO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/29 15:36
 **/
@Service
public class PaymentRepositoryImpl implements PaymentRepository {


    @Resource
    PaymentMapper paymentMapper;


    @Override
    public PaymentModel queryByOrderNo(String orderNo) {

        PaymentDO paymentDO = paymentMapper.queryByOrderNo(orderNo);

        return PaymentDO2ModelConverter.convert(paymentDO);
    }

    @Override
    public PaymentModel queryById(long id) {

        PaymentDO paymentDO = paymentMapper.queryById(id);

        return PaymentDO2ModelConverter.convert(paymentDO);
    }


    @Override
    public PaymentModel insert(PaymentModel paymentModel) {

        PaymentDO paymentDO = PaymentModel2DOConverter.convert(paymentModel);

        paymentMapper.insert(paymentDO);

        //查询一次。
        paymentDO = paymentMapper.queryById(paymentDO.getId());

        return PaymentDO2ModelConverter.convert(paymentDO);
    }

    @Override
    public PaymentModel updateStatus(PaymentModel paymentModel) {

        paymentMapper.updateStatus(paymentModel.getId(), paymentModel.getStatus());

        //查询一次。
        PaymentDO paymentDO = paymentMapper.queryById(paymentModel.getId());

        return PaymentDO2ModelConverter.convert(paymentDO);
    }
}