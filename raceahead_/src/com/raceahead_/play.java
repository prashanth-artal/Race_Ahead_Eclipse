package com.raceahead_;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class play extends Activity  implements OnClickListener {
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        
            ImageView playbutton = (ImageView)findViewById(R.id.playbutton2);
            playbutton.setOnClickListener(this);
            ImageView helpbutton = (ImageView)findViewById(R.id.helpbutton2);
            helpbutton.setOnClickListener(this);
            ImageView settingbutton = (ImageView)findViewById(R.id.settingbutton);
            settingbutton.setOnClickListener(this);
            
            
            playbutton.setOnClickListener(new View.OnClickListener() {
    			public void onClick(View v) {
    			Intent intent = new Intent(		
    			play.this,
    			StartGame.class
    			);
    			
    			startActivity(intent);
    			
    		
    				
    			}
    		});
            
            
            helpbutton.setOnClickListener(new View.OnClickListener() {
    			public void onClick(View v) {
    			Intent intent = new Intent(		
    			play.this,
    			help.class
    			);
    			
    			startActivity(intent);
    			
    		
    				
    			}
    		});
            settingbutton.setOnClickListener(new View.OnClickListener() {
    			public void onClick(View v) {
    			Intent intent = new Intent(		
    			play.this,
    			setting.class
    			);
    			
    			startActivity(intent);
    			
    		
    				
    			}
    		});
        }

	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId()==R.id.playbutton2)
			startActivity(new Intent(this,play1.class));
			if(v.getId()==R.id.helpbutton2)
				startActivity(new Intent(this,help.class));
			if(v.getId()==R.id.settingbutton)
				startActivity(new Intent(this,setting.class));
		
	}
}
