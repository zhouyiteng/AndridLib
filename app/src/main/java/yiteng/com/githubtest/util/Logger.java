package yiteng.com.githubtest.util;

import android.util.Log;

import constants.CommonConstants;

/**
 * Created by neil.zhou on 2016/4/12.
 */
public class Logger {
    public static void show(String tag,String message){
        if(!CommonConstants.isShowLog){
            return;
        }
        show(tag,message,Log.INFO);
    }

    public static void show(String tag, String message, int level) {
        if(!CommonConstants.isShowLog){
            return;
        }
        switch (level){
            case Log.VERBOSE:
                Log.v(tag,message);
                break;
            case Log.DEBUG:
                Log.d(tag,message);
                break;
            case Log.INFO:
                Log.i(tag,message);
                break;
            case Log.WARN:
                Log.w(tag,message);
                break;
            case Log.ERROR:
                Log.e(tag,message);
                break;
        }
    }
}
