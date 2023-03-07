package com.car.ordering.dao.VDao;

import com.car.ordering.entity.VehicleEntity.VehicleEngine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.Column;

@CrossOrigin("http://localhost:4200")
public interface VEngineRepo extends JpaRepository<VehicleEngine, Long>
{

}
