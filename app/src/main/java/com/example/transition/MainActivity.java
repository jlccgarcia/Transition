package com.example.transition;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ImageView image = new ImageView(this);
        setContentView(image);
        TransitionDrawable transition = (TransitionDrawable)
                ContextCompat.getDrawable(this, R.drawable.transicion);
        image.setImageDrawable(transition);
        transition.startTransition(2000);
    }
}
