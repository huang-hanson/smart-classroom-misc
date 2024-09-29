package com.smart.classroom.misc.repository.impl.editor;

import com.smart.classroom.misc.domain.biz.editor.model.EditorModel;
import com.smart.classroom.misc.domain.biz.editor.repository.EditorRepository;
import com.smart.classroom.misc.repository.impl.editor.converter.EditorDO2ModelConverter;
import com.smart.classroom.misc.repository.impl.editor.converter.EditorModel2DOConverter;
import com.smart.classroom.misc.repository.mapper.editor.EditorMapper;
import com.smart.classroom.misc.repository.orm.editor.EditorDO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/29 15:08
 **/
@Service
public class EditorRepositoryImpl implements EditorRepository {

    @Resource
    EditorMapper editorMapper;

    @Override
    public EditorModel queryById(long id) {
        EditorDO editorDO = editorMapper.queryById(id);
        return EditorDO2ModelConverter.convert(editorDO);
    }

    @Override
    public EditorModel queryByUsername(String username) {
        EditorDO editorDO = editorMapper.queryByUsername(username);
        return EditorDO2ModelConverter.convert(editorDO);
    }

    @Override
    public EditorModel queryByWorkNo(String workNo) {
        EditorDO editorDO = editorMapper.queryTopByWorkNo(workNo);
        return EditorDO2ModelConverter.convert(editorDO);
    }

    @Override
    public EditorModel insert(EditorModel editorModel) {
        EditorDO editorDO = EditorModel2DOConverter.convert(editorModel);
        editorMapper.insert(editorDO);

        // 查询一次
        editorDO = editorMapper.queryById(editorDO.getId());
        return EditorDO2ModelConverter.convert(editorDO);
    }
}