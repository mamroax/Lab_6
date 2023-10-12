package com.example.lab_6;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setPadding(30, 30, 30, 30);
        Bundle arguments = getIntent().getExtras();

        Student student;
        if (arguments!=null){
            student = (Student) arguments.getSerializable(Student.class.getSimpleName());
            textView.setText("Имя: " + student.getFirstName() + " " + student.getLastName());
        }
        setContentView(textView);
    }
}
