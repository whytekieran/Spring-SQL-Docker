package com.whyte.shortUrl.url;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UrlRepository extends CrudRepository<Url, Integer> {
	public List<Url> findByShortUrl(String fullUrl);
}
