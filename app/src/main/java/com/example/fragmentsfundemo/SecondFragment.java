package com.example.fragmentsfundemo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;


public class SecondFragment extends Fragment {

    Bundle b;
    String str;
    TextView text_result;
    Button button_outer;

    public SecondFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        text_result = view.findViewById(R.id.text_result);

        b = getArguments();
        str = b.getString("text_input").toUpperCase(Locale.ROOT);
        text_result.setText(str);

        button_outer = view.findViewById(R.id.button_outer);
        button_outer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = text_result.getText().toString();
                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.acceptData(result);
            }
        });

        return view;
    }
}