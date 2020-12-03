package com.egf.financial.account.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class EgfDateUtils {

    /**
     * HH:mm:ss 24小时制
     */
    public static final String FULL_DATETIME_PATTERN = "yyyy-MM-dd HH:mm:ss";

    public static final String FULL_DATETIME_PATTERN_YYYY_SS="yyyyMMddHHmmss";

    public static final String DATE_FORMAT_YEAR ="yyyy";

    /**
     *  yyyy-MM-dd 标准日期格式
     */
    public static final String STANDARD_DATE_PATTERN = "yyyy-MM-dd";
    /**
     *  yyyyMMdd 日期格式
     */
    public static final String DATE_STRING_PATTERN = "yyyyMMdd";

    /**
     * 精确到小时
     */
    public static final String DATETIME_PATTERN_HOUR = "yyyy-MM-dd HH";

    /**
     * 截取时，分，秒时间格式
     */
    public static final String DATETIME_PATTERN_HOUR_SECOND ="HH:mm:ss";
    /**
     * 截取时，分，秒时间格式
     */
    public static final String TIME_PATTERN_HOUR_SECOND = "HHmmss";

    /**
     * hh:mm:ss 12小时制
     */
    public static final String FULL_DATETIME_PATTERN12 = "yyyy-MM-dd hh:mm:ss";

    /**
     * 日期类
     */
    public static final LocalDate  localDate = LocalDate.now();

    /**
     * 时间类
     */
    public static final LocalDateTime localDateTime = LocalDateTime.now();

    /**
     * @return yyyymmddhhmiss
     */
    public static String formatFullDateTime(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(FULL_DATETIME_PATTERN_YYYY_SS);

        return localDateTime.format(formatter);
    }

    /**
     * 返回当前日期字符串格式yyyymmmdd
     * @return
     */
    public static  String formatCurrentDate(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_STRING_PATTERN);
        return localDateTime.toLocalDate().format(formatter);
    }

    public static  String formatFixedDateTime(Date curDate,String pattern){
        return null;
    }

    public  static Date parseDateStr2Date(String dateStr, String pattern){
        return null;
    }



    public Date  getNextDate(Date date){
        return null;
    }

    public Date  getPreDate(Date date){
        return null;
    }

    /**
     * 比较当前2个日期大小
     * @param firstDate
     * @param secondDate
     * @return  1-firstDate 大于 secondDate;0-等于；-1表示小于
     */
    public int  compareTwoDate(Date firstDate,Date secondDate){
        return 0;
    }

    /**
     * 获取当前年份
     * @param date
     * @return
     */
    public int getYearOfDate(Date date){
        return 0;
    }

    /**
     * 获取当当前月份
     * @param date
     * @return
     */
    public int getMonthOfDate(Date date){
        return 0;
    }

    /**
     *  计算当前日期+天数后的日期
     * @param date
     * @param internal
     * @return date
     */
    public Date getDateOfAfterDays(Date date,int internal){
        return null;
    }

    public Date getDateOfBeforeDays(Date date ,int internal){
        return null;
    }

    public static void  main(String[] args){
        System.out.println(EgfDateUtils.formatCurrentDate());
    }
}
