package com.example.jeff.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class NetBroad extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("augusto", "net status changed");
    }
}
