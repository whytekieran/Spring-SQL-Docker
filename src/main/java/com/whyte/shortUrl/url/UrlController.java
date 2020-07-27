package com.whyte.shortUrl.url;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class UrlController {
	
	@Autowired
	UrlService urlService;

	@RequestMapping(method = RequestMethod.POST, value = "/")
	public String createShortUrl(@RequestBody Url url) {
		urlService.createShortUrl(url);
		return url.getShortUrl();
	}
	
	@RequestMapping("/{shortUrl}")
	public RedirectView getFullUrl(@PathVariable String shortUrl) {
		String fullUrl = urlService.getFullUrl(shortUrl);
		
		RedirectView redirectView = new RedirectView();
	    redirectView.setUrl(fullUrl);
	    return redirectView;
	}
}
