package com.smallapple.mbb.vo;

public class Page {
	private int curPage;//当前页
	private int showNumber;//显示条数
	private int count;//总条数
	public int getCurPage() {
		return curPage;
	}
	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}
	public int getShowNumber() {
		return showNumber;
	}
	public void setShowNumber(int showNumber) {
		this.showNumber = showNumber;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Page() {
		super();
	}
	public Page(int curPage, int showNumber, int count) {
		super();
		this.curPage = curPage;
		this.showNumber = showNumber;
		this.count = count;
	}
	
	//返回总页数
	public int getTotalNumber(){
		return (this.count-1)/this.showNumber+1;
	}
	//查询起始位置
	public int getSelectIndex(){
		return (this.curPage-1)*this.showNumber;
	}
	//上一页
	public int getPrePage(){
		int temp=this.curPage-1;
		if(temp<1){
			temp=1;
		}
		return temp;
	}
	//下一页
	public int getNextPage(){
		int temp=this.curPage+1;
		if(temp>this.getTotalNumber()){
			temp=this.getTotalNumber();
		}
		return temp;
	}

}
