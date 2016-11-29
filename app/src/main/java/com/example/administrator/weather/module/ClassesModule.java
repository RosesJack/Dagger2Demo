package com.example.administrator.weather.module;

import com.example.administrator.weather.annotation.StudentPerson;
import com.example.administrator.weather.bean.ClassMates;
import com.example.administrator.weather.bean.Person;

import dagger.Module;
import dagger.Provides;

/**
 * auther：wzy
 * date：2016/11/29 16 :37
 * desc:
 */
@Module
public class ClassesModule {
    @Provides
    public ClassMates provideClassesMate(@StudentPerson Person person) {
        return new ClassMates(person);
    }
}
