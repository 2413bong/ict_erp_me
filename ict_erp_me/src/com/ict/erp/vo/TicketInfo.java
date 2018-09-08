package com.ict.erp.vo;

public class TicketInfo {
	private Integer tmNum;
	private String tmName;
	private Integer tmPrice;
	private String tmStartDat;
	private String tmEndDat;
	private String tmDesc;
	private Integer tmCnt;
	private String tmImg;
	public TicketInfo(Integer tmNum, String tmName, Integer tmPrice, String tmStartDat, String tmEndDat, String tmDesc,
			Integer tmCnt, String tmImg) {
		super();
		this.tmNum = tmNum;
		this.tmName = tmName;
		this.tmPrice = tmPrice;
		this.tmStartDat = tmStartDat;
		this.tmEndDat = tmEndDat;
		this.tmDesc = tmDesc;
		this.tmCnt = tmCnt;
		this.tmImg = tmImg;
	}
	public TicketInfo() {
		
	}
	public Integer getTmNum() {
		return tmNum;
	}
	public void setTmNum(Integer tmNum) {
		this.tmNum = tmNum;
	}
	public String getTmName() {
		return tmName;
	}
	public void setTmName(String tmName) {
		this.tmName = tmName;
	}
	public Integer getTmPrice() {
		return tmPrice;
	}
	public void setTmPrice(Integer tmPrice) {
		this.tmPrice = tmPrice;
	}
	public String getTmStartDat() {
		return tmStartDat;
	}
	public void setTmStartDat(String tmStartDat) {
		this.tmStartDat = tmStartDat;
	}
	public String getTmEndDat() {
		return tmEndDat;
	}
	public void setTmEndDat(String tmEndDat) {
		this.tmEndDat = tmEndDat;
	}
	public String getTmDesc() {
		return tmDesc;
	}
	public void setTmDesc(String tmDesc) {
		this.tmDesc = tmDesc;
	}
	public Integer getTmCnt() {
		return tmCnt;
	}
	public void setTmCnt(Integer tmCnt) {
		this.tmCnt = tmCnt;
	}
	public String getTmImg() {
		return tmImg;
	}
	public void setTmImg(String tmImg) {
		this.tmImg = tmImg;
	}
	@Override
	public String toString() {
		return "ticketInfo [tmNum=" + tmNum + ", tmName=" + tmName + ", tmPrice=" + tmPrice + ", tmStartDat="
				+ tmStartDat + ", tmEndDat=" + tmEndDat + ", tmDesc=" + tmDesc + ", tmCnt=" + tmCnt + ", tmImg=" + tmImg
				+ "]";
	}
	
	
}
