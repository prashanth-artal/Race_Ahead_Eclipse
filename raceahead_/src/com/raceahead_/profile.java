package com.raceahead_;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class profile extends Activity implements OnClickListener{
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        
        ImageView homebutton = (ImageView)findViewById(R.id.homebutton4);
        homebutton.setOnClickListener(this);
        ImageView enterbutton = (ImageView)findViewById(R.id.enterbutton);
        homebutton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
			//Intent intent = new Intent(		
			//profile.this,
			//home.class
			//);
			
			//startActivity(intent);
			finish();
		
				
			}
		});

       enterbutton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
			
		    
				
			}
		});

	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId()==R.id.homebutton4)
			startActivity(new Intent(this,home.class));
		
	}


}
