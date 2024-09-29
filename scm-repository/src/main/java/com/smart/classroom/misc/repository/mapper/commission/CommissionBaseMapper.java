package com.smart.classroom.misc.repository.mapper.commission;

import com.github.pagehelper.Page;
import com.smart.classroom.misc.domain.biz.commission.enums.CommissionStatus;
import com.smart.classroom.misc.repository.mapper.base.BaseMapper;
import com.smart.classroom.misc.repository.orm.commission.CommissionDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.smart.classroom.misc.utility.enums.SortDirection;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/29 14:25
 **/
@Mapper
@Repository
public interface CommissionBaseMapper extends BaseMapper<CommissionDO> {

    /**
     * 当入参中含有PageNum和pageSize时，会自动分页。
     */
    Page<CommissionDO> page(
            @Param("pageNum") int pageNum,
            @Param("pageSize") int pageSize,
            @Param("orderCreateTime") SortDirection orderCreateTime,
            @Param("orderUpdateTime") SortDirection orderUpdateTime,
            @Param("name") String name,
            @Param("contractId") Long contractId,
            @Param("authorId") Long authorId,
            @Param("receiptId") Long receiptId,
            @Param("status") CommissionStatus status
    );

}
