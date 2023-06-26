package com.example.carservice.cartype;


import com.example.carservice.util.Converter;
import com.example.carservice.cartype.dto.CarTypeDto;
import com.example.carservice.model.CarTypeEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CarTypeServiceImpl implements CarTypeService{

    private final CarTypeRepository carTypeRepository;


    @Override
    public List<String> getCarTypeList() {
        return carTypeRepository.getListOfMakers();
    }

    @Override
    public Optional<CarTypeEntity> getCardTypeById(Long typeId) {
        return carTypeRepository.findById(typeId);
    }

    @Override
    public List<CarTypeDto> getListOfTypesByMaker(String make){
        List<CarTypeEntity> dbResult = carTypeRepository.findByMake(make);
        return Converter.CarTypeEntityToCarTypeDto(dbResult);
    }

    @Override
    public List<CarTypeEntity> getListOfCarTypeEntitiesByMaker(String make) {
        return carTypeRepository.findByMake(make);
    }

    @Override
    public List<CarTypeEntity> getListOfCarTypeEntitiesByModel(String model) {
        return carTypeRepository.findByModel(model);
    }


}
