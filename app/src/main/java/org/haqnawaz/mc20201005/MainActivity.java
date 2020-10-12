package org.haqnawaz.mc20201005;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int counter = 0;
    TextView txtView = null;
    String Activitylog = "Lifecycle Main Activity";

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
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("CounterSavedValue", counter);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        counter = savedInstanceState.getInt("CounterSavedValue");
        setText(txtView, counter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtView = findViewById(R.id.txtViewMessage);
        Log.d(Activitylog, "Activity Created");
    }

    public void CounterIncrease(View view) {
        counter++;
        setText(txtView, counter);
    }

    public void CounterDecrease(View view)
    {
        counter--;
        setText(txtView, counter);
        int i =0;
    }

    public  void setText (TextView txtView, int counter)
    {
        txtView.setText(String.valueOf(counter));
    }

    public  void ShowAnotherActivity (View view)
    {
        Intent intent = new Intent(this, Main2Activity.class);
        String message = "Test";
        intent.putExtra("Message",message);
        startActivity(intent);
    }

    public void ShowLifeCycleActivity (View view)
    {
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
        int i = 0;
    }

}
