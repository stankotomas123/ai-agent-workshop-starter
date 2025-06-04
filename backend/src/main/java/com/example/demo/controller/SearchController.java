package com.example.demo.controller;

import com.example.demo.dto.SearchRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {

    @GetMapping("/search")
    public String search(@RequestParam String query) {
        // TODO: Implement search logic
        return "Search results for: " + query;
    }

    @PostMapping("/search")
    public SearchRequest search(@RequestBody SearchRequest request) {
        return request;
    }
}
