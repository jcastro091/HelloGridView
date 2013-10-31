//package com.example.hellogridview;
//
//import android.app.Activity;
//import android.os.Bundle;
//import android.widget.ArrayAdapter;
//import android.widget.Spinner;
//
//public class CustomSpinner extends Activity {
//
//	 String[] DropDown = {"Home", "Discover", "Churp-tivity",
//	   "Profile"};
//
//	   /** Called when the activity is first created. */
//	   @Override
//	   public void onCreate(Bundle savedInstanceState) {
//	       super.onCreate(savedInstanceState);
//	       setContentView(R.layout.drop_down);
//
//	       Spinner mySpinner = (Spinner)findViewById(R.id.home);
//	       ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
//	         R.layout.drop_down);
//	       mySpinner.setAdapter(adapter);
//	   }
//	}
