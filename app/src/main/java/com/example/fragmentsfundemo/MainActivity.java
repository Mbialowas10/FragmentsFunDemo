package com.example.fragmentsfundemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button_frag1;
    Button button_frag2;
    TextView outer_result;
    Bundle b;
    String result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // get reference to ui controls
        button_frag1 = findViewById(R.id.button_frag1);
        button_frag2 = findViewById(R.id.button_frag2);

        button_frag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();


                FirstFragment firstFragment = new FirstFragment(); // creates a new fragment

                ft.replace(R.id.frame,firstFragment ); // adding the fragment to the actitivity
                ft.commit();
            }
        });
        button_frag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm2 = getSupportFragmentManager();
                FragmentTransaction ft2 = fm2.beginTransaction();
                SecondFragment secondFragment = new SecondFragment();

                ft2.replace(R.id.frame, secondFragment);
                ft2.commit();
            }
        });

    }
    public void acceptData(String result)
    {
        outer_result = findViewById(R.id.outer_result);
        outer_result.setText(result);
    }
}