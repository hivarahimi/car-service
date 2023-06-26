package com.example.carservice.cartype;

import com.example.carservice.CarServiceControllerVersion;
import com.example.carservice.cartype.dto.CarTypeDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(CarServiceControllerVersion.VERSION_1 + "car-types")
@RequiredArgsConstructor
public class CarTypeController {

    private final CarTypeService carTypeService;

    @GetMapping("/all")
    public ResponseEntity<List<String>> getAllCarMakersName() {
        return ResponseEntity.ok(carTypeService.getCarTypeList());
    }


    @GetMapping("/{make}")
    public ResponseEntity<List<CarTypeDto>> getCarByMakerName(@PathVariable String make) {

        return ResponseEntity.ok(carTypeService.getListOfTypesByMaker(make));
    }

}
