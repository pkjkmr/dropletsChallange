package com.droplet.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.droplet.beans.Datacenter;
import com.droplet.beans.Distribution;
import com.droplet.beans.DistributionSize;
import com.droplet.beans.Droplet;

public class DistributionData {
	List<Distribution> list;
	List<DistributionSize> sizeList;
	List<Datacenter> dataCenterList;
	static List<Droplet> dropletList =  new ArrayList<Droplet>();
	
	public List<Distribution> getDistributionList() {
		list = new ArrayList<Distribution>();
		Distribution d1 = new Distribution();
		d1.setName("Ubuntu");
		Set<String> versions = new HashSet<String>();
		versions.add("10.1.1");
		versions.add("10.2.1");
		versions.add("10.1.2");
		versions.add("10.3.1");
		d1.setVersions(versions);
		
		Distribution d2 = new Distribution();
		d2.setName("Fedora");
		Set<String> versions2 = new HashSet<String>();
		versions2.add("10.1.1");
		versions2.add("10.2.1");
		versions2.add("10.1.2");
		versions2.add("10.3.1");
		d2.setVersions(versions);
		list.add(d2); list.add(d1);
		return list;
	}
	

	public List<DistributionSize> getDistributionSizeList() {
		sizeList = new ArrayList<DistributionSize>();
		DistributionSize dz0 = new DistributionSize(5,"512 MB/ 1 CPU","20 GB SSD","1000 GB");
		DistributionSize dz1 = new DistributionSize(10,"1 GB/ 1 CPU","30 GB SSD","2 TB");
		DistributionSize dz2 = new DistributionSize(20,"2 GB/ 2 CPU","40 GB SSD","3 TB");
		sizeList.add(dz0);
		sizeList.add(dz2);
		sizeList.add(dz1);
		return sizeList;
		
	}


	public List<Datacenter> getDataCenterList() {
		dataCenterList = new ArrayList<Datacenter>();
		Datacenter d0 = new Datacenter("New York", "NY1", "NY2", "NY3");
		Datacenter d1 = new Datacenter("San Francisco", "SF1", "SF2");
		Datacenter d2 = new Datacenter("Delhi", "D1");
		dataCenterList.add(d0);
		dataCenterList.add(d1);
		dataCenterList.add(d2);
		return dataCenterList;
	}

	public List<Droplet> getDroplets(){
			return dropletList;
		}
		
	
	public void addDroplets(Droplet droplet){
		dropletList.add(droplet);
	}
}
