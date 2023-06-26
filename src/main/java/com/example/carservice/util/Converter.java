package com.example.carservice.util;

import com.example.carservice.cartype.dto.CarDto;
import com.example.carservice.cartype.dto.CarTypeDto;
import com.example.carservice.model.CarEntity;
import com.example.carservice.model.CarTypeEntity;
import java.util.ArrayList;
import java.util.List;

public class Converter {

    public static List<CarDto> CarEntityToCarDto(List<CarEntity> carEntities){
        List<CarDto> carDtoList = new ArrayList<>();
        carEntities.forEach(carEntity -> {
            CarDto dto = new CarDto();
            dto.setColor(carEntity.getColor().getName());
            dto.setStatus(carEntity.getStatus().getText());
            dto.setMileage(carEntity.getMileage());
            dto.setType(CarTypeEntityToCarTypeDto(carEntity.getType()));
            dto.setVin(carEntity.getVin());
            dto.setRegistration(carEntity.getRegistration());
            dto.setPassengerCount(carEntity.getPassengerCount());
            dto.setProductionYear(carEntity.getProductionYear());
            carDtoList.add(dto);
        });
        return carDtoList;
    }

    public static CarTypeDto CarTypeEntityToCarTypeDto(CarTypeEntity carTypeEntity){
        CarTypeDto carTypeDto = new CarTypeDto();
        carTypeDto.setCategory(carTypeEntity.getCategory());
        carTypeDto.setMake(carTypeEntity.getMake());
        carTypeDto.setModel(carTypeEntity.getModel());
        carTypeDto.setPrice(carTypeEntity.getPrice());
        carTypeDto.setNeedDriver(carTypeEntity.getNeedDriver());
        return carTypeDto;
    }
    public static List<CarTypeDto> CarTypeEntityToCarTypeDto(List<CarTypeEntity> carTypeEntityList){
        List<CarTypeDto> dtoResult = new ArrayList<>();
        carTypeEntityList.forEach(carTypeEntity -> {
            CarTypeDto dto = new CarTypeDto();
            dto.setId(carTypeEntity.getId());
            dto.setCategory(carTypeEntity.getCategory());
            dto.setMake(carTypeEntity.getMake());
            dto.setModel(carTypeEntity.getModel());
            dto.setPrice(carTypeEntity.getPrice());
            dto.setNeedDriver(carTypeEntity.getNeedDriver());
            dtoResult.add(dto);
        });
        return dtoResult;
    }
}
