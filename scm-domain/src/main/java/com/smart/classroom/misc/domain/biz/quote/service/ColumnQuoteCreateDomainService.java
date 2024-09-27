package com.smart.classroom.misc.domain.biz.quote.service;

import com.smart.classroom.misc.domain.biz.author.model.AuthorModel;
import com.smart.classroom.misc.domain.biz.column.model.ColumnModel;
import com.smart.classroom.misc.domain.biz.editor.model.EditorModel;
import com.smart.classroom.misc.domain.biz.quote.enums.ColumnQuoteStatus;
import com.smart.classroom.misc.domain.biz.quote.model.ColumnQuoteModel;
import com.smart.classroom.misc.domain.biz.quote.repository.ColumnQuoteRepository;
import org.springframework.stereotype.Service;

import java.util.Date;

import javax.annotation.Resource;

/**
 * 创建专栏报价领域服务
 *
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/27 18:29
 **/
@Service
public class ColumnQuoteCreateDomainService {

    @Resource
    ColumnQuoteRepository columnQuoteRepository;

    /**
     * 创建专栏报价
     */
    public ColumnQuoteModel create(ColumnModel columnModel, AuthorModel authorModel, EditorModel editorModel, long columnPrice) {

        //这里创建后就立即置为发布状态
        ColumnQuoteModel columnQuoteModel = ColumnQuoteModel.builder()
                .createTime(new Date())
                .updateTime(new Date())
                .columnId(columnModel.getId())
                .editorId(editorModel.getId())
                .price(columnPrice)
                .status(ColumnQuoteStatus.OK)
                .build();

        columnQuoteModel = columnQuoteRepository.insert(columnQuoteModel);


        //TODO: 发送合同创建成功的领域事件。

        return columnQuoteModel;
    }

}