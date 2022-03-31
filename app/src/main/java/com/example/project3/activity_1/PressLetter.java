package com.example.project3.activity_1;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.project3.R;

public class PressLetter extends AppCompatActivity {

    private TextView l4;
    private TextView l3;
    private TextView l2;
    private TextView l1;
    private LinearLayout linearLayout;
    private ImageView iv4;
    private ImageView iv3;
    private ImageView iv2;
    private ImageView iv1;
    private ConstraintLayout constrain;
    double[] positionsx = {938, 682.0, 360.0, 134.0};
    double[] positionsy = {1679.0, 1681.0, 1681.0, 1695.0};
    int counter = 0;
    private ImageView ivResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_press_letter);
        initView();

        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                l1.animate()
                        .x((float) positionsx[2] - 50)
                        .y((float) positionsy[2])
                        .setDuration(1000).withEndAction(new Runnable() {
                    @Override
                    public void run() {
                        l1.setX((float) positionsx[2] - 50);
                        l1.setY((float) positionsy[2]);
                    }
                }).start();
                result();

            }
        });

        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                l2.animate()
                        .x((float) positionsx[0] - 50)
                        .y((float) positionsy[0])
                        .setDuration(1000).withEndAction(new Runnable() {
                    @Override
                    public void run() {
                        l2.setX((float) positionsx[0] - 50);
                        l2.setY((float) positionsy[0]);
                    }
                }).start();
                result();

            }
        });
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                l3.animate()
                        .x((float) positionsx[1] - 50)
                        .y((float) positionsy[1])
                        .setDuration(1000).withEndAction(new Runnable() {
                    @Override
                    public void run() {
                        l3.setX((float) positionsx[1] - 50);
                        l3.setY((float) positionsy[1]);
                    }
                }).start();
                result();

            }
        });
        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                l4.animate()
                        .x((float) positionsx[3] - 50)
                        .y((float) positionsy[3])
                        .setDuration(1000).withEndAction(new Runnable() {
                    @Override
                    public void run() {
                        l4.setX((float) positionsx[3] - 50);
                        l4.setY((float) positionsy[3]);
                    }
                }).start();
                result();

            }
        });


        constrain.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Log.d("TAG", "onTouch: x= " + motionEvent.getX() + " y " + motionEvent.getY());
                return false;
            }
        });


    }

    void result() {
        if (counter == 4) {
            ivResult.setVisibility(View.VISIBLE);
        }
    }

    private void initView() {
        l4 = (TextView) findViewById(R.id.l4);
        l3 = (TextView) findViewById(R.id.l3);
        l2 = (TextView) findViewById(R.id.l2);
        l1 = (TextView) findViewById(R.id.l1);
        iv4 = (ImageView) findViewById(R.id.iv4);
        iv3 = (ImageView) findViewById(R.id.iv3);
        iv2 = (ImageView) findViewById(R.id.iv2);
        iv1 = (ImageView) findViewById(R.id.iv1);
        constrain = (ConstraintLayout) findViewById(R.id.constrain);
        ivResult = (ImageView) findViewById(R.id.iv_result);
    }
}