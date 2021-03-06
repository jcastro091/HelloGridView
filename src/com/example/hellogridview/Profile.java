package com.example.hellogridview;
import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
public class Profile extends Activity{
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.profile);
		
		
		TabHost tabHost=(TabHost)findViewById(R.id.tabHost);
		tabHost.setup();

		TabSpec spec1=tabHost.newTabSpec("Tab 1");
		spec1.setContent(R.id.tab1);
		spec1.setIndicator("", getApplicationContext().getResources().getDrawable(R.drawable.profile_churps));

		TabSpec spec2=tabHost.newTabSpec("Tab 2");
		spec2.setIndicator("" , getApplicationContext().getResources().getDrawable(R.drawable.profile_likes));
		spec2.setContent(R.id.tab2);



		tabHost.addTab(spec1);
		tabHost.addTab(spec2);
		
		
		
		
		
		
		final Spinner spinner2 = (Spinner)findViewById(R.id.action_btn_home);
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(R.drawable.home_drop);
		list2.add(R.drawable.discover_drop);
		list2.add(R.drawable.churptivity);
		list2.add(R.drawable.profile_drop);
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(R.drawable.header_home);
		list1.add(R.drawable.tab_search);
		list1.add(R.drawable.tab_search);
		list1.add(R.drawable.header_home);
		DropDownAdapter dataAdapter = new DropDownAdapter(this, list1,list2);
		//	dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner2.setAdapter(dataAdapter);
		final List<Class> list3 = new ArrayList<Class>();
		list3.add(Feed.class);
		list3.add(row_temp.class);
		list3.add(row_temp.class);
		list3.add(Profile.class);
		spinner2.setSelection(3, false);
		spinner2.setOnItemSelectedListener(new OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				System.out.println("clicked");
				spinner2.setBackgroundResource(R.drawable.header_home);
				Intent intent = new Intent (Profile.this, list3.get(arg2));
				startActivity(intent);
			}
			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				System.out.println("no click");
			}});
		;
		ImageButton churp3 = (ImageButton)findViewById(R.id.action_btn_churp_icon);
		churp3.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent newIntent = new Intent(Profile.this, AudioRecord.class);
				startActivity(newIntent);
			}});

	
			}
	}

