package com.javatechie;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@SpringBootTest
class JenkinsCiCdApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGreetingsEndPoint() throws Exception{
        String name ="AsgarAhmed";
        mockMvc.perform(MockMvcRequestBuilders.get("/greetings/{name}", name))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Hello "+name+" You have successfully completed Jenkins CI CD!!"));
    }

}
