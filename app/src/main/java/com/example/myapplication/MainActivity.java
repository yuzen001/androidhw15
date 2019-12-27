package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String msg = "Hello World!";
                Toast toast = Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        bt2 = (Button) findViewById(R.id.button2);
        bt2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //產生視窗物件
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("對話視窗測試")   		//設定視窗標題
                        .setIcon(R.mipmap.ic_launcher)	//設定對話視窗圖示
                        .setMessage("這是一個對話視窗")	//設定顯示的文字
                        .setPositiveButton("關閉視窗",new DialogInterface.OnClickListener(){
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        })			//設定結束的子視窗
                        .show();		//呈現對話視窗



            }
        });



    }
}