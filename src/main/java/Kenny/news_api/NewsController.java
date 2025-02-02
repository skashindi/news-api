package Kenny.news_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController

public class NewsController {
    private static final String API_KEY = "a9339114e1d04e308ff29d0a235678ed"; // Your API Key
    private static final String BASE_URL = "https://newsapi.org/v2/top-headlines?country=us&apiKey=" + API_KEY;

    @GetMapping("/api/news")
    public String getNews() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(BASE_URL, String.class);
    }
}
