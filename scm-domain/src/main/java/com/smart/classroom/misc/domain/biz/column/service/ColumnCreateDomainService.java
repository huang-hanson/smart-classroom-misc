package com.smart.classroom.misc.domain.biz.column.service;

import com.smart.classroom.misc.domain.biz.author.model.AuthorModel;
import com.smart.classroom.misc.domain.biz.column.enums.ColumnStatus;
import com.smart.classroom.misc.domain.biz.column.model.ColumnModel;
import com.smart.classroom.misc.domain.biz.column.repository.ColumnRepository;
import com.smart.classroom.misc.utility.exception.UtilException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * 创建专栏领域服务
 *
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/27 17:52
 **/
@Service
public class ColumnCreateDomainService {

    @Resource
    ColumnRepository columnRepository;


    /**
     * 创建专栏
     */
    public ColumnModel create(AuthorModel authorModel, String columnName) {

        ColumnModel columnModel = columnRepository.queryByName(columnName);
        if (columnModel != null) {
            throw new UtilException("专栏已存在，请勿重复创建！");
        }

        //这里创建后就立即置为发布状态
        columnModel = ColumnModel.builder()
                .createTime(new Date())
                .updateTime(new Date())
                .name(columnName)
                .authorId(authorModel.getId())
                .status(ColumnStatus.OK)
                .build();

        columnModel = columnRepository.insert(columnModel);


        //TODO: 发送专栏创建成功的领域事件。

        return columnModel;
    }

}