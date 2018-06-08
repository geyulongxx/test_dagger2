package com.bobo.dagger2.text_dagger2.bean;


public class MP3 {
    public String name;

    public MP3(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MP3{" +
                "name='" + name + '\'' +
                '}';
    }
}
