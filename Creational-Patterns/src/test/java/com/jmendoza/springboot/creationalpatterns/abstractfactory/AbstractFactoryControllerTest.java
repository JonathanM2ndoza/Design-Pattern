package com.jmendoza.springboot.creationalpatterns.abstractfactory;

import com.jmendoza.springboot.creationalpatterns.CreationalPatternsApplication;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes = CreationalPatternsApplication.class)
@ExtendWith(SpringExtension.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AbstractFactoryControllerTest {

    private MockMvc mockMvc;

    @BeforeEach
    public void setUp(WebApplicationContext webApplicationContext) {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    @Order(1)
    public void getInputMacOS() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                .get("/abstract_factory/{os_name}", "mac")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("button").value("You have created MacOSButton."))
                .andExpect(MockMvcResultMatchers.jsonPath("checkbox").value("You have created MacOSCheckbox."));
    }

    @Test
    @Order(2)
    public void getInputWindows() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                .get("/abstract_factory/{os_name}", "windows")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("button").value("You have created WindowsButton."))
                .andExpect(MockMvcResultMatchers.jsonPath("checkbox").value("You have created WindowsCheckbox."));
    }
}
