package com.chandan.android.assignment182;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by CHANDAN on 7/24/2017.
 */

public class MyBroadcastReceiver extends BroadcastReceiver {

    private String TAG = "MyBroadcastReceiver";
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, "Received system broadcast");
        Intent intentStartMainActivity = new Intent(context,
                MainActivity.class);
        intentStartMainActivity.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intentStartMainActivity);
    }
}
