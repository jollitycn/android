package com.jollity.androidexamples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.androidexamples.R;
import com.example.testlibaar.TestTip;

/**
 * The type Main activity.
 */
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TestTip tip =  new TestTip();
        //the extend libnary used
        tip.function2(1, "2");
        tip.function1(1,"test");
    }
}
