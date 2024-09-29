package com.smart.classroom.misc.repository.impl.editor.converter;

import com.smart.classroom.misc.domain.biz.editor.model.EditorModel;
import com.smart.classroom.misc.repository.orm.editor.EditorDO;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/29 15:05
 **/
public class EditorDO2ModelConverter {
    /**
     * 将DO转换成模型
     */
    public static EditorModel convert(EditorDO editorDO) {
        if (editorDO == null) {
            return null;
        }

        return EditorModel.builder()
                .id(editorDO.getId())
                .createTime(editorDO.getCreateTime())
                .updateTime(editorDO.getUpdateTime())
                .username(editorDO.getUsername())
                .password(editorDO.getPassword())
                .workNo(editorDO.getWorkNo())
                .build();
    }
}