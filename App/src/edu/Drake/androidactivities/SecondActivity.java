package edu.Drake.androidactivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SecondActivity extends Activity {

	Button button;
	Button button2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second_activity);
		button = (Button) findViewById(R.id.button1);
		button.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				Intent intent = new Intent(v.getContext(), ThirdActivity.class);
				startActivity(intent);
			}
		});
		
		button2 = (Button) findViewById(R.id.button2);
		button2.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				finish();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second_activity, menu);
		return true;
	}

}
