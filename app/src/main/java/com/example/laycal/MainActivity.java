package com.example.laycal;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class MainActivity extends Activity {
MediaPlayer m;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		m=MediaPlayer.create(this, R.raw.ele);
		m.start();

		Thread t=new Thread()
		{
			public void run()
			{
				try {
					sleep(5000);
					Intent i=new Intent(MainActivity.this,CalcActivity.class);
					startActivity(i);
				} catch (Exception e) {

				}
				

				
				
			}
			
			
			
		};
	
	t.start();
	
	}
	
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		if(m.isPlaying())
			{
			m.stop();
			}

		finish();
	}
	

}
