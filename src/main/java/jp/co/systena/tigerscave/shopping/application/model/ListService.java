package jp.co.systena.tigerscave.shopping.application.model;

import java.util.ArrayList;
import java.util.HashMap;

public class ListService {
	public static  ArrayList<HashMap<String,Object>> getItemList() {

		HashMap<String, Object> item1 = new HashMap<String, Object>();
		item1.put("itemId", new Item1());

		HashMap<String, Object> item2 = new HashMap<String, Object>();
		item2.put("itemId", new Item2());

		HashMap<String, Object> item3 = new HashMap<String, Object>();
		item3.put("itemId", new Item3());

		ArrayList<HashMap<String, Object>> itemlist = new ArrayList<HashMap<String, Object>>();
		itemlist.add(item1);
		itemlist.add(item2);
		itemlist.add(item3);

		return itemlist;
	}

}
