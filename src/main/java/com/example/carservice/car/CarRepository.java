package com.example.carservice.car;

import com.example.carservice.model.CarEntity;
import com.example.carservice.model.CarTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
import org.springframework.data.domain.Pageable;


interface CarRepository extends JpaRepository<CarEntity,Long> {


    List<CarEntity> findByType(CarTypeEntity type,final Pageable pageable);
    List<CarEntity> findByType(CarTypeEntity type);
}

