package com.homework.utils;

import com.homework.bean.User;
import com.homework.validator.FileValidator;
import com.homework.validator.UserValidator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Optional;

/**
 * @author ：old_uncle_zhang
 * @date ：Created in 2019/8/3 12:18
 * @description：
 * @modified By：
 */
public class FileUtil {

    public static void readFile(String path) {

        FileValidator.validateFile(path);

        String line;
        try (FileInputStream fileInputStream = new FileInputStream(path);
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            while ((line = bufferedReader.readLine()) != null) {
                Optional.ofNullable(buildUser(line)).ifPresent(user -> {
                    System.out.println(user);
                    if (DateUtil.isBirthday(user.getBirthday())) {
                        System.out.println(user.getName() + " : happy birthday!");
                    }
                });
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static User buildUser(String content) {
        String[] contentArr = content.split(",");

        String[] userInfo = Arrays.stream(contentArr).map(String::trim).toArray(String[]::new);

        if (UserValidator.validateUser(userInfo)) {
            User user = new User();
            user.setName(userInfo[1]);
            user.setBirthday(DateUtil.formatDate(userInfo[2]));
            user.setEmail(userInfo[3]);
            return user;
        }
        return null;
    }

}
