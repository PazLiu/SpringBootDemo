package com.ss.test;

import com.ss.controller.TestBootController;
import jdk.net.SocketFlow;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloTests {

    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception{
        mockMvc = MockMvcBuilders.standaloneSetup(new TestBootController()).build();
    }

    @Test
    public void getHello() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/testboot").accept(MediaType.APPLICATION_JSON));
    }
}
