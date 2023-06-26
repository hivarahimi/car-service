package com.example.carservice.model;

import javax.persistence.*;
import lombok.Data;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
@Table(name="COLOR")
@Entity
public class ColorEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1774900672570994738L;

    private static final String COLOR_GENERATOR = "color_entity_generator";

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = COLOR_GENERATOR)
    @SequenceGenerator(name = COLOR_GENERATOR, sequenceName = "COLOR_SEQUENCE", initialValue = 1, allocationSize = 1)
    private Long id;
    @Column(name = "NAME",length = 30)
    private String name;
    @Column(name = "CODE",length = 30)
    private String code;

    @OneToMany(mappedBy="color",fetch = FetchType.LAZY)
    private List<CarEntity> carList;
}
