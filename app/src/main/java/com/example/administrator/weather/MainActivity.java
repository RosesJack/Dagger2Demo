package com.example.administrator.weather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.weather.bean.ClassMates;
import com.example.administrator.weather.component.DaggerClassMatesComponent;
import com.example.administrator.weather.component.DaggerMainActivityComponent;
import com.example.administrator.weather.component.DaggerPersonComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    /*  @Inject
      Teacher mTeacher;*/
    @Inject
    ClassMates mClassMates;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainActivityComponent.builder()
                //指定第一层Component
                .classMatesComponent(
                        DaggerClassMatesComponent
                                .builder()
                                //指定第二层
                                .personComponent(
                                        DaggerPersonComponent.create()
                                )
                                .build()
                )
                .build()
                .inject(this);
//        mTeacher.name = "wang";
//        mTeacher.age = 15;
//        Toast.makeText(MainActivity.this, mTeacher.toString(), Toast.LENGTH_SHORT).show();
//        mPerson.name = "wang";
//        mPerson.age = 20;
//        Toast.makeText(MainActivity.this, mPerson.toString(), Toast.LENGTH_SHORT).show();
        mClassMates.show();
    }
}
