package com.whyte.shortUrl.url;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Url")
public class Url {
	
	@Id
	private int id;
	private String fullUrl;
	private String shortUrl;
	
	public Url() {
		
	}
	
	public Url(int id, String fullUrl, String shortUrl) {
		super();
		this.id = id;
		this.fullUrl = fullUrl;
		this.shortUrl = shortUrl;
	}

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullUrl() {
		return fullUrl;
	}
	
	public void setFullUrl(String fullUrl) {
		this.fullUrl = fullUrl;
	}
	
	public String getShortUrl() {
		return shortUrl;
	}
	
	public void setShortUrl(String shortUrl) {
		this.shortUrl = shortUrl;
	}
}
