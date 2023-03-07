package com.car.ordering.dao.VDao;

import com.car.ordering.entity.VehicleEntity.VehicleTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VTransactionRepo extends JpaRepository<VehicleTransaction, Long>
{
}
