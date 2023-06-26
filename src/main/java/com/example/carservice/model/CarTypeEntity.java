package com.example.carservice.model;

import javax.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;


@Table(name="CAR_TYPE")
@Entity
public class CarTypeEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = -3395107818539159285L;

    private static final String CAR_TYPE_GENERATOR = "car_Type_entity_generator";
    @Getter@Setter
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = CAR_TYPE_GENERATOR)
    @SequenceGenerator(name = CAR_TYPE_GENERATOR, sequenceName = "CAR_TYPE_SEQUENCE", initialValue = 1, allocationSize = 1)
    private Long id;
    @Getter@Setter
    @Column(name = "MAKE",length = 50)
    private String make;
    @Getter@Setter
    @Column(name = "MODEL",length = 50)
    private String model;
    @Getter@Setter
    @Column(name = "CATEGORY",length = 50)
    private String category;
    @Getter@Setter
    @Column(name = "NEED_DRIVER")
    private Boolean needDriver;
    @Getter@Setter
    @Column(name = "PRICE")
    private String price;
    @Getter@Setter
    @OneToMany(mappedBy="type",fetch = FetchType.LAZY)
    private List<CarEntity> carEntityList;

    @Override
    public String toString() {
        return "CarTypeEntity{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", category='" + category + '\'' +
                ", needDriver=" + needDriver +
                ", price='" + price + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarTypeEntity that = (CarTypeEntity) o;
        return Objects.equals(make, that.make) && Objects.equals(model, that.model) && Objects.equals(category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, category);
    }
}
