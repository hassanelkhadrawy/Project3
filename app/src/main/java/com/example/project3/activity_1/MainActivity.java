package com.example.project3.activity_1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project3.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvWriteWords;
    WriteWordsAdapter writeWordsAdapter;
    String[] Questions = {"أكتب ثلاث كلمات تشتمل على حرف  ( ه , ـهـ )؟ ", "أكتب ثلاث كلمات تشتمل على حرف  ( ـيـ , ي )؟ ", "أكتب ثلاث كلمات تشتمل على حرف  ( عـ , ع )؟ ", "أكتب ثلاث كلمات تشتمل على حرف  ( صـ , ص )؟ "};
    private ExtendedFloatingActionButton submitBtn;
    private static final String TAG = "MainActivity";
    ArrayList<String> answer_item = new ArrayList<>();
    ArrayList<String> answer_item1 = new ArrayList<>();
    ArrayList<String> answer_item2 = new ArrayList<>();
    ArrayList<String> answer_item3 = new ArrayList<>();

    ArrayList<ArrayList<String>> allanswerList = new ArrayList();
    private TextView result;
    private MaterialButton next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        rvWriteWords.setLayoutManager(new LinearLayoutManager(this));
        answer_item.add(0, "dfsdds");
        answer_item.add(1, "dfsdds");
        answer_item.add(2, "dfsdds");

        answer_item1.add(0, "dfsdds");
        answer_item1.add(1, "dfsdds");
        answer_item1.add(2, "dfsdds");

        answer_item2.add(0, "dfsdds");
        answer_item2.add(1, "dfsdds");
        answer_item2.add(2, "dfsdds");

        answer_item3.add(0, "dfsdds");
        answer_item3.add(1, "dfsdds");
        answer_item3.add(2, "dfsdds");

        allanswerList.add(0, answer_item);
        allanswerList.add(1, answer_item1);
        allanswerList.add(2, answer_item2);
        allanswerList.add(3, answer_item3);

        writeWordsAdapter = new WriteWordsAdapter(Questions, allanswerList, answer_item, answer_item1, answer_item2, answer_item3);
        rvWriteWords.setAdapter(writeWordsAdapter);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,PressLetter.class));
            }
        });

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int counter = 0;
                Log.d(TAG, "onClick: out " + writeWordsAdapter.AnswersItem().size());


                for (int x = 0; x <= writeWordsAdapter.AnswersItem().size() - 1; x++) {


                    Log.d(TAG, "onClick: innn" + x + " == " + writeWordsAdapter.AnswersItem().get(x).get(0));
                    Log.d(TAG, "onClick: innn" + x + " == " + writeWordsAdapter.AnswersItem().get(x).get(1));
                    Log.d(TAG, "onClick: innn" + x + " == " + writeWordsAdapter.AnswersItem().get(x).get(2));
                    if (x == 0) {
                        if (writeWordsAdapter.AnswersItem().get(x).get(0).contains("ه") &&
                                writeWordsAdapter.AnswersItem().get(x).get(1).contains("ه") &&
                                writeWordsAdapter.AnswersItem().get(x).get(2).contains("ه")) {
                            counter++;

                        }
                    } else if (x == 1) {
                        if (writeWordsAdapter.AnswersItem().get(x).get(0).contains("ي") &&
                                writeWordsAdapter.AnswersItem().get(x).get(1).contains("ي") &&
                                writeWordsAdapter.AnswersItem().get(x).get(2).contains("ي")) {
                            counter++;

                        }
                    } else if (x == 2) {
                        if (writeWordsAdapter.AnswersItem().get(x).get(0).contains("ع") &&
                                writeWordsAdapter.AnswersItem().get(x).get(1).contains("ع") &&
                                writeWordsAdapter.AnswersItem().get(x).get(2).contains("ع")) {
                            counter++;

                        }
                    } else if (x == 3) {
                        if (writeWordsAdapter.AnswersItem().get(x).get(0).contains("ص") &&
                                writeWordsAdapter.AnswersItem().get(x).get(1).contains("ص") &&
                                writeWordsAdapter.AnswersItem().get(x).get(2).contains("ص")) {
                            counter++;

                        }
                    }

                }


                result.setText("النتيجة " + counter + "من " + Questions.length);

                submitBtn.setVisibility(View.GONE);
                next.setVisibility(View.VISIBLE);

            }
        });
    }

    private void initView() {
        rvWriteWords = (RecyclerView) findViewById(R.id.rv_write_Words);
        submitBtn = (ExtendedFloatingActionButton) findViewById(R.id.submit_btn);
        result = (TextView) findViewById(R.id.result);
        next = (MaterialButton) findViewById(R.id.next);
    }
}