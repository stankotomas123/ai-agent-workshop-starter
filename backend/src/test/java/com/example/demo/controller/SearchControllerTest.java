package com.example.demo.controller;

import com.example.demo.dto.SearchRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@WebMvcTest(SearchController.class)
public class SearchControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testSearchPostEndpoint() throws Exception {
        SearchRequest searchRequest = new SearchRequest();
        searchRequest.setName("TestName");
        searchRequest.setId("TestId");

        mockMvc.perform(MockMvcRequestBuilders.post("/search")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(searchRequest)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("TestName"))
                .andExpect(jsonPath("$.id").value("TestId"));
    }
}
