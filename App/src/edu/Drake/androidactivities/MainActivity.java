//Author: Thomas Jurkiewicz
//Audio track on third screen from DBZ abridged by Team Four Star (its hilarious!), it is not my work
//This is the first assignment for CS 188 Software Development
//It has three screens with different content on each one
//Also the image used in the first screen of this app is from xkcd.com and is not my work

package edu.Drake.androidactivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
//import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	//private static final String TAG = "MainActivity";
	Button button;
	//int count = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		button = (Button) findViewById(R.id.button1);
		button.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				//count++;
				//Log.v(TAG, "Main Button Pressed "+count+" times.");
				Intent intent = new Intent(v.getContext(), SecondActivity.class);
				startActivity(intent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
