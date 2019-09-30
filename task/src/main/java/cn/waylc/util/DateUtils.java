/*
 * Copyright 2019 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */

package cn.waylc.util;

import scala.Int;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author : Luchao
 * @date : 2019/09/30 17:50:48
 */
public class DateUtils {

    /**
     * 返回年代
     * @return
     */
    public static String getYearBaseByAge(String age){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.YEAR,-Integer.parseInt(age));
        Date newDate = calendar.getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy");
        String newDateAsString = dateFormat.format(newDate);
        Integer newDateAsInteger = Integer.valueOf(newDateAsString);
        if(newDateAsInteger >= 1940 && newDateAsInteger < 1950){
            // 40 年代
        } else if(newDateAsInteger >= 1950 && newDateAsInteger < 1960){
            // 50 年代
        } else if(newDateAsInteger >= 1960 && newDateAsInteger < 1970){
            // 60 年代
        } else if(newDateAsInteger >= 1970 && newDateAsInteger < 1980){
            // 70 年代
        } else if(newDateAsInteger >= 1980 && newDateAsInteger < 1990){
            // 80 年代
        } else if(newDateAsInteger >= 1990 && newDateAsInteger < 2000){
            // 90 年代
        } else if(newDateAsInteger >= 2000 && newDateAsInteger < 2010){
            // 00 年代
        }
    }
}
