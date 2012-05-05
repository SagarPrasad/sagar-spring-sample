package org.sagar.samples.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Hit {
	private List<Hit> hit;
	private String name;
	private String value;
	

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getValue() {
		return value;
	}
	public void setHit(List<Hit> hit) {
		this.hit = hit;
	}
	public List<Hit> getHit() {
		return hit;
	}
}
