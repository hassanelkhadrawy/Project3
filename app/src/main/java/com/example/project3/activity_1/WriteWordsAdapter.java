package com.example.project3.activity_1;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project3.R;

import java.util.ArrayList;
import java.util.List;

public class WriteWordsAdapter extends RecyclerView.Adapter<WriteWordsAdapter.View_Holder> {
    String[] listQiestions;
    private TextView txtQuestion;
    private TextView sin;
    private EditText txtWord3;
    private EditText txtWord2;
    private EditText txtWord1;
    ArrayList<ArrayList<String>> allanswerList;
    ArrayList<String> answer_item = new ArrayList<>();
    ArrayList<String> answer_item1 = new ArrayList<>();
    ArrayList<String> answer_item2 = new ArrayList<>();
    ArrayList<String> answer_item3 = new ArrayList<>();



    public WriteWordsAdapter(String[] listQiestions, ArrayList<ArrayList<String>> allanswerList, ArrayList<String> answerItem, ArrayList<String> answer_item1, ArrayList<String> answer_item2, ArrayList<String> answer_item3) {
        this.listQiestions = listQiestions;
        this.allanswerList = allanswerList;
        this.answer_item = answerItem;
        this.answer_item1 = answer_item1;
        this.answer_item2 = answer_item2;
        this.answer_item3 = answer_item3;

    }

    @NonNull
    @Override
    public View_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new View_Holder(LayoutInflater.from(parent.getContext()).inflate(
                R.layout.write_words_item, parent, false
        ));
    }

    @Override
    public void onBindViewHolder(@NonNull View_Holder holder, int position) {

        txtQuestion.setText("" + listQiestions[position]);

    }

    @Override
    public int getItemCount() {
        return listQiestions.length;
    }
/*    public ArrayList<String> AnswersItem1(){
        return answer_item1;
    }
    public ArrayList<String> AnswersItem2(){
        return answer_item2;
    }
    public ArrayList<String> AnswersItem3(){
        return answer_item3;
    }*/

    public ArrayList<ArrayList<String>> AnswersItem() {
        return allanswerList;
    }

    public class View_Holder extends RecyclerView.ViewHolder {
        public View_Holder(@NonNull View itemView) {
            super(itemView);
            initView(itemView);
        }

        private void initView(View view) {
            txtQuestion = (TextView) view.findViewById(R.id.txt_question);
            sin = (TextView) view.findViewById(R.id.tv_sign);
            txtWord3 = (EditText) view.findViewById(R.id.txt_word_3);
            txtWord2 = (EditText) view.findViewById(R.id.txt_word_2);
            txtWord1 = (EditText) view.findViewById(R.id.txt_word_1);


            txtWord1.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    if (getAdapterPosition() == 0) {
                        answer_item.set(0, charSequence.toString());
                        allanswerList.set(getAdapterPosition(), answer_item);

                    } else if (getAdapterPosition() == 1) {
                        answer_item1.set(0, charSequence.toString());
                        allanswerList.set(getAdapterPosition(), answer_item1);

                    } else if (getAdapterPosition() == 2) {
                        answer_item2.set(0, charSequence.toString());
                        allanswerList.set(getAdapterPosition(), answer_item2);

                    } else if (getAdapterPosition() == 3) {
                        answer_item3.set(0, charSequence.toString());
                        allanswerList.set(getAdapterPosition(), answer_item3);

                    }

                    allanswerList.set(getAdapterPosition(), answer_item);
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
            txtWord2.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    if (getAdapterPosition() == 0) {
                        answer_item.set(1, charSequence.toString());
                        allanswerList.set(getAdapterPosition(), answer_item);

                    } else if (getAdapterPosition() == 1) {
                        answer_item1.set(1, charSequence.toString());
                        allanswerList.set(getAdapterPosition(), answer_item1);

                    } else if (getAdapterPosition() == 2) {
                        answer_item2.set(1, charSequence.toString());
                        allanswerList.set(getAdapterPosition(), answer_item2);

                    } else if (getAdapterPosition() == 3) {
                        answer_item3.set(1, charSequence.toString());
                        allanswerList.set(getAdapterPosition(), answer_item3);

                    }

                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
            txtWord3.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    if (getAdapterPosition() == 0) {
                        answer_item.set(2, charSequence.toString());
                        allanswerList.set(getAdapterPosition(), answer_item);

                    } else if (getAdapterPosition() == 1) {
                        answer_item1.set(2, charSequence.toString());
                        allanswerList.set(getAdapterPosition(), answer_item1);

                    } else if (getAdapterPosition() == 2) {
                        answer_item2.set(2, charSequence.toString());
                        allanswerList.set(getAdapterPosition(), answer_item2);

                    } else if (getAdapterPosition() == 3) {
                        answer_item3.set(2, charSequence.toString());
                        allanswerList.set(getAdapterPosition(), answer_item3);

                    }


                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
        }
    }

}
