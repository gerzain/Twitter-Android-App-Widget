package com.blundell.tut.twitterfeedwidget.util;

import com.blundell.tut.twitterfeedwidget.Config;

import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.os.Message;

public class Log {
	private static final String TAG = "TwitterWidget";

    public static void d(String msg){
        d(msg, null);
    }

    public static void d(String msg, Throwable e){
        if(!Config.LIVE)
            android.util.Log.d(TAG, Thread.currentThread().getName() +"| "+ msg, e);
    }

    public static void i(String msg){
        i(msg, null);
    }

    public static void i(String msg, Throwable e){
        if(!Config.LIVE)
            android.util.Log.i(TAG, Thread.currentThread().getName() +"| "+ msg, e);
    }

    public static void e(String msg){
        e(msg, null);
    }

    public static void e(String msg, Throwable e){
        if(!Config.LIVE)
            android.util.Log.e(TAG, Thread.currentThread().getName() +"| "+ msg, e);
    }

    public static void v(String msg) {
        if(!Config.LIVE)
            android.util.Log.v(TAG, Thread.currentThread().getName() +"| "+ msg);
    }

    public static String identifyMessage(Resources res, Message msg) {
        try{
            return res.getResourceEntryName(msg.what);
        }
        catch(NotFoundException ignore){
            return "not found";
        }
    }

    public static void w(String msg) {
        if(!Config.LIVE)
            android.util.Log.w(TAG, Thread.currentThread().getName() +"| "+ msg);
    }
}
