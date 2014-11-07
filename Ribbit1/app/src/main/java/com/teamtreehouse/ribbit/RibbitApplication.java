package com.teamtreehouse.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class RibbitApplication extends Application {
	
	@Override
	public void onCreate() { 
		super.onCreate();
	    Parse.initialize(this, "LS228NGjrea9HWXiGPTIbGrL2NvZxfvIYGDIaqnF", "RE6awtwVLHZbvKafPYR5ciUy1SLsF85y1vtv7XGA");
	}
}
