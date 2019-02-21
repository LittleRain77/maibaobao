package com.smallapple.mbb.vo;

public class Goods {
    private int gid;
    private GoodsType gtype;
    private String gname;
    private int gnumber;
    private String gtext;
    private String gimage;
    private String gaddress;
    private float gprice;
    private GoodsDetail gds;
	

	public GoodsDetail getGds() {
		return gds;
	}

	public void setGds(GoodsDetail gds) {
		this.gds = gds;
	}

	public int getGid() {
		return gid;
	}
	
	public void setGid(int gid) {
		this.gid = gid;
	}
	
	public GoodsType getGtype() {
		return gtype;
	}
	
	public void setGtype(GoodsType gtype) {
		this.gtype = gtype;
	}
	
	public String getGname() {
		return gname;
	}
	
	public void setGname(String gname) {
		this.gname = gname;
	}
	
	public int getGnumber() {
		return gnumber;
	}
	
	public void setGnumber(int gnumber) {
		this.gnumber = gnumber;
	}
	
	public String getGtext() {
		return gtext;
	}
	
	public void setGtext(String gtext) {
		this.gtext = gtext;
	}
	
	public String getGimage() {
		return gimage;
	}
	
	public void setGimage(String gimage) {
		this.gimage = gimage;
	}
	
	public String getGaddress() {
		return gaddress;
	}
	
	public void setGaddress(String gaddress) {
		this.gaddress = gaddress;
	}
	
	public float getGprice() {
		return gprice;
	}
	
	public void setGprice(float gprice) {
		this.gprice = gprice;
	}

	public Goods() {
		super();
	}

	public Goods(int gid, GoodsType gtype, String gname, int gnumber,
			String gtext, String gimage, String gaddress, float gprice) {
		super();
		this.gid = gid;
		this.gtype = gtype;
		this.gname = gname;
		this.gnumber = gnumber;
		this.gtext = gtext;
		this.gimage = gimage;
		this.gaddress = gaddress;
		this.gprice = gprice;
	}

	public Goods(int gid, GoodsType gtype, String gname, int gnumber,
			String gtext, String gimage, String gaddress, float gprice,
			GoodsDetail gds) {
		super();
		this.gid = gid;
		this.gtype = gtype;
		this.gname = gname;
		this.gnumber = gnumber;
		this.gtext = gtext;
		this.gimage = gimage;
		this.gaddress = gaddress;
		this.gprice = gprice;
		this.gds = gds;
	}

	
    
}
