package jp.co.systena.tigerscave.shopping.application.model;

public class Item2 {

	private int itemId = 2;					//商品番号
	private String name = "ノートパソコン";		//商品名
	private int price = 100000;				//値段

	public int getItemId() {
		return this.itemId;
	}

	public String getName() {
		return this.name;
	}

	public int getPrice() {
		return this.price;
	}

	// setter
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}


}
