package com.droplet.beans;

import java.util.Set;

public class Distribution {
	String name;
	Set<String> versions;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the versions
	 */
	public Set<String> getVersions() {
		return versions;
	}

	/**
	 * @param versions
	 *            the versions to set
	 */
	public void setVersions(Set<String> versions) {
		this.versions = versions;
	}

}
