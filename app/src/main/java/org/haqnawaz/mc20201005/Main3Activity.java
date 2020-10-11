package org.haqnawaz.mc20201005;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class Main3Activity extends AppCompatActivity {

    String ActivityLog = "Lifecycle Third Activity";


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(ActivityLog, " Activity Started ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(ActivityLog, " Activity Resumed ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(ActivityLog, " Activity Paused ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(ActivityLog, " Activity Started ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(ActivityLog, " Activity Destroyed ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(ActivityLog, " Activity Restarted ");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Log.d(ActivityLog, " Activity Restarted ");
    }
}
