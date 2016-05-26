package com.raceahead_;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;


public class raceahead_ extends Activity  implements OnClickListener{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ImageView playbutton = (ImageView)findViewById(R.id.playbutton1);
        playbutton.setOnClickListener(this);
        ImageView helpbutton = (ImageView)findViewById(R.id.helpbutton1);
        helpbutton.setOnClickListener(this);
        
        
        
        playbutton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
			Intent intent = new Intent(		
			raceahead_.this,
			play.class
			);
			
			startActivity(intent);
			
		
				
			}
		});
        
        
        helpbutton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
			Intent intent = new Intent( 
					raceahead_.this,
					help.class
			        );
			
			startActivity(intent);
			
		
				
			}
		});
    }

	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId()==R.id.playbutton1)
		startActivity(new Intent(this,play.class));
		if(v.getId()==R.id.helpbutton1)
			startActivity(new Intent(this,help.class));
	}
    }
