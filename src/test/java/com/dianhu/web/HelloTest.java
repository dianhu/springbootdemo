package com.dianhu.web;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

/**
 * Time : 18-8-29 下午9:51
 * Author : hcy
 * Description :
 */
@SpringBootTest
public class HelloTest {
    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception{
        mockMvc = MockMvcBuilders.standaloneSetup(new WebController()).build();
    }

    @Test
    public void getHello() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.post("/hello?name=hcy").accept(MediaType.APPLICATION_JSON_UTF8))
                .andDo(print());
    }

    @Test
    public void saveUsers() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/saveUser")
                .param("name","")
                .param("age","666")
                .param("pass","test")
        ).andDo(print());
    }
}
