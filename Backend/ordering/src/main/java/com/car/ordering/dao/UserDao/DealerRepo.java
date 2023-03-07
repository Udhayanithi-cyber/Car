package com.car.ordering.dao.UserDao;

import com.car.ordering.entity.detailsEntity.dealerdetails;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
//@RepositoryRestResource(collectionResourceRel = "dealerDetails", path = "Dealer-details")
public interface DealerRepo extends JpaRepository<dealerdetails, Long>
{

}
