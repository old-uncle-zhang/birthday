package com.homework.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

/**
 * @author ：old_uncle_zhang
 * @date ：Created in 2019/8/3 22:56
 * @description：
 * @modified By：
 */
public class DateUtil {

    private static final String DATE_FORMAT_PATTERN = "yyyy/MM/dd";

    private static final String DATE_REGEX = "\\d{4}/\\d{2}/\\d{2}";

    public static Boolean isBirthday(LocalDate birthday) {
        return LocalDate.now().isEqual(birthday);
    }

    public static LocalDate formatDate(String dateString) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern(DATE_FORMAT_PATTERN);
        return LocalDate.parse(dateString, fmt);
    }

    public static Boolean validateDate(String dateString) {
        return Pattern.matches(DATE_REGEX, dateString);
    }

}
