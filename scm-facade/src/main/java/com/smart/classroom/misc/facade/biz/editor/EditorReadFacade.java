package com.smart.classroom.misc.facade.biz.editor;

import com.smart.classroom.misc.facade.biz.editor.response.EditorDTO;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/27 10:59
 **/
public interface EditorReadFacade {

    EditorDTO queryById(long editorId);

    EditorDTO queryByUsername(String username);

}
