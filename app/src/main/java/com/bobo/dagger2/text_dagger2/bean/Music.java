package com.bobo.dagger2.text_dagger2.bean;

public class Music {

    private MP3 mp3;

    public Music(MP3 mp3) {
        this.mp3 = mp3;
    }

    @Override
    public String toString() {
        return "Music{" +
                "mp3=" + mp3 +
                '}';
    }
}
