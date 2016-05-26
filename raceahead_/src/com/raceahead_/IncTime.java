package com.raceahead_;

import java.util.TimerTask;



public class IncTime extends TimerTask {

	@Override
	public void run() {
		char cArray[]=new char[10];
		cArray=Status.time;
		if(cArray[4]=='9')
		{
			cArray[4]='0';
			if(cArray[3]=='5')
			{
				cArray[3]=0;
				cArray[1]++;
			}
			cArray[3]++;
		}
		else
		{
			cArray[4]++;
		}
		Status.time=cArray;


	}

}
