package com.smart.classroom.misc.repository.orm.editor;

import com.smart.classroom.misc.repository.orm.base.BaseEntityDO;
import lombok.*;

/**
 * 小二表
 *
 * @author hanson.huang
 * @date 2024/9/29 13:47
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class EditorDO extends BaseEntityDO {

    /**
     * 昵称
     */
    private String username = null;

    /**
     * 密码
     */
    private String password = null;

    /**
     * 工号
     */
    private String workNo = null;
}