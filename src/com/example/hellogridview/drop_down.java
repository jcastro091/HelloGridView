package com.example.hellogridview;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Spinner;

public class drop_down extends Activity{
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.feed);
	
	
	final Spinner spinner2 = (Spinner)findViewById(R.id.action_btn_home);
	
	List<Integer> list2 = new ArrayList<Integer>();
	list2.add(R.drawable.header_home);
	list2.add(R.drawable.tab_search);
	list2.add(R.drawable.tab_search);
	list2.add(R.drawable.header_home);
	


}}
	