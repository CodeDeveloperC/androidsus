package com.example.administrator.hello;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.facebook.drawee.view.SimpleDraweeView;

public class MainActivity extends AppCompatActivity {

    private SimpleDraweeView mSimpleDraweeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSimpleDraweeView = (SimpleDraweeView)findViewById(R.id.simpleDraweeView);
        mSimpleDraweeView.setImageURI(Uri.parse("https://img.alicdn.com/tfs/TB1bnXuk7voK1RjSZFDXXXY3pXa-520-280.jpg_q90_.webp"));

        System.out.println();
    }
}
