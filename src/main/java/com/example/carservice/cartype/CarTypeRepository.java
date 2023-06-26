package com.example.carservice.cartype;



import com.example.carservice.model.CarTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;



interface CarTypeRepository extends JpaRepository<CarTypeEntity,Long> {

    @Query("SELECT ct FROM CarTypeEntity ct WHERE " +
            "ct.category LIKE CONCAT('%',:query, '%')" +
            "Or ct.make LIKE CONCAT('%',:query, '%')" +
            "Or ct.model LIKE CONCAT('%',:query, '%')" +
            "Or ct.needDriver = :query " +
            "Or ct.price LIKE CONCAT('%', :query, '%')")
    List<CarTypeEntity> searchCarType(String query);



    @Query("SELECT DISTINCT ct.make FROM CarTypeEntity ct")
    List<String> getListOfMakers();

    List<CarTypeEntity> findByMake(String make);
    List<CarTypeEntity> findByModel(String model);

}
