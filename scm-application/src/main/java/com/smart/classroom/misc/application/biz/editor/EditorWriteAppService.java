package com.smart.classroom.misc.application.biz.editor;

import com.smart.classroom.misc.domain.biz.editor.model.EditorModel;
import com.smart.classroom.misc.domain.biz.editor.repository.EditorRepository;
import com.smart.classroom.misc.domain.biz.editor.service.EditorRegisterDomainService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/29 17:31
 **/
@Slf4j
@Service
public class EditorWriteAppService {

    @Resource
    EditorRepository editorRepository;

    @Resource
    EditorRegisterDomainService editorRegisterDomainService;

    public EditorModel register(String username, String password, String workNo) {


        EditorModel editorModel = editorRegisterDomainService.register(username, password, workNo);

        return editorModel;

    }

    public EditorModel queryById(long editorId) {
        return editorRepository.queryById(editorId);
    }

    public EditorModel login(String username, String password) {
        EditorModel editorModel = editorRegisterDomainService.login(username, password);

        return editorModel;
    }

    public EditorModel queryByUsername(String username) {
        return editorRepository.queryByUsername(username);
    }
}