package com.example.carservice.cartype;


import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;


@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@WebMvcTest(controllers = CarTypeController.class)
class CarTypeControllerTest {

    @Test
    void itShouldGetAllCarMakersName() {
        //Given
        //When
        //Then


    }

    @Test
    void itShouldGetCarByMakerName() {
        //Given
        //When
        //Then


    }
}