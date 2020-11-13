package com.example.book70project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Activitypage73 extends AppCompatActivity {
TextView tv1;
SeekBar sk1;
SeekBar sk2;
SeekBar sk3;
int x1=0;
int x2=0;
int x3=0;
Random rnd=new Random();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        tv1=findViewById(R.id.textView3);
        sk1=findViewById(R.id.seekBar);
        sk1.setOnSeekBarChangeListener(skListener);
        sk2=findViewById(R.id.seekBar2);
        sk2.setOnSeekBarChangeListener(skListener);
        sk3=findViewById(R.id.seekBar3);
        sk3.setOnSeekBarChangeListener(skListener);
        x1=rnd.nextInt(sk1.getProgress())+1;
        x2=rnd.nextInt(sk2.getProgress())+1;
        x3=rnd.nextInt(sk3.getProgress())+1;
        updateview();
    }
public void updateview()
{
    int r=x1+x2+x3;
    tv1.setText(r+"");
}
private SeekBar.OnSeekBarChangeListener skListener=new SeekBar.OnSeekBarChangeListener() {
    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        try {
            x1=rnd.nextInt(sk1.getProgress())+1;
            x2=rnd.nextInt(sk2.getProgress())+1;
            x3=rnd.nextInt(sk3.getProgress())+1;

        }
        catch (Exception e)
        {
            if(sk1.getProgress()==sk1.getMin())
                x1=0;
            if(sk2.getProgress()==sk2.getMin())
                x2=0;
            if(sk3.getProgress()==sk3.getMin())
                x3=0;

        } updateview();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
};
//    private SeekBar.OnSeekBarChangeListener sk1Listener=new SeekBar.OnSeekBarChangeListener() {
//        @Override
//        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//            try {
//                x1 = rnd.nextInt(sk1.getProgress());
//            } catch (Exception e) {
//                x1=0;
//            }
//            updateview();
//        }
//
//        @Override
//        public void onStartTrackingTouch(SeekBar seekBar) {
//
//        }
//
//        @Override
//        public void onStopTrackingTouch(SeekBar seekBar) {
//
//        }
//    };
//    private SeekBar.OnSeekBarChangeListener sk2Listener=new SeekBar.OnSeekBarChangeListener() {
//        @Override
//        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//           try {
//               x2=rnd.nextInt(sk2.getProgress());
//           }
//           catch (Exception e)
//           {
//               x3=0;
//           }
//           updateview();
//        }
//
//
//
//        @Override
//        public void onStartTrackingTouch(SeekBar seekBar) {
//
//        }
//
//        @Override
//        public void onStopTrackingTouch(SeekBar seekBar) {
//
//        }
//    };
//    private SeekBar.OnSeekBarChangeListener sk3Listener=new SeekBar.OnSeekBarChangeListener() {
//        @Override
//        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//            try {
//                x3 = rnd.nextInt(sk3.getProgress());
//            } catch (Exception e) {
//                x3 = 0;
//            }
//            updateview();
//
//        }
//
//        @Override
//        public void onStartTrackingTouch(SeekBar seekBar) {
//
//        }
//
//        @Override
//        public void onStopTrackingTouch(SeekBar seekBar) {
//
//        }
//    };
}