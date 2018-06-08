package com.bobo.dagger2.text_dagger2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.bobo.dagger2.text_dagger2.bean.Music;
import com.bobo.dagger2.text_dagger2.bean.User;
import com.bobo.dagger2.text_dagger2.components.DaggerDetailComponent;

import javax.inject.Inject;

public class DetailActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView viewById = findViewById(R.id.tv_test);

    }
}
