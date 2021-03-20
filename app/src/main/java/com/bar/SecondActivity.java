package com.bar;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;
import android.view.View.*;
import android.content.*;


public class SecondActivity extends Activity 
{
    private Button back;
	private Intent i = new Intent();
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        
        
        back=(Button) findViewById(R.id.back);
		back.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View v){
					i.setClass(getApplicationContext(),MainActivity.class);
					startActivity(i);
				}
		});
        
    }
}
