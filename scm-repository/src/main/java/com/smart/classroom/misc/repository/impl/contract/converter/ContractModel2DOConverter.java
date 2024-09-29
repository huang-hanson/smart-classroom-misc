package com.smart.classroom.misc.repository.impl.contract.converter;

import com.smart.classroom.misc.domain.biz.contract.model.ContractModel;
import com.smart.classroom.misc.repository.orm.contract.ContractDO;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/29 15:03
 **/
public class ContractModel2DOConverter {

    /**
     * 将模型转换成DO
     */
    public static ContractDO convert(ContractModel contractModel) {
        if (contractModel == null) {
            return null;
        }

        ContractDO contractDO = ContractDO.builder()
                .name(contractModel.getName())
                .content(contractModel.getContent())
                .columnId(contractModel.getColumnId())
                .authorId(contractModel.getAuthorId())
                .status(contractModel.getStatus())
                .percentage(contractModel.getPercentage())
                .paymentDay(contractModel.getPaymentDay())
                .build();

        contractDO.setId(contractDO.getId());
        contractDO.setCreateTime(contractDO.getCreateTime());
        contractDO.setUpdateTime(contractDO.getUpdateTime());

        return contractDO;
    }
}
