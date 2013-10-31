package com.example.hellogridview;
import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ImageView;
import android.widget.Spinner;
public class row_temp extends Activity implements OnClickListener {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.row_temp);
		
		final Spinner spinner2 = (Spinner)findViewById(R.id.c);
		List list2 = new ArrayList();
		list2.add(R.drawable.home_drop);
		list2.add(R.drawable.discover_drop);
		list2.add(R.drawable.churptivity);
		list2.add(R.drawable.profile_drop);
		
		final List<Integer> list1 = new ArrayList<Integer>();
		list1.add(R.drawable.header_home);
		list1.add(R.drawable.tab_search);
		list1.add(R.drawable.tab_search);
		list1.add(R.drawable.header_home);
		
		DropDownAdapter dataAdapter = new DropDownAdapter(this, list1, list2);
		spinner2.setAdapter(dataAdapter);
		
		final List<Class> list3 = new ArrayList<Class>();
		list3.add(Feed.class);
		list3.add(row_temp.class);
		list3.add(row_temp.class);
		list3.add(Profile.class);
		spinner2.setSelection(1, false);
		spinner2.setOnItemSelectedListener(new OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				System.out.println("clicked - "+list3.get(arg2).toString());
//				spinner2.setBackgroundResource(R.drawable.tab_search);
//				((ImageView)findViewById(R.id.imageView1))
//					.setImageResource(list1.get(arg2));
				Intent intent = new Intent (row_temp.this, list3.get(arg2));
				startActivity(intent);
			}
			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				System.out.println("no click");
			}});
		findViewById(R.id.discover).setOnClickListener(this);
		findViewById(R.id.action_btn_churp_icon).setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		Intent newIntent;
		switch(v.getId()) {
		case R.id.discover:
			newIntent = new Intent(row_temp.this, discover.class);
			startActivity(newIntent);
			break;
		case R.id.action_btn_churp_icon:
			newIntent = new Intent(row_temp.this, AudioRecord.class);
			startActivity(newIntent);
			break;
		}
	}
}


