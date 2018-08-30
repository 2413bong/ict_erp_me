package com.ict.erp.vo;

public class musicChart {

private Integer mcNum;
private String mcName;
private String mcSinger;
private String mcVendor;
private Integer mcLike;
private Integer mcDislike;
private String mcCredat;
private String mcDesc;
public musicChart(Integer mcNum, String mcName, String mcSinger, String mcVendor, Integer mcLike, Integer mcDislike,
		String mcCredat, String mcDesc) {
	super();
	this.mcNum = mcNum;
	this.mcName = mcName;
	this.mcSinger = mcSinger;
	this.mcVendor = mcVendor;
	this.mcLike = mcLike;
	this.mcDislike = mcDislike;
	this.mcCredat = mcCredat;
	this.mcDesc = mcDesc;
}
public musicChart() {
}
public Integer getMcNum() {
	return mcNum;
}
public void setMcNum(Integer mcNum) {
	this.mcNum = mcNum;
}
public String getMcName() {
	return mcName;
}
public void setMcName(String mcName) {
	this.mcName = mcName;
}
public String getMcSinger() {
	return mcSinger;
}
public void setMcSinger(String mcSinger) {
	this.mcSinger = mcSinger;
}
public String getMcVendor() {
	return mcVendor;
}
public void setMcVendor(String mcVendor) {
	this.mcVendor = mcVendor;
}
public Integer getMcLike() {
	return mcLike;
}
public void setMcLike(Integer mcLike) {
	this.mcLike = mcLike;
}
public Integer getMcDislike() {
	return mcDislike;
}
public void setMcDislike(Integer mcDislike) {
	this.mcDislike = mcDislike;
}
public String getMcCredat() {
	return mcCredat;
}
public void setMcCredat(String mcCredat) {
	this.mcCredat = mcCredat;
}
public String getMcDesc() {
	return mcDesc;
}
public void setMcDesc(String mcDesc) {
	this.mcDesc = mcDesc;
}
@Override
public String toString() {
	return "musicChart [mcNum=" + mcNum + ", mcName=" + mcName + ", mcSinger=" + mcSinger + ", mcVendor=" + mcVendor
			+ ", mcLike=" + mcLike + ", mcDislike=" + mcDislike + ", mcCredat=" + mcCredat + ", mcDesc=" + mcDesc + "]";
}


}
