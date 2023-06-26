package com.example.carservice.cartype;




import com.example.carservice.cartype.dto.CarTypeDto;
import com.example.carservice.model.CarTypeEntity;

import java.util.List;
import java.util.Optional;

public interface CarTypeService {
    List<String>  getCarTypeList();
    Optional<CarTypeEntity> getCardTypeById(Long typeId);
    List<CarTypeDto> getListOfTypesByMaker(String make);
    List<CarTypeEntity> getListOfCarTypeEntitiesByMaker(String make);
    List<CarTypeEntity> getListOfCarTypeEntitiesByModel(String model);


}
