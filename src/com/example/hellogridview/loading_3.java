package com.example.hellogridview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Spinner;

public class loading_3 extends Activity{
	
		@Override
		public void onCreate(Bundle savedInstanceState) {
		    super.onCreate(savedInstanceState);
		    setContentView(R.layout.loading_3);
		
		    ImageButton churp3 = (ImageButton)findViewById(R.id.loading_x);
			churp3.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent newIntent = new Intent(loading_3.this, row_temp.class);
					startActivity(newIntent);
				}});
			ImageButton churp5 = (ImageButton)findViewById(R.id.loading);
			churp5.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent newIntent = new Intent(loading_3.this, Preview.class);
					startActivity(newIntent);
				}});
		}
	}