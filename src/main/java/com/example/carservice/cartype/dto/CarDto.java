package com.example.carservice.cartype.dto;


import lombok.Data;

@Data
public class CarDto {

    private String registration;
    private String vin;
    private Integer mileage;
    private Integer passengerCount;
    private String productionYear;
    private String color;
    private String status;
    private CarTypeDto type;

}
