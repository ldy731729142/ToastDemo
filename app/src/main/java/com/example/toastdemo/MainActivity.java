package com.example.toastdemo;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();


    }

    public void MyToast(String str, int showTime) {
        View view= LayoutInflater.from(this).inflate(R.layout.view_toast_custom,null);
        TextView tv_msg = (TextView) view.findViewById(R.id.tvToast);
        tv_msg.setText(str);
        Toast toast = new Toast(this);
        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 20);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(view);
        toast.show();

    }

    private void initViews() {
        btnToast = findViewById(R.id.btnToast);
        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyToast("陈浩是个大坏蛋！", 1100);
            }
        });
    }
}
