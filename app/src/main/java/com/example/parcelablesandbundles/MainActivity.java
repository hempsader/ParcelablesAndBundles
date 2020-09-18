package com.example.parcelablesandbundles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.util.Size;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bundle and Parcels are NOT recomanded to be saved on disk or send it over internet.
        //Those classes are recommended when send data over another activities.


        //Initialise Parcelable Object
        Person person = new Person("Joe",40,4);
        Bundle bundle = new Bundle();
        bundle.putParcelable("keyPerson",person);
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("key",bundle);

        //If we need to send primitive value or String we can simply use:

        //   intent.putExtra(key, primitive/string); //No need to create Parcelable object

        //Starting the next activity
        startActivity(intent);

    }
}