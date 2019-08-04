package com.homework.utils.validator;

import java.io.File;

/**
 * @author ：old_uncle_zhang
 * @date ：Created in 2019/8/3 22:46
 * @description：
 * @modified By：
 */
public class FileValidator {

    private static final String FILE_TYPE_TXT = "txt";

    public static void validateFile(String path) {
        isExist(path);
        endWithTxt(path);
    }

    private static void isExist(String path) {
        File file = new File(path);
        if (!file.exists() || !file.isFile()) {
            throw new RuntimeException("文件不存在");
        }
    }

    private static void endWithTxt(String path) {
        if (!path.toLowerCase().endsWith(FILE_TYPE_TXT)) {
            throw new RuntimeException("文件类型不是txt");
        }
    }


}
