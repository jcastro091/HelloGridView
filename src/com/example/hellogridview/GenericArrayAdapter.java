package com.example.hellogridview;

import java.util.Arrays;
import java.util.List;

import android.widget.BaseAdapter;

public abstract class GenericArrayAdapter<E> extends BaseAdapter {
	private final List<E> elements;
	
	public GenericArrayAdapter(E[] elements) {
		this.elements = Arrays.asList(elements);
	}
	
	public GenericArrayAdapter(List<E> elements) {
		this.elements = elements;
	}
	
	
	@Override
	public final int getCount() {
		return elements.size();
	}

	@Override
	public final E getItem(int position) {
		return elements.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}
}
