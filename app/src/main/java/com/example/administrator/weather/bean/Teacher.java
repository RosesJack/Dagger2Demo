package com.example.administrator.weather.bean;

import javax.inject.Inject;

/**
 * auther：wzy
 * date：2016/11/29 00 :44
 * desc:
 */

public class Teacher {

    @Inject
    public Teacher() {
    }

    public String name;
    public int age;

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
