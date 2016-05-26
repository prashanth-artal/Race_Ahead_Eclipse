package com.raceahead_;

import java.util.Timer;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Point;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;

class Status{
	static char[] time;
}

public class StartGame extends Activity {
	
	GameView gv;
	final int MAXSH=10;
	final int MAXSV=30;
	int rY,x,y;
	int[] cary,carx;
	public int speedV,speedH;
	Timer timerTime,timerTerm;
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        gv=new GameView(this);
         setContentView(gv);
         speedV=6;
         speedH=3;
         
         String timeTemp="00:00";
 		 Status.time=timeTemp.toCharArray();
         timerTime=new Timer();
 		 timerTime.schedule(new IncTime(),1000,1000);
 		 timerTerm=new Timer();
 		 timerTerm.schedule(new Terminate(this),90000);
    }
	@Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
		cary=new int[4];
		carx=new int[4];
		x=gv.userX;
		y=gv.userY;
		cary[0]=gv.car4y;
		cary[1]=gv.car1y;
		cary[2]=gv.car2y;
		cary[3]=gv.car3y;
		carx[0]=gv.car4x;
		carx[1]=gv.car1x;
		carx[2]=gv.car2x;
		carx[3]=gv.car3x;
		
		rY=gv.rY;
 	   if(keyCode == KeyEvent.KEYCODE_DPAD_LEFT)
 	   {
 		   if(x>speedH)
 		   x-=speedH;
 		   if(speedH<MAXSH)
 		   speedH++;
 	   }
 	   else if(keyCode == KeyEvent.KEYCODE_DPAD_RIGHT)
	   {
 		  if(x<gv.getWidth()-100)
		   x+=speedH;
 		 if(speedH<MAXSH)
 		 speedH++;
	   }
 	  else if(keyCode == KeyEvent.KEYCODE_DPAD_UP)
	   {
		  if(y<gv.getHeight()-100)
		   {
			  cary[1]+=speedV;
			  cary[2]+=speedV;
			  cary[3]+=speedV;
			  cary[0]+=speedV;
			  rY+=speedV;
			  if(rY>=gv.ht)
				  rY=0;
			  if(speedV<MAXSV)
			  speedV++;
		   }
	   }
	   if(check())
	   {
		   gv.car1y=cary[1];
		   gv.car2y=cary[2];
		   gv.car3y=cary[3];
		   gv.car4y=cary[0];
		   gv.rY=rY;
		   gv.userX=x;
		   gv.userY=y;
	   }
 	   return super.onKeyDown(keyCode, event);
 	   
    }
	public boolean onKeyUp(int keyCode, KeyEvent event)
    {
		speedV=6;
		speedH=3;
		return true;
    }
	boolean check()
	{
		int h=gv.carH;
		int w=gv.carW;
		for(int i=0;i<4;i++)
		{
			if(x > carx[i] && x < carx[i]+w)
				if(y > cary[i] && y < cary[i]+h)
					return false;
				else if(y+h > cary[i] && y+h < cary[i]+h)
					return false;
			if(x+w > carx[i] && x+w < carx[i]+w)
				if(y > cary[i] && y < cary[i]+h)
					return false;
				else if(y+h > cary[i] && y+h < cary[i]+h)
					return false;
		}
		return true;
	}
	
	 @Override
	    public void onDestroy() {
	    	super.onDestroy();
	    	if(isFinishing())
	    	{
	    		 
	  	       // fView.timerDrop.cancel();
	    		timerTime.cancel();
	  	        timerTerm.cancel();
	  	        
	  	        String timeTemp="00:00";
	  			Status.time=timeTemp.toCharArray();
	  	        
	    	}
	    
	    }
}
