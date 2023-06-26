package com.example.carservice.cartype;


import com.example.carservice.model.CarTypeEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import java.util.Optional;


@ExtendWith(SpringExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class CarTypeServiceImplTest {

    @MockBean
    private  CarTypeRepository ctRepositoryUnderTest;
    private CarTypeService ctServiceUnderTest;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        ctServiceUnderTest = new CarTypeServiceImpl(ctRepositoryUnderTest);
    }

    @Test
    void itShouldGetCardTypeById() {
        CarTypeEntity carTypeEntity = new CarTypeEntity();
        carTypeEntity.setId(1l);carTypeEntity.setPrice("7000");carTypeEntity.setNeedDriver(true);
        carTypeEntity.setMake("Ford");carTypeEntity.setModel("Explorer");carTypeEntity.setCategory("SUV");
        ctRepositoryUnderTest.save(carTypeEntity);

        Mockito.when(ctServiceUnderTest.getCardTypeById(1l)).thenReturn(Optional.of(carTypeEntity));


    }
}