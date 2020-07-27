package com.whyte.shortUrl.url;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UrlService {
	@Autowired
	private UrlRepository urlRepository;

	public void createShortUrl(Url url) {
		List<Url> urls = new ArrayList<>();
		
		urlRepository.findAll().forEach(urls::add);
		url.setShortUrl(RandomStringUtils.random(8, true, false).toString());
		url.setId(urls.size());
		
		urlRepository.save(url);
	}
	
	public String getFullUrl(String shortUrl) {
		List <Url> urls = urlRepository.findByShortUrl(shortUrl);
		System.out.println(urls.get(0).getFullUrl());
		return urls.get(0).getFullUrl();
	}
}
