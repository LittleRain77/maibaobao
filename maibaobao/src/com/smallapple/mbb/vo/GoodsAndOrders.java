package com.smallapple.mbb.vo;

import java.util.List;

public class GoodsAndOrders {
	private Goods goods;
	private Orders orders;
	private int number;
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public Orders getOrders() {
		return orders;
	}
	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public GoodsAndOrders() {
		super();
	}
	public GoodsAndOrders(Goods goods, Orders orders, int number) {
		super();
		this.goods = goods;
		this.orders = orders;
		this.number = number;
	}
	
	

}
