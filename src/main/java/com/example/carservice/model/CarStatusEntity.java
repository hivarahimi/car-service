package com.example.carservice.model;

import javax.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
@Table(name="CAR_STATUS")
@Entity
public class CarStatusEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1774911672570994738L;

    private static final String CAR_STATUS_GENERATOR = "car_status_entity_generator";


    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = CAR_STATUS_GENERATOR)
    @SequenceGenerator(name = CAR_STATUS_GENERATOR, sequenceName = "CAR_STATUS_SEQUENCE", initialValue = 1, allocationSize = 1)
    private Long id;


    @Column(name = "TEXT",length = 30)
    private String text;

    @Column(name = "CODE")
    private Integer code;

    @OneToMany(mappedBy="status",fetch = FetchType.LAZY)
    private List<CarEntity> carList;


}
