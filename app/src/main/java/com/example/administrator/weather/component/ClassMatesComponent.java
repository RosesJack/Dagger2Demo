package com.example.administrator.weather.component;

import com.example.administrator.weather.bean.ClassMates;
import com.example.administrator.weather.module.ClassesModule;

import dagger.Component;

import static android.os.Build.VERSION_CODES.M;

/**
 * auther：wzy
 * date：2016/11/30 01 :12
 * desc:
 */
@Component(modules = ClassesModule.class, dependencies = PersonComponent.class)
public interface ClassMatesComponent {
    ClassMates getClassMates();
}
