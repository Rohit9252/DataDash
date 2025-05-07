package com.api.dataforge.controller;


import com.api.dataforge.model.NewsResponse;

import com.api.dataforge.service.NewsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

import java.util.Date;

@RestController
@RequestMapping("/api/news")
@Slf4j
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class NewsController {


    private final NewsService newsService;


    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping
    public Mono<NewsResponse> getNews() {

        log.info("Fetching news... At {}", new Date());
//        log.info("Fetching news... At {}", System.currentTimeMillis());
        return newsService.fetchNews();
    }


}
