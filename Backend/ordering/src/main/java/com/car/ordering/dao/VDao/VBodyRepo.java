package com.car.ordering.dao.VDao;

import com.car.ordering.entity.VehicleEntity.VehicleBody;
import com.car.ordering.entity.VehicleEntity.VehicleTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface VBodyRepo extends JpaRepository<VehicleBody, Long>
{

}
