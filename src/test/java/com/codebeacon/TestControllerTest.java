package com.codebeacon;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.options;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
public class TestControllerTest {
    @Autowired
    MockMvc mockMvc;

    @Test
    public void optionMethodTest() throws Exception {
        mockMvc.perform(options("/options"))
                .andDo(print())
                .andExpect(status().isOk())
        ;
    }

}
