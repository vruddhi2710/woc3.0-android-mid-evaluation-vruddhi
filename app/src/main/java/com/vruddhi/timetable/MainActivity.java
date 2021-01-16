package com.vruddhi.timetable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnMon;
    private Button btnTue;
    private Button btnWed;
    private Button btnThu;
    private Button btnFri;
    private Button btnSat;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            btnMon=(Button)findViewById(R.id.btnMon);
            btnMon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openMondayTimeTable();
                }
            });

            btnTue=(Button)findViewById(R.id.btnTue);
            btnTue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openTuesdayTimeTable();
                }
            });

            btnWed=(Button)findViewById(R.id.btnWed);
            btnWed.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openWednesdayTimeTable();
                }
            });

            btnThu=(Button)findViewById(R.id.btnThu);
            btnThu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openThursdayTimeTable();
                }
            });

            btnFri=(Button)findViewById(R.id.btnFri);
            btnFri.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openFridayTimeTable();
                }
            });

            btnSat=(Button)findViewById(R.id.btnSat);
            btnSat.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openSaturdayTimeTable();
                }
            });


        }

        public void openMondayTimeTable(){
            Intent intent=new Intent(this, Monday_Activity.class);
            startActivity(intent);
        }

    public void openTuesdayTimeTable(){
        Intent intent=new Intent(this, TuesdayActivity.class);
        startActivity(intent);
    }

    public void openWednesdayTimeTable(){
        Intent intent=new Intent(this, WednesdayActivity.class);
        startActivity(intent);
    }

    public void openThursdayTimeTable(){
        Intent intent=new Intent(this, ThursdayActivity.class);
        startActivity(intent);
    }
    public void openFridayTimeTable(){
        Intent intent=new Intent(this, FridayActivity.class);
        startActivity(intent);
    }
    public void openSaturdayTimeTable(){
        Intent intent=new Intent(this, SaturdayActivity.class);
        startActivity(intent);
    }
}
