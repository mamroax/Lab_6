package com.example.mylab6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText nameText;
    EditText secondNameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Human human1 = new Student("Nikita", "Ivanov");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        nameText = findViewById(R.id.editTextText);
        secondNameText = findViewById(R.id.editTextText2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nameText.getText().toString();
                String secondName = secondNameText.getText().toString();
                Student student1 = new Student(name, secondName);
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra(Student.class.getSimpleName(), student1);
                startActivity(intent);
            }
        });
    }
}