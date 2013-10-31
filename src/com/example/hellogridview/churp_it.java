package com.example.hellogridview;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Spinner;
public class churp_it extends Activity{
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.churp_it);
		ImageButton churp5 = (ImageButton)findViewById(R.id.category);
		churp5.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent newIntent = new Intent(churp_it.this, choose_category.class);
				startActivity(newIntent);
			}});
		ImageButton churp6 = (ImageButton)findViewById(R.id.c);
		churp6.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent newIntent = new Intent(churp_it.this, row_temp.class);
				startActivity(newIntent);
			}});
	}
}	