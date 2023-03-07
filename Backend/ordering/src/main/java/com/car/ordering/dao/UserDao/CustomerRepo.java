package com.car.ordering.dao.UserDao;

import com.car.ordering.entity.detailsEntity.CustomerDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;


//@Repository
//@RepositoryRestResource(collectionResourceRel = "CustomerDetails", path = "Customer-details")
public interface CustomerRepo extends JpaRepository<CustomerDetails,Long>
{

}
