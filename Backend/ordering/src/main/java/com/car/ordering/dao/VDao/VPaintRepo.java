package com.car.ordering.dao.VDao;

import com.car.ordering.entity.VehicleEntity.VehicleModel;
import com.car.ordering.entity.VehicleEntity.VehiclePaint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;


//@CrossOrigin("http://localhost:4200")
//@RepositoryRestResource(collectionResourceRel = "VehiclePaint", path = "Vehicle-Paint")
public interface VPaintRepo extends JpaRepository<VehiclePaint, Long>
{

}
