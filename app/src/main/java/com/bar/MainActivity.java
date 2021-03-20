package com.bar;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;
import android.view.View.*;
import android.content.*;


public class MainActivity extends Activity 
{
    private Button btn;
	private Intent i = new Intent();
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        
        btn=(Button) findViewById(R.id.btn);
		btn.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View v){
					i.setClass(getApplicationContext(),SecondActivity.class);
					startActivity(i);
				}
		});
        
    }
}
