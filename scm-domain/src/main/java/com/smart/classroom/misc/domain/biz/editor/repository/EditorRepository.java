package com.smart.classroom.misc.domain.biz.editor.repository;

import com.smart.classroom.misc.domain.biz.editor.model.EditorModel;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/27 18:02
 **/
public interface EditorRepository {

    EditorModel queryById(long id);

    EditorModel queryByUsername(String username);

    EditorModel queryByWorkNo(String workNo);

    EditorModel insert(EditorModel editorModel);
}
