package com.example.parcelablesandbundles;

import android.os.Parcel;
import android.os.Parcelable;

public class Person implements Parcelable {
    private String name;
    private int age;
    private int kids;

    public Person(String name, int age, int kids) {
        this.name = name;
        this.age = age;
        this.kids = kids;
    }

    protected Person(Parcel in) {
        name = in.readString();
        age = in.readInt();
        kids = in.readInt();
    }



    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel in) {
            return new Person(in);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getKids() {
        return kids;
    }

    public void setKids(int kids) {
        this.kids = kids;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeInt(this.age);
        parcel.writeInt(this.kids);
    }


}
