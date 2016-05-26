package com.raceahead_;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Log;
import android.view.KeyEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;


public class GameView extends View {
	
	
	   private Bitmap backgrnd,tpbord;
       private Bitmap car1;
       private Bitmap car2;
       private Bitmap car3;
       private Bitmap car4;
       private Bitmap userCar;

       public int car1x=100;
       public int car1y=100;
       public int car2x=200;
       public int car2y=200;
       public int car3x=150;
       public int car3y=300;
       public int car4x=250;
       public int car4y=400;
       public int userX=350;
       public int userY=300;
       public int carH;
       public int carW;

       public int rX=0;
       public int rY=0;
       public int lapCount=0;
       public int ht;
       Paint dPaint;
       public GameView(Context context) {

             super(context);
             int i;
             backgrnd = BitmapFactory.decodeResource(getResources(), R.drawable.new_road);
             tpbord= BitmapFactory.decodeResource(getResources(), R.drawable.top_bord);
             car1 = BitmapFactory.decodeResource(getResources(), R.drawable.car_1);
             car2 = BitmapFactory.decodeResource(getResources(), R.drawable.car_2);
             car3 = BitmapFactory.decodeResource(getResources(), R.drawable.car_3);
             car4 = BitmapFactory.decodeResource(getResources(), R.drawable.car_5);
             userCar= BitmapFactory.decodeResource(getResources(), R.drawable.red_car);
             carH=car1.getHeight();
             carW=car1.getWidth();
             dPaint=new Paint();
             dPaint.setTextSize(30);
       }

       
 
	   @Override
       protected void onDraw(Canvas canvas) {
 
		   	ht=canvas.getHeight();
             int i;
             for(i=0;i<4;i++)
             {	 
            	 canvas.drawBitmap(backgrnd,new Rect(0,0,canvas.getWidth(),rY),new Rect(0,0,canvas.getWidth(),rY),null);
            	 canvas.drawBitmap(backgrnd, rX, rY, null);
            	 canvas.drawBitmap(backgrnd, rX, rY-canvas.getHeight(), null);
            	 
            	 
            	 canvas.drawBitmap(car1, car1x, car1y,null);
            	 canvas.drawBitmap(car2, car2x, car2y,null);
            	 canvas.drawBitmap(car3, car3x, car3y,null);
            	 canvas.drawBitmap(car4, car4x, car4y,null);
            	 canvas.drawBitmap(userCar, userX, userY,null);
            	 canvas.drawBitmap(tpbord,0,0,null);
            	 canvas.drawText(Status.time,0,5, 350,90,dPaint);
            	 if(/*x!=0*/rY!=canvas.getHeight()) {
            	 	
                    car1y--;
                    car2y--;
                    car3y--;
                    car4y--;
            	 }
            	 else{
            	   rY=0;
                   lapCount++;
                   Log.i("LAPCOUNT",""+lapCount);
            	 
            	 }
            	 postInvalidate();  
             }
       }
}
