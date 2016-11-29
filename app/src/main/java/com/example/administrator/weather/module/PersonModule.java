package com.example.administrator.weather.module;

import com.example.administrator.weather.annotation.ParentPerson;
import com.example.administrator.weather.annotation.StudentPerson;
import com.example.administrator.weather.bean.Parent;
import com.example.administrator.weather.bean.Person;
import com.example.administrator.weather.bean.Student;

import dagger.Module;
import dagger.Provides;

/**
 * auther：wzy
 * date：2016/11/29 14 :43
 * desc:
 */
@Module
public class PersonModule {
    @Provides
    @StudentPerson
    public Person providePerson() {
        return new Student();
    }

    @Provides
    @ParentPerson
    public Person provideParent() {
        return new Parent();
    }
}
