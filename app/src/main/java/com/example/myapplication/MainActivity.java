package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    private TextView mTextView;
private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

     binding = ActivityMainBinding.inflate(getLayoutInflater());
     setContentView(binding.getRoot());

        mTextView = binding.text;
    }

    public void Bebra(View view) {
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }

    public void Button2(View view) { Intent intent = new Intent(this,MainActivity3.class);
        startActivity(intent);

    }

    public void Button3(View view) {
        Intent intent = new Intent(this,MainActivity4.class);
        startActivity(intent);
    }
}