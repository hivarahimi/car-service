package com.example.carservice.cartype;

import com.example.carservice.model.CarTypeEntity;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class CarTypeRepositoryTest {

    @Autowired
    private CarTypeRepository underTest;

    @Test
    void itShouldGetListOfMakers() {
        List<String> result = underTest.getListOfMakers();
        assertThat(result, is(not(empty())));
        assertThat(result,hasItem("Ford"));


    }


    @Test
    void itShouldFindByMake() {

        List<CarTypeEntity> result = underTest.findByMake("Ford");
        assertThat(result, is(not(empty())));


    }

    @Test
    void itShouldFindByModel() {
        List<CarTypeEntity> result = underTest.findByModel("Explorer");
        assertThat(result, is(not(empty())));



    }
}