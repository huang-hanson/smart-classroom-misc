package com.smart.classroom.misc.repository.orm.column;

import com.smart.classroom.misc.domain.biz.column.enums.ColumnStatus;
import com.smart.classroom.misc.repository.orm.base.BaseEntityDO;
import lombok.*;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/29 13:32
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ColumnDO extends BaseEntityDO {

    /**
     * 专栏名称
     */
    private String name = null;

    /**
     * 作者id
     */
    private Long authorId = null;

    /**
     * 状态 NEW/OK/DISABLED 未发布/已生效/已禁用
     */
    private ColumnStatus status = ColumnStatus.NEW;


}