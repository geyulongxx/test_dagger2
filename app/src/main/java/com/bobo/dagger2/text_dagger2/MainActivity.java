package com.bobo.dagger2.text_dagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.bobo.dagger2.text_dagger2.bean.MP3;
import com.bobo.dagger2.text_dagger2.bean.Music;
import com.bobo.dagger2.text_dagger2.bean.User;
import com.bobo.dagger2.text_dagger2.components.DaggerMainComponent;
import com.bobo.dagger2.text_dagger2.module.MainModule;

import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends AppCompatActivity {

    @Inject
    public User user;

    @Inject
    public Music music;

    @Inject
    public MP3 mp3;

    @Inject
    public MP3 mp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView viewById = findViewById(R.id.tv_test);

        DaggerMainComponent.builder().mainModule(new MainModule()).build().inject(this);
        viewById.setText(user.toString() + "\n" + music.toString()
                + "\n" + mp3.toString()
                + "\n" + mp3.equals(mp2));

    }
}
