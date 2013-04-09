package com.themorgs.amoebroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public void send(View view)
    {
        TextView result = (TextView) findViewById(R.id.text_result);
        result.setText("You see sand");
    }
}
