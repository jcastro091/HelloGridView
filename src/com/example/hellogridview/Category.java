package com.example.hellogridview;

import java.util.ArrayList;
import java.util.List;

public class Category {
	private static String[] cells = {"JOKES", "FREESTYLE", "NEWS", "SINGING", "STORIES", "SPORTS", "WEATHER", "OTHER", "YUP", "YO", "WORD", "ANIMALS", "JOKES", "NEWS"};
	private final static List<Category> categories = new ArrayList<Category>(cells.length);
	
	private final String name;

	private Category(String name) {
		super();
		this.name = name;
	}
	
	public final String getName() {
		return name;
	}
	
	private static void init() {
		categories.clear();
		
		for(String catString : cells) {
			categories.add(new Category(catString));
		}
	}
	
	public static List<Category> values() {
		if(categories.size() == 0) init();
		
		return categories;
	}
}
