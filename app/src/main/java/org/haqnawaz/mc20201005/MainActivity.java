package org.haqnawaz.mc20201005;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int counter = 0;
    TextView txtView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtView = findViewById(R.id.txtViewMessage);
    }

    public void CounterIncrease(View view) {
        counter++;
        setText(txtView, counter);
    }

    public void CounterDecrease(View view)
    {
        counter--;
        setText(txtView, counter);
    }

    public  void setText (TextView txtView, int counter)
    {
        txtView.setText(String.valueOf(counter));
    }


}
