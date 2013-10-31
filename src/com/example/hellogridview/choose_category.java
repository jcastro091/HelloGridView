package com.example.hellogridview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Spinner;

public class choose_category extends Activity{

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.choose_category);

	;


	ImageButton churp3 = (ImageButton)findViewById(R.id.done);
	churp3.setOnClickListener(new OnClickListener() {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent newIntent = new Intent(choose_category.this, churp_it.class);
			startActivity(newIntent);
			
			
			
		}});
	
	}}