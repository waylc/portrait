/*
 * Copyright 2019 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */

package cn.waylc.map;

import cn.waylc.entity.YearBase;
import org.apache.commons.lang3.StringUtils;
import org.apache.flink.api.common.functions.MapFunction;

/**
 * @author : Luchao
 * @date : 2019/09/30 17:05:59
 */
public class YearBaseMap implements MapFunction<String, YearBase> {
    @Override
    public YearBase map(String s) throws Exception {
        if(StringUtils.isBlank(s)){
            return null;
        }
        String[] userinfos = s.split(",");
        String userId = userinfos[0];
        String username = userinfos[1];
        String sex = userinfos[2];
        String telphone = userinfos[3];
        String email = userinfos[4];
        String age = userinfos[5];
        String registerTime = userinfos[6];
        String useType = userinfos[7];
        return null;
    }
}
