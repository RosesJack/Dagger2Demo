package com.example.administrator.weather.bean;

import android.util.Log;

import static android.content.ContentValues.TAG;

/**
 * auther：wzy
 * date：2016/11/29 00 :43
 * desc: 抽象父类
 */

public abstract class Person {
    public String name;
    public int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void show() {
        Log.i(TAG, "我是：" + this.getClass().getSimpleName());
    }
}
