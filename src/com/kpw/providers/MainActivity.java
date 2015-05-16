package com.kpw.providers;

import android.app.Activity;
import android.os.Bundle;
import java.security.Provider;
import java.security.Security;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);

        Provider[] providers = Security.getProviders();
        for(int i = 0; i < providers.length; i++){
        	tv.setText(tv.getText() + " Provider " + (i + 1) + " [" + providers[i].getName() + " " + providers[i].getVersion() + "] ");
        	tv.setText(tv.getText() + " Info: " + providers[i].getInfo());
        }
        setContentView(tv);
    }
}
