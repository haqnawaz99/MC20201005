package org.haqnawaz.mc20201005;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    TextView textView = null;
    int counter = 0;

    String Activitylog = "Lifecycle Second Activity";

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(Activitylog, "Activity Started");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(Activitylog, "Activity Stopped");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(Activitylog, "Activity Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(Activitylog, "Activity Paused");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(Activitylog, "Activity Destroyed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(Activitylog, "Activity Restarted");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.textView3);
        Log.d(Activitylog, "Activity Created");

        String PreviousActivityText = getIntent().getStringExtra("Message");
        Button CallNumberButton = findViewById(R.id.btnCall);
        CallNumberButton.setText(PreviousActivityText);

    }

    public  void Call(View view){
        Uri uri = Uri.parse("tel:");
        Intent intent = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(intent);
    }

    public  void ShowWebsite(View view){
        Uri uri = Uri.parse("http://www.pucit.edu.pk");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);

    }

    public void Plus(View view){
        counter++;
        textView.setText(String.valueOf(counter));
    }

    public void ShowLifeCycleActivity (View view)
    {
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }

}
