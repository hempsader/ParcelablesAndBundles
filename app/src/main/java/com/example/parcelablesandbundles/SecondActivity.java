package com.example.parcelablesandbundles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView name;
    private TextView age;
    private TextView kids;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        name = findViewById(R.id.textView_name);
        age = findViewById(R.id.textView_age);
        kids = findViewById(R.id.textView_kids);

        //Retrieve the data bundle
        Bundle bundle = getIntent().getExtras().getParcelable("key");

        //Retrive the Person object
        Person person = (Person) bundle.get("keyPerson");

        //Consume data
        name.setText(person.getName());
        age.setText(String.valueOf(person.getAge()));
        kids.setText(String.valueOf(person.getKids()));
    }
}