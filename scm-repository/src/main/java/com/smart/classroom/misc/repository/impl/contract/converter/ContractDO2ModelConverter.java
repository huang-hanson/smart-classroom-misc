package com.smart.classroom.misc.repository.impl.contract.converter;

import com.smart.classroom.misc.domain.biz.contract.model.ContractModel;
import com.smart.classroom.misc.repository.orm.contract.ContractDO;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/29 15:01
 **/
public class ContractDO2ModelConverter {

    /**
     * 将DO转换成模型
     */
    public static ContractModel convert(ContractDO contractDO) {

        if (contractDO == null){
            return null;
        }

        return ContractModel.builder()
                .id(contractDO.getId())
                .createTime(contractDO.getCreateTime())
                .updateTime(contractDO.getUpdateTime())
                .name(contractDO.getName())
                .content(contractDO.getContent())
                .columnId(contractDO.getColumnId())
                .authorId(contractDO.getAuthorId())
                .status(contractDO.getStatus())
                .percentage(contractDO.getPercentage())
                .paymentDay(contractDO.getPaymentDay())
                .build();
    }

}