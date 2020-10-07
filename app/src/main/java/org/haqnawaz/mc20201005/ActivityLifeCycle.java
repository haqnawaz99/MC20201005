package org.haqnawaz.mc20201005;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityLifeCycle extends AppCompatActivity {

    TextView textView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        textView = findViewById(R.id.txtViewActivityLog);
        textView.append("onCreate invoked\n");
    }

    @Override
    protected void onStart() {
        super.onStart();
        textView.append("onStart invoked\n");

    }
    @Override
    protected void onResume() {
        super.onResume();

        textView.append("onResume invoked\n");

    }
    @Override
    protected void onPause() {
        super.onPause();
        textView.append("onPause invoked\n");

    }
    @Override
    protected void onStop() {
        super.onStop();
        textView.append("onStop invoked\n");

    }
    @Override
    protected void onRestart() {
        super.onRestart();
        textView.append("onRestart invoked\n");

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        textView.append("onDestroy invoked\n");

    }

    public void closeActivity (View view) {
        finish();
    }
}