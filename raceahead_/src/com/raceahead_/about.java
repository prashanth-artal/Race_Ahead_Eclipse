
package com.raceahead_;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;


public class about extends Activity implements OnClickListener{

	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        
        
        ImageView homebutton = (ImageView)findViewById(R.id.homebutton5);
        homebutton.setOnClickListener(this);
        ImageView playbutton = (ImageView)findViewById(R.id.playbutton4);
        playbutton.setOnClickListener(this);
        
        
        homebutton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
			//Intent intent = new Intent(		
			//about.this,
			//home.class
			//);
			
			//startActivity(intent);
			finish();
		
				
			}
		});
        
        playbutton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
			Intent intent = new Intent(		
			about.this,
			StartGame.class
			);
			
			startActivity(intent);
			
		
				
			}
		});
        

	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId()==R.id.homebutton5)
			startActivity(new Intent(this,home.class));
			if(v.getId()==R.id.playbutton4)
				startActivity(new Intent(this,play1.class));
		
	}
}
