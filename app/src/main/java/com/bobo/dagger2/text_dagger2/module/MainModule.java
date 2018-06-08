package com.bobo.dagger2.text_dagger2.module;

import com.bobo.dagger2.text_dagger2.bean.MP3;
import com.bobo.dagger2.text_dagger2.bean.Music;
import com.bobo.dagger2.text_dagger2.bean.User;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {


    @Provides
    public User getUser() {
        User user = new User();
        user.name = "xiaoming";
        return user;
    }

    @Provides
    public MP3 getMp3() {
        MP3 music = new MP3("给我一首歌的时间");
        return music;
    }



    @Provides
    public Music getMusic(MP3 mp3) {
        return new Music(mp3);
    }
}
