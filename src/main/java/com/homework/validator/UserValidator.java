package com.homework.validator;

import com.homework.utils.DateUtil;

import java.util.regex.Pattern;

/**
 * @author ：old_uncle_zhang
 * @date ：Created in 2019/8/3 22:45
 * @description：
 * @modified By：
 */
public class UserValidator {

    private static final int NUMBER_FOUR = 4;

    private static final String EMAIL_REGEX = "^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.[a-zA-Z0-9]{2,6}$";

    public static Boolean validateUser(String[] userInfo) {
        return isComplete(userInfo) && DateUtil.validateDate(userInfo[2]) && validateEmail(userInfo[3]);
    }

    private static Boolean isComplete(String[] userInfo) {
        return userInfo.length == NUMBER_FOUR;
    }

    private static Boolean validateEmail(String email) {
        return Pattern.matches(EMAIL_REGEX, email);
    }

}
