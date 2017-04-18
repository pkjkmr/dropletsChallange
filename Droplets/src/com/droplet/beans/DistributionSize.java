package com.droplet.beans;

public class DistributionSize {

	int prizePerMonth;
	double prizePerHour;
	String gb_cpu;
	String ssd;
	String transferCap;
	
	public DistributionSize(int prizePerMonth, String gb_cpu, String ssd, String transferCap){
		this.prizePerMonth=prizePerMonth;
		this.prizePerHour=prizePerMonth/30*24;
		this.gb_cpu=gb_cpu;
		this.ssd=ssd;
		this.transferCap=transferCap;
		
	}

	public double getPrizePerHour() {
		return prizePerHour;
	}
	
	public int getPrizePerMonth() {
		return prizePerMonth;
	}

	public String getGb_cpu() {
		return gb_cpu;
	}

	public String getTransferCap() {
		return transferCap;
	}

	public String getSsd() {
		return ssd;
	}
}
