package com.smallapple.mbb.vo;

public class Car {
	private Goods goods;
	private int number;
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(Goods goods, int number) {
		super();
		this.goods = goods;
		this.number = number;
	}
	public int addNumber(){
		this.number++;
		if(this.number>10){
			this.number=10;
		}
		return this.number;
	}
	public int redeucNumber(){
		this.number--;
		if(this.number==0){
			this.number=1;
		}
		return this.number;
	}
	//获取价格小计
	public Float getTotalPrice(){
		return (Float)(this.goods.getGprice() * this.number);
	}
	 

}
