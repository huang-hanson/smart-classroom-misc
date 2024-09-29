package com.smart.classroom.misc.repository.impl.contract;

import com.smart.classroom.misc.domain.biz.contract.model.ContractModel;
import com.smart.classroom.misc.domain.biz.contract.repository.ContractRepository;
import com.smart.classroom.misc.repository.impl.contract.converter.ContractDO2ModelConverter;
import com.smart.classroom.misc.repository.impl.contract.converter.ContractModel2DOConverter;
import com.smart.classroom.misc.repository.mapper.contract.ContractMapper;
import com.smart.classroom.misc.repository.orm.contract.ContractDO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/29 15:03
 **/
@Service
public class ContractRepositoryImpl implements ContractRepository {

    @Resource
    ContractMapper contractMapper;

    @Override
    public ContractModel insert(ContractModel contractModel) {

        ContractDO contractDO = ContractModel2DOConverter.convert(contractModel);

        contractMapper.insert(contractDO);

        // 查询一次
        contractDO = contractMapper.queryById(contractDO.getId());

        return ContractDO2ModelConverter.convert(contractDO);
    }
}