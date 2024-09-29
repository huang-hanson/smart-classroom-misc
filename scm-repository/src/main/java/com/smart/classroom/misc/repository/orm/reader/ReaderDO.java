package com.smart.classroom.misc.repository.orm.reader;

import com.smart.classroom.misc.repository.orm.base.BaseEntityDO;
import lombok.*;

/**
 * 读者表
 *
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/29 13:49
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ReaderDO extends BaseEntityDO {

    /**
     * 用户名
     */
    private String username = null;

    /**
     * 密码
     */
    private String password = null;
}