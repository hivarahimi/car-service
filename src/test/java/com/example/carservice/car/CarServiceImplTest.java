package com.example.carservice.car;

import com.example.carservice.cartype.CarTypeService;
import com.example.carservice.model.CarEntity;
import com.example.carservice.model.CarStatusEntity;
import com.example.carservice.model.ColorEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(SpringExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class CarServiceImplTest {



    @MockBean
    private CarRepository carRepository;
    @MockBean
    private CarService carService;

    @MockBean
    private CarTypeService carTypeService;
    @BeforeEach
    void setUp(){
        MockitoAnnotations.initMocks(this);
    }
    @Test
    void itShouldSearchCarsByCarModel() {
        //Given
//        ColorEntity color = new ColorEntity(); color.setId(1l);color.setCode("#000000");color.setName("Black");
//        CarEntity carEntity = new CarEntity();
//        carEntity.setType(carTypeEntity); carEntity.setMileage(1000); carEntity.setVin("453fgsdfgs5343"); carEntity.setProductionYear("2020");
//        carEntity.setId(1l);carEntity.setColor(color); carEntity.setStatus(new CarStatusEntity()); carEntity.setPassengerCount(5);
        //When
        //Then


    }

}