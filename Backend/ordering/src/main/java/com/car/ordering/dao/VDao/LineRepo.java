package com.car.ordering.dao.VDao;

import com.car.ordering.entity.VehicleEntity.VehicleLine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

//@Repository
//@RepositoryRestResource(collectionResourceRel = "VehicleLine", path = "Vehicle-Line")
@CrossOrigin("http://localhost:4200")
public interface LineRepo extends JpaRepository<VehicleLine, Long>
{

}
