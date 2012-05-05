package org.sagar.samples.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Hits {
	private List<Hit> hit;

	public void setHit(List<Hit> hit) {
		this.hit = hit;
	}

	public List<Hit> getHit() {
		return hit;
	}
}
