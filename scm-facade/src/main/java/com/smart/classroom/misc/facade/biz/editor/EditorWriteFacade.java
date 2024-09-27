package com.smart.classroom.misc.facade.biz.editor;

import com.smart.classroom.misc.facade.biz.editor.request.EditorLoginRequest;
import com.smart.classroom.misc.facade.biz.editor.request.EditorRegisterRequest;
import com.smart.classroom.misc.facade.biz.editor.response.EditorDTO;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/27 10:59
 **/
public interface EditorWriteFacade {

    /**
     * 注册一个读者
     */
    EditorDTO register(EditorRegisterRequest request);


    /**
     * 读者登录.
     * 登录失败抛异常
     */
    EditorDTO login(EditorLoginRequest request);


}
