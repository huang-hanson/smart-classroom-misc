package com.smart.classroom.misc.repository.orm.column;

import com.smart.classroom.misc.domain.biz.quote.enums.ColumnQuoteStatus;
import com.smart.classroom.misc.repository.orm.base.BaseEntityDO;
import lombok.*;

/**
 * 专栏报价表
 *
 * @author hanson.huang
 * @version V1.0
 * @ClassName ColumnQuoteDO
 * @date 2024/9/29 14:23
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ColumnQuoteDO extends BaseEntityDO {

    /**
     * 专栏id
     */
    private Long columnId = null;

    /**
     * 编辑id
     */
    private Long editorId = null;

    /**
     * 价格（单位：分）
     */
    private Long price = null;

    /**
     * 报价状态 DISABLED/OK 未生效/已生效
     */
    private ColumnQuoteStatus status = ColumnQuoteStatus.DISABLED;


}