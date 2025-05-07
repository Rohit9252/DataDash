package com.api.dataforge.service;


import com.api.dataforge.model.NewsResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class NewsService {


    private final WebClient webClient;

    public NewsService(WebClient webClient) {
        this.webClient = webClient;
    }

    public Mono<NewsResponse> fetchNews() {
        return webClient.get()
                .uri("https://newsapi.org/v2/everything?q=business&from=2025-05-05&sortBy=publishedAt&pageSize=30&apiKey=c6d00f0088a34a34949f0acee9ab0b97")
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(NewsResponse.class);
//                .flatMapMany(response -> Flux.fromIterable(response.articles));
    }




}
