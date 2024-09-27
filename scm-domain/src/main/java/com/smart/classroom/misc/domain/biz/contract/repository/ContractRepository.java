package com.smart.classroom.misc.domain.biz.contract.repository;

import com.smart.classroom.misc.domain.biz.contract.model.ContractModel;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/27 17:57
 **/
public interface ContractRepository {

    ContractModel insert(ContractModel contractModel);
}
