package com.smart.classroom.misc.facade.biz.editor.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/27 10:56
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EditorLoginRequest implements Serializable {

    /**
     * 用户名
     */
    private String username = null;

    /**
     * 密码
     */
    private String password = null;

}