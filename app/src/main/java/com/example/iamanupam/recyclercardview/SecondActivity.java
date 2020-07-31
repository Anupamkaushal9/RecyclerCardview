package com.example.iamanupam.recyclercardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String status = "Nothing";
        if (getIntent().hasExtra("type_status")) {
            status = getIntent().getStringExtra("type_status");
        }
        TextView tvShowStatus = findViewById(R.id.tvShowStatus);
        tvShowStatus.setText(status);

        String btnstatus = "Empty";
        if (getIntent().hasExtra(("button_status1"))) {
            btnstatus = getIntent().getStringExtra(("button_status1"));
        }
        TextView radioStatus = findViewById(R.id.radioStatus);
        radioStatus.setText(btnstatus);

    }
}
