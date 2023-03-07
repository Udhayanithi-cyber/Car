package com.car.ordering.dao.VDao;

import com.car.ordering.entity.VehicleEntity.VehicleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.Column;

//@Repository

//@RepositoryRestResource(collectionResourceRel = "VehicleModel", path = "Vehicle-Model")
public interface VModelRepo extends JpaRepository<VehicleModel, Long>
{


}
