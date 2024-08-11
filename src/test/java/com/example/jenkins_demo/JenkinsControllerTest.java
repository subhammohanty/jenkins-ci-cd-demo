package com.example.jenkins_demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@WebMvcTest
public class JenkinsControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testDemo() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/jenkins/greetings/{name}", "Subham"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}
