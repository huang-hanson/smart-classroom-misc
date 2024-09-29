package com.smart.classroom.misc.repository.mapper.editor;

import com.smart.classroom.misc.repository.orm.editor.EditorDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/29 14:32
 **/
@Mapper
@Repository
public interface EditorMapper extends EditorBaseMapper {

    EditorDO queryByUsername(String username);

    EditorDO queryTopByWorkNo(String workNo);
}
