package com.example.hellogridview;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
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
public class Splash_page extends Activity {
	String[] cells = new String[] {"JOKES", "FREESTYLE", "NEWS", "SINGING", "STORIES", "SPORTS", "WEATHER", "OTHER", "YUP", "YO", "WORD", "ANIMALS", "JOKES", "NEWS"};
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_page);
		ImageButton churp = (ImageButton)findViewById(R.id.facebook);
		churp.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent newIntent = new Intent(Splash_page.this, row_temp.class);
				startActivity(newIntent);
				ImageButton churp1 = (ImageButton)findViewById(R.id.twitter);
				churp1.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						Intent newIntent = new Intent(Splash_page.this, row_temp.class);
						startActivity(newIntent);
						ImageButton churp2 = (ImageButton)findViewById(R.id.sign_up);
						churp2.setOnClickListener(new OnClickListener() {
							@Override
							public void onClick(View arg0) {
								// TODO Auto-generated method stub
								Intent newIntent = new Intent(Splash_page.this, row_temp.class);
								startActivity(newIntent);
							}});
					};
				});
			}});

		}}


		
		