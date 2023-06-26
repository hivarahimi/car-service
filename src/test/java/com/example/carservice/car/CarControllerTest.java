package com.example.carservice.car;

import com.example.carservice.model.CarEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

import static org.mockito.Mockito.when;


@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@WebMvcTest(controllers = CarController.class)
class CarControllerTest {



    //region Optional mock objects
    @MockBean
    private  CarService carService;

    //endregion
    //region Mandatory mock objects
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private WebApplicationContext applicationContext;
    //endregion

    @BeforeEach
    void simple_init() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(applicationContext).build();
    }

    @Test
    void itShouldGetCarListByType() {
//        when(carService.findCarsByTypeId(1l,0,5)).thenReturn(tutorials);

    }

    @Test
    void itShouldGetCarListByMaker() {
        //Given
        //When
        //Then


    }

    @Test
    void itShouldGetCarListByCarModel() {
        //Given
        //When
        //Then


    }
}