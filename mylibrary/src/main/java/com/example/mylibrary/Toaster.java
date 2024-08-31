package com.example.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class Toaster {
    public void showMessage(String message, Context context){
        Toast.makeText(context,message,Toast.LENGTH_LONG).show();
    }
}
