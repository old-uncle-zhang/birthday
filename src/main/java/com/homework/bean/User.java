package com.homework.bean;

import java.time.LocalDate;

/**
 * @author ：old_uncle_zhang
 * @date ：Created in 2019/8/3 22:27
 * @description：
 * @modified By：
 */
public class User {

    private String name;
    private LocalDate birthday;
    private String email;


    public User() {
    }

    public User(String name, LocalDate birthday, String email) {
        this.name = name;
        this.birthday = birthday;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", email='" + email + '\'' +
                '}';
    }
}
