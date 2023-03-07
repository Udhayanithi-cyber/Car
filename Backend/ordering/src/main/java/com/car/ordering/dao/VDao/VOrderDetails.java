package com.car.ordering.dao.VDao;

import com.car.ordering.entity.VehicleEntity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VOrderDetails extends JpaRepository<OrderDetails, Long>
{

}
