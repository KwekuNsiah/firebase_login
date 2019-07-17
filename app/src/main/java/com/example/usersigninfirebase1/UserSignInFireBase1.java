package com.example.usersigninfirebase1;

import android.app.Application;
import android.os.Bundle;

import com.firebase.client.Firebase;


public class UserSignInFireBase1 extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
