package com.jmendoza.springboot.creationalpatterns.simplefactory;

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
public class SimpleFactoryControllerTest {

    private MockMvc mockMvc;

    @BeforeEach
    public void setUp(WebApplicationContext webApplicationContext) {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    @Order(1)
    public void getShapeCircle() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                .get("/simple_factory/{shape}", "CIRCLE")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("result").value("Inside Circle::draw() method."));
    }

    @Test
    @Order(2)
    public void getShapeRectangle() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                .get("/simple_factory/{shape}", "RECTANGLE")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("result").value("Inside Rectangle::draw() method."));
    }

    @Test
    @Order(3)
    public void getShapesquare() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                .get("/simple_factory/{shape}", "SQUARE")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("result").value("Inside Square::draw() method."));
    }
}
