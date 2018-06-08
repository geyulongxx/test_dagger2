package com.bobo.dagger2.text_dagger2.components;

import com.bobo.dagger2.text_dagger2.MainActivity;
import com.bobo.dagger2.text_dagger2.module.DetailModule;
import com.bobo.dagger2.text_dagger2.module.MainModule;

import javax.inject.Singleton;

import dagger.Component;
@Component(modules={MainModule.class,DetailModule.class})
public interface MainComponent {
    void inject(MainActivity mainActivity);
}