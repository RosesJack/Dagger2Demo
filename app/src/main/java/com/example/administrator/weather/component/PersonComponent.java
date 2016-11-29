package com.example.administrator.weather.component;

import com.example.administrator.weather.annotation.ParentPerson;
import com.example.administrator.weather.annotation.StudentPerson;
import com.example.administrator.weather.bean.Person;
import com.example.administrator.weather.module.PersonModule;

import dagger.Component;

/**
 * auther：wzy
 * date：2016/11/30 01 :08
 * desc: 抽象父类Person的两个子类的注入组件
 */
@Component(modules = PersonModule.class)
public interface PersonComponent {
    //Component中也要用注解来区分不同的子类
    @StudentPerson
    Person getStudent();

    @ParentPerson
    Person getParent();
}
