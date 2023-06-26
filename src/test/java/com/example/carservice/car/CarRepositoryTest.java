package com.example.carservice.car;

import com.example.carservice.model.CarEntity;
import com.example.carservice.model.CarTypeEntity;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class CarRepositoryTest {
    @Autowired
    private CarRepository underTest;


    @Test
    void itShouldFindByType() {
        CarTypeEntity carTypeEntity = new CarTypeEntity();
        carTypeEntity.setId(1l);
        List<CarEntity> result = underTest.findByType(carTypeEntity);
        assertThat(result, is(not(empty())));
    }

    @Test
    void itShouldTestFindByType() {
        CarTypeEntity carTypeEntity = new CarTypeEntity();
        carTypeEntity.setId(1l);
        List<CarEntity> result = underTest.findByType(carTypeEntity,PageRequest.of(0,5));
        assertThat(result, is(not(empty())));
    }
}