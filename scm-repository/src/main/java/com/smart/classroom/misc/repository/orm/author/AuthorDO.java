package com.smart.classroom.misc.repository.orm.author;

import com.smart.classroom.misc.repository.orm.base.BaseEntityDO;
import lombok.*;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/29 13:25
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class AuthorDO extends BaseEntityDO {

    /**
     * 用户名
     */
    private String username = null;

    /**
     * 密码
     */
    private String password = null;

    /**
     * 真实姓名
     */
    private String realname = null;
}