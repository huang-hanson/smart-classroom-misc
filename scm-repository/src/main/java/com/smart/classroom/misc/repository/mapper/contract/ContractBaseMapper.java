package com.smart.classroom.misc.repository.mapper.contract;

import com.github.pagehelper.Page;
import com.smart.classroom.misc.domain.biz.contract.enums.ContractStatus;
import com.smart.classroom.misc.repository.mapper.base.BaseMapper;
import com.smart.classroom.misc.repository.orm.contract.ContractDO;
import com.smart.classroom.misc.utility.enums.SortDirection;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/29 14:28
 **/
@Mapper
@Repository
public interface ContractBaseMapper extends BaseMapper<ContractDO> {

    /**
     * 当入参中含有PageNum和pageSize时，会自动分页。
     */
    Page<ContractDO> page(
            @Param("pageNum") int pageNum,
            @Param("pageSize") int pageSize,
            @Param("orderCreateTime") SortDirection orderCreateTime,
            @Param("orderUpdateTime") SortDirection orderUpdateTime,
            @Param("name") String name,
            @Param("columnId") Long columnId,
            @Param("authorId") Long authorId,
            @Param("status") ContractStatus status
    );

}