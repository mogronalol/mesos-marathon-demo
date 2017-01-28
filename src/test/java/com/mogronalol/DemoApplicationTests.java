package com.mogronalol;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DemoApplication.class}, loader = SpringApplicationContextLoader.class)
@WebIntegrationTest
public class DemoApplicationTests {

    private RestTemplate restTemplate;

    @Before
    public void setUp() {
        restTemplate = new RestTemplate();
    }

    @Test
    public void contextLoads() {
        final String result = restTemplate.getForObject("http://localhost:8082/", String.class);
        assertThat(result).isEqualTo("Hello world");
    }

}
