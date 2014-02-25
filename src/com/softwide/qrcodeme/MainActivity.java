package com.softwide.qrcodeme;

import android.os.Bundle;
import org.apache.cordova.*;

public class MainActivity extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
        super.setIntegerProperty("loadUrlTimeoutValue", 60000);
    }
    
}
