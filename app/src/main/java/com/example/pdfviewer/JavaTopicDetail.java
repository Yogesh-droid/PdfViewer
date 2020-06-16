package com.example.pdfviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class JavaTopicDetail extends AppCompatActivity {

    EditText editText;
    String[]topicDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_topic_detail);

        topicDetail=getResources().getStringArray(R.array.java_topic_details);

        editText=findViewById(R.id.editText);

        int postion=getIntent().getExtras().getInt("position");
        editText.setText(topicDetail[postion]);
    }
}
