package com.example.carservice.car;

import com.example.carservice.cartype.CarTypeService;
import com.example.carservice.cartype.dto.CarDto;
import com.example.carservice.exception.EntityNotFoundException;
import com.example.carservice.model.CarEntity;
import com.example.carservice.model.CarTypeEntity;
import com.example.carservice.util.Converter;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CarServiceImpl implements CarService{

    private final CarRepository carRepository;
    private final CarTypeService carTypeService;



    @Override
    public List<CarDto> findCarsByTypeId(Long typeId,int pageSize,int pageNumber) {
        Optional<CarTypeEntity>  carTypeOptional = carTypeService.getCardTypeById(typeId);
        if(carTypeOptional.isEmpty())
            throw new EntityNotFoundException(CarTypeEntity.class, "id", typeId.toString());

        Pageable pageable = PageRequest.of(pageNumber,pageSize);
        List<CarEntity> carEntitiesResult = carRepository.findByType(carTypeOptional.get(),pageable);
        return Converter.CarEntityToCarDto(carEntitiesResult);
    }

     @Override
     public List<CarDto> searchCarsByCarModel(String model) {
         List<CarDto> result = new ArrayList<>();
         List<CarTypeEntity> carTypeEntityList =  carTypeService.getListOfCarTypeEntitiesByModel(model);
         if(carTypeEntityList.isEmpty())
             throw new EntityNotFoundException(CarTypeEntity.class, "model", model);
         carTypeEntityList.forEach(carType -> {
           result.addAll(Converter.CarEntityToCarDto(carRepository.findByType(carType)));
         });
         return result;
    }

    @Override
    public List<CarDto> searchCarsByCarMakerName(String make) {
        List<CarDto> result = new ArrayList<>();
        List<CarTypeEntity> carTypeEntityList =  carTypeService.getListOfCarTypeEntitiesByMaker(make);
        if(carTypeEntityList.isEmpty())
            throw new EntityNotFoundException(CarTypeEntity.class, "make", make);

        carTypeEntityList.forEach(carType -> {
            result.addAll(Converter.CarEntityToCarDto(carRepository.findByType(carType)));
        });
        return result;
    }


}
