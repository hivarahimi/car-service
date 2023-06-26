package com.example.carservice.model;


import javax.persistence.*;
import lombok.Data;
import java.io.Serial;
import java.io.Serializable;

@Data
@Table(name="CAR")
@Entity
public class CarEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 6802868364278468996L;

    private static final String CAR_GENERATOR = "car_entity_generator";

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = CAR_GENERATOR)
    @SequenceGenerator(name = CAR_GENERATOR, sequenceName = "CAR_SEQUENCE", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "REGISTRATION",length = 50)
    private String registration;

    @Column(name = "VIN",length = 50)
    private String vin;

    @Column(name = "MILEAGE",length = 50)
    private Integer mileage;

    @Column(name = "PASSENGER_COUNT")
    private Integer passengerCount;


    @Column(name = "PRODUCTION_YEAR")
    private String productionYear;

    @ManyToOne
    @JoinColumn(name="COLOR_ID")
    private ColorEntity color;


    @ManyToOne
    @JoinColumn(name="STATUS_ID")
    private CarStatusEntity status;

    @ManyToOne
    @JoinColumn(name="TYPE_ID")
    private CarTypeEntity type;

    @Version
    private Integer version;



}
