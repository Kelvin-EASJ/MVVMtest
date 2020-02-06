package com.example.mvvmtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView textView;
    public EditText editText;
    public Button button;
    public String changedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
    }



//        editText.addTextChangedListener(new TextWatcher() {
//            public void afterTextChanged(Editable s) {   //Convert the Text to String
//                String inputText = editText.getText().toString();
//                textView.setText(inputText);
//            }
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//                // TODO Auto-generated method stub
//            }
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                // TODO Auto-generated method stub
//            }
//        });


    public void changeText(View view) {
        String inputText = editText.getText().toString();
        textView.setText(inputText);

    }
}
