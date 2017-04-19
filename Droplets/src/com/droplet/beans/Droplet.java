package com.droplet.beans;

import java.util.Date;

public class Droplet {
	
	String user;
	
	String os;
	String version;
	String distributionSize;
	String dataCenter;
	String privateNetworking;
	String backup;
	String ipv6;
	String monitoring;
	String hostName;
	Date date;
	
	public Droplet(String user, String os, String version,
			String distributionSize, String dataCenter,
			String privateNetworking, String backup, String ipv6,
			String monitoring, String hostName, Date date) {
		this.user = user;
		this.os = os;
		this.version = version;
		this.distributionSize = distributionSize;
		this.dataCenter = dataCenter;
		this.privateNetworking = privateNetworking;
		this.backup = backup;
		this.ipv6 = ipv6;
		this.monitoring = monitoring;
		this.hostName = hostName;
		this.date = date;
	}
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getDistributionSize() {
		return distributionSize;
	}
	public void setDistributionSize(String distributionSize) {
		this.distributionSize = distributionSize;
	}
	public String getDataCenter() {
		return dataCenter;
	}
	public void setDataCenter(String dataCenter) {
		this.dataCenter = dataCenter;
	}
	public String getPrivateNetworking() {
		return privateNetworking;
	}
	public void setPrivateNetworking(String privateNetworking) {
		this.privateNetworking = privateNetworking;
	}
	public String getBackup() {
		return backup;
	}
	public void setBackup(String backup) {
		this.backup = backup;
	}
	public String getIpv6() {
		return ipv6;
	}
	public void setIpv6(String ipv6) {
		this.ipv6 = ipv6;
	}
	public String getMonitoring() {
		return monitoring;
	}
	public void setMonitoring(String monitoring) {
		this.monitoring = monitoring;
	}
	public String getHostName() {
		return hostName;
	}
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

}
