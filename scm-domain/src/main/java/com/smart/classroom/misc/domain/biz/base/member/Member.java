package com.smart.classroom.misc.domain.biz.base.member;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/**
 * 员工成员
 *
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/27 17:36
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    /**
     * 工号
     */
    private String workNo;

    /**
     * 花名
     */
    private String nickname;
}