package com.example.administrator.weather.component;

import com.example.administrator.weather.MainActivity;

import dagger.Component;

/**
 * auther：wzy
 * date：2016/11/29 00 :51
 * desc:
 */

@Component(dependencies = ClassMatesComponent.class)
public interface MainActivityComponent {
    void inject(MainActivity activity);
}