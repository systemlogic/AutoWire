package com.xml.bean;

public class OfficeAddress {
	String locality;
	String stete;
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getStete() {
		return stete;
	}
	public void setStete(String stete) {
		this.stete = stete;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " working @ " + this.getLocality() + " " + this.getStete() ;
	}
}
