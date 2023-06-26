package com.example.carservice.cartype.dto;


import lombok.Data;

@Data
public class CarTypeDto {

    private Long id;
    private String make;
    private String model;
    private String category;
    private Boolean needDriver;
    private String price;
}
