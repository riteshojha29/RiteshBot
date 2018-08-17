package com.ritesh.riteshbot;

import android.os.Environment;

public class Utils {
    //check SD card availability
    public static boolean isSDCARDAvailable(){
        return Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)? true :false;
    }


}
