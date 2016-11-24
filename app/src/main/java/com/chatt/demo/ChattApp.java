package com.chatt.demo;

import android.app.Application;

import com.parse.Parse;

/**
 * The Class ChattApp is the Main Application class of this app. The onCreate
 * method of this class initializes the Parse.
 */
public class ChattApp extends Application
{

	/* (non-Javadoc)
	 * @see android.app.Application#onCreate()
	 */
	@Override
	public void onCreate()
	{
		super.onCreate();

        Parse.initialize(this, "f6Q4eXwavw7V0Tncy5ccemYYWovjwjxiBu3zHed6", "RXmWcneomdYA1RheyzApx6i2pz2LJWpN4PVXTYKW");
    }

	}

