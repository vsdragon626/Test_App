package edu.Drake.androidactivities;

import android.app.Activity;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ThirdActivity extends Activity {

	Button button1;
	Button button3;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_third);
		//This line and mp.start I got from stack overflow as a way to play audio, though after reading the documentation
		//I understand how this code works though I am leaving the disclaimer here because that is where I originally found
		//this bit of code
		//Also the audio playing is from a web series DBZ abridged by Team Four Star, it is not my work
		final MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.quack);
		
		button1 = (Button) findViewById(R.id.button1);
		button1.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				mp.start();
			}
		});
		
		button3 = (Button) findViewById(R.id.button3);
		button3.setOnClickListener(new OnClickListener(){
			public void onClick(View v){   
				mp.setOnCompletionListener(new OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
				finish();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_third, menu);
		return true;
	}

}
