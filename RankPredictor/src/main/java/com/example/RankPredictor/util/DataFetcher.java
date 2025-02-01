package com.example.RankPredictor.util;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@Component
public class DataFetcher {

    private final RestTemplate restTemplate = new RestTemplate();

    public List<Object> fetchQuizData(String url) {
        return restTemplate.getForObject(url, List.class);
    }
}
