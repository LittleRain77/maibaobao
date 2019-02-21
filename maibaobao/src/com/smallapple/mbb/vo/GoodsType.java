package com.smallapple.mbb.vo;

public class GoodsType {
   private int gtid;
   private String gtname;

public int getGtid() {
	return gtid;
}

public void setGtid(int gtid) {
	this.gtid = gtid;
}

public String getGtname() {
	return gtname;
}

public void setGtname(String gtname) {
	this.gtname = gtname;
}

public GoodsType() {
	super();
}

public GoodsType(int gtid, String gtname) {
	super();
	this.gtid = gtid;
	this.gtname = gtname;
}

}
