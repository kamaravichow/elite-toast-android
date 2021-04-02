package me.aravi.toastelite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import me.aravi.elite.Elite;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Elite.builder
                .make();

    }
}