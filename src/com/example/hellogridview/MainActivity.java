package com.example.hellogridview;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ProgressBar;
import android.widget.Toast;


public class MainActivity extends Activity {

private final int SPLASH_DISPLAY_LENGHT = 1500;

/** Called when the activity is first created. */
@Override
public void onCreate(Bundle icicle) {
    super.onCreate(icicle);
    setContentView(R.layout.landing_page);

    /* New Handler to start the Menu-Activity 
     * and close this Splash-Screen after some seconds.*/
    new Handler().postDelayed(new Runnable(){
        @Override
        public void run() {
            /* Create an Intent that will start the Menu-Activity. */
            Intent mainIntent = new Intent(MainActivity.this,Splash_page.class);
            MainActivity.this.startActivity(mainIntent);
            MainActivity.this.finish();
        }
    }, SPLASH_DISPLAY_LENGHT);
}}


		
		
		