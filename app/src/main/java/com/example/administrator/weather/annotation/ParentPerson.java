package com.example.administrator.weather.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * auther：wzy
 * date：2016/11/29 16 :01
 * desc:
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface ParentPerson {

}
