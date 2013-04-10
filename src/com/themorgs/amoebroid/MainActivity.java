package com.themorgs.amoebroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.EditText;
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }
    
    public void send(View view)
    {
        TextView result = (TextView) findViewById(R.id.text_result);
        EditText input = (EditText) findViewById(R.id.edit_message);
        
        if (input.getText().toString().toLowerCase().equals("Go East".toLowerCase())){
            result.setText("You see sand");
        }
        else if (input.getText().toString().toLowerCase().equals("Go West".toLowerCase())){
            
                result.setText("You see sand and a cactus");
        }
        else if (input.getText().toString().toLowerCase().equals("Go North".toLowerCase())){
            
                result.setText("You see sand");
        }
        else if (input.getText().toString().toLowerCase().equals("Go South".toLowerCase())){
            
                result.setText("You see sand");
        }
        else {
            
            result.setText("You can't do that - dickhead");
                
        }
            
    }
}
