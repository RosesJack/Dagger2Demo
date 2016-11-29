package com.example.administrator.weather.bean;


/**
 * auther：wzy
 * date：2016/11/29 01 :48
 * desc: 构造方法需要传入 抽象父类的 类
 */

public class ClassMates {
    private Person mPerson;

    public ClassMates(Person person) {
        this.mPerson = person;
    }

    public void show() {
        mPerson.show();
    }
}
