package com.example.carservice.car;

import com.example.carservice.CarServiceControllerVersion;
import com.example.carservice.cartype.dto.CarDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping(CarServiceControllerVersion.VERSION_1 + "cars")
@RequiredArgsConstructor
public class CarController {

    private final  CarService carService;




    @GetMapping(value = "/{type-id}")
    public ResponseEntity<List<CarDto>> getCarListByType(@PathVariable("type-id") Long input,
                                                         @RequestParam(name = "pageSize",defaultValue = "5", required = false) int pageSize,
                                                         @RequestParam(name = "pageNumber",defaultValue = "0", required = false) int pageNumber) {
        if (pageSize<=0) pageSize=5;
        if (pageNumber<=0) pageNumber=0;
        return ResponseEntity.ok(carService.findCarsByTypeId(input,pageSize,pageNumber));
    }

    @GetMapping("/{make}/maker")
    public ResponseEntity<List<CarDto>> getCarListByMaker(@PathVariable("make") String make) {

        return ResponseEntity.ok(carService.searchCarsByCarMakerName(make));
    }

    @GetMapping("/{model}/model")
    public ResponseEntity<List<CarDto>> getCarListByCarModel(@PathVariable("model") String model) {

        return ResponseEntity.ok(carService.searchCarsByCarModel(model));
    }




}
