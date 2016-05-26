package com.raceahead_;

import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;

public class Terminate extends TimerTask {

	Activity act;
	
	Terminate(Activity a)
	{
	      act=a;
		
	}
	
	@Override
	public void run() {
		act.finish();
		Intent intent = new Intent(
				act, Resume.class
    			);
    			
    			startActivity(intent);
		
				
			
	}

	private void startActivity(Intent intent) {
		// TODO Auto-generated method stub
		
	}


}
