package com.smart.classroom.misc.repository.impl.reader.converter;

import com.smart.classroom.misc.domain.biz.reader.model.ReaderModel;
import com.smart.classroom.misc.repository.orm.reader.ReaderDO;

/**
 * @author hanson.huang
 * @date 2024/9/29 15:44
 **/
public class ReaderModel2DOConverter {

    /**
     * 将模型转换成DO
     */
    public static ReaderDO convert(ReaderModel readerModel) {
        if (readerModel == null) {
            return null;
        }

        ReaderDO readerDO = ReaderDO.builder()
                .username(readerModel.getUsername())
                .password(readerModel.getPassword())
                .build();

        readerDO.setId(readerModel.getId());
        readerDO.setCreateTime(readerModel.getCreateTime());
        readerDO.setUpdateTime(readerModel.getUpdateTime());

        return readerDO;

    }


}