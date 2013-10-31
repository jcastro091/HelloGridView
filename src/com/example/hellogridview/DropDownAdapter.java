package com.example.hellogridview;


import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class DropDownAdapter extends BaseAdapter {

	private Context mContext;
	private List<Integer> items1;
	private List<Integer> items2;


	public DropDownAdapter(Context c, List<Integer> list1, List<Integer> list2) {
		mContext = c;
		items1 = list1;
		items2 = list2;

	}

	@Override
	public int getCount() {
		return items1.size();
	}

	@Override
	public Object getItem(int arg0) {
		return items1.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		return 0;
	}

	@Override
	public View getView(int pos, View convertView, ViewGroup parent) {
		View v = convertView;

		if(v == null) {

			LayoutInflater inflater = LayoutInflater.from(mContext);
			v = inflater.inflate(R.layout.menu, null);

			ImageView iv = (ImageView) v.findViewById(R.id.menu1);
	

			iv.setImageResource(items1.get(pos));
			iv.setImageResource(items2.get(pos));


		}
		return v;
	}
	
	

}
