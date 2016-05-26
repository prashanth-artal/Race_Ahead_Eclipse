package com.raceahead_;




import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ToggleButton;

public class setting extends Activity implements OnClickListener{
	
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);
        

        Button homebutton = (Button)findViewById(R.id.homebutton5);
        homebutton.setOnClickListener(this);
        Button profilebutton = (Button)findViewById(R.id.button1);
        profilebutton.setOnClickListener(this);
        Button aboutbutton = (Button)findViewById(R.id.aboutbutton);
        aboutbutton.setOnClickListener(this);
        Button facebookbutton = (Button)findViewById(R.id.facebookbutton);
        facebookbutton.setOnClickListener(this);
        Button twitterbutton = (Button)findViewById(R.id.twitterbutton);
        twitterbutton.setOnClickListener(this);
        
        aboutbutton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
			Intent intent = new Intent(		
			setting.this,
			about.class
			);
			
			startActivity(intent);
			
		
				
			}
		    });
        
        homebutton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
			//Intent intent = new Intent(		
			//setting.this,
			//home.class
			//);
			
			//startActivity(intent);
			
		    finish();
				
			}
		    });
        
        facebookbutton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
			Intent intent = new Intent(		
			setting.this,
			facebook.class
			);
			
			startActivity(intent);
			
		
				
			}
		    });
        
        twitterbutton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
			Intent intent = new Intent(		
			setting.this,
			twitter.class
			);
			
			startActivity(intent);
			
		
				
			}
		    });
        
        profilebutton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
			Intent intent = new Intent(		
			setting.this,
			profile.class
			);
			
			startActivity(intent);
			
		
				
			}
		    });
        
    final ToggleButton togglebutton = (ToggleButton) findViewById(R.id.togglebutton);
    togglebutton.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
		//Perform action on clicks
			

		 if(togglebutton.isChecked()) {
			  Colour.makeText(this,"Checked",Colour.LENGTH_SHORT);
			  
					
							
		 }
		 else{
			  Colour.makeText(this,"Not checked",Colour.LENGTH_SHORT);
			  
						
					 
			  
		 }
		
		
			
		}
	    });
        
}

	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId()==R.id.homebutton5)
			startActivity(new Intent(this,home.class));
	    if(v.getId()==R.id.button1)
			startActivity(new Intent(this,profile.class));
		if(v.getId()==R.id.aboutbutton)
			startActivity(new Intent(this,about.class));
		if(v.getId()==R.id.facebookbutton)
			startActivity(new Intent(this,facebook.class));
		if(v.getId()==R.id.twitterbutton)
			startActivity(new Intent(this,twitter.class));
	}
}

