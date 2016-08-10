package com.example.rio.animationexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view){
        ImageView firstImg = (ImageView) findViewById(R.id.firstImage);
        firstImg.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);



        //firstImg.animate().translationXBy(1350f).setDuration(2000);

//        ImageView secondImg = (ImageView) findViewById(R.id.flyingImg);
//        secondImg.animate().alpha(1f).setDuration(2000);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    /*
        ImageView firstImg = (ImageView) findViewById(R.id.firstImage);
        firstImg.setTranslationX(-1350f);

    */
    }
}
