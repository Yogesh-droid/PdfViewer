package com.example.pdfviewer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class Java_content_activity extends AppCompatActivity {
String s;

Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_content_activity);
        toolbar=findViewById(R.id.javaToolbar);
        setSupportActionBar(toolbar);

        FragmentManager fm=getSupportFragmentManager();

        s=getIntent().getExtras().getString("card");

        switch (s)
        {
            case "basic":
            fm.beginTransaction().add(R.id.frame,new Java_basic_frag()).commit();
            break;
            case "adv":
                fm.beginTransaction().add(R.id.frame,new JavaAdv()).commit();
                break;
            case"cheats":
                fm.beginTransaction().add(R.id.frame,new Java_cheats()).commit();
                break;
            case"vid":
                fm.beginTransaction().add(R.id.frame,new Java_vid()).commit();
                break;
        }
    }
}
