package com.bobo.dagger2.text_dagger2.components;

import com.bobo.dagger2.text_dagger2.DetailActivity;
import com.bobo.dagger2.text_dagger2.MainActivity;
import com.bobo.dagger2.text_dagger2.module.DetailModule;

import dagger.Component;

@Component(modules=DetailModule.class)
public interface DetailComponent {
    void inject(DetailActivity detailActivity);
}
