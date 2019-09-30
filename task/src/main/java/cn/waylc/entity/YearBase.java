/*
 * Copyright 2019 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */

package cn.waylc.entity;

/**
 * @author : Luchao
 * @date : 2019/09/30 17:07:01
 */
public class YearBase {
    /**
     * 年代类型
     */
    private String yearType;

    /**
     * 数量
     */
    private Long count;

    public String getYearType() {
        return yearType;
    }

    public void setYearType(String yearType) {
        this.yearType = yearType;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
