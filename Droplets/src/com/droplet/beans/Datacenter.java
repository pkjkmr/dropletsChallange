package com.droplet.beans;

public class Datacenter {

	String name;
	String[] id;

	public Datacenter(String name, String... ids) {
		this.name = name;
		this.id = ids;
	}

	public String getName() {
		return name;
	}

	public String[] getId() {
		return id;
	}
}
