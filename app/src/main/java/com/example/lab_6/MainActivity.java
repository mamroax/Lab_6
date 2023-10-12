package com.example.lab_6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nameText;
    EditText secondNameText;
    Button button;

//    Human human1 = new Student();
//    Human human2 = new Student("Ivan", "Ivanov");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameText = findViewById(R.id.editTextText);
        secondNameText = findViewById(R.id.editTextText3);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nameText.getText().toString();
                String lastName = secondNameText.getText().toString();
                Student student1 = new Student(name, lastName);

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra(Student.class.getSimpleName(), student1);
                startActivity(intent);
            }
        });
    }
}