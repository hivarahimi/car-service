package com.example.carservice.car;


import com.example.carservice.cartype.dto.CarDto;
import java.util.List;

public interface CarService {


    List<CarDto> findCarsByTypeId(Long typeId,int pageSize,int pageNumber);
    List<CarDto> searchCarsByCarModel(String model);

    List<CarDto> searchCarsByCarMakerName(String make);

}
