package com.car.ordering.dao.UserDao;

import com.car.ordering.entity.detailsEntity.logindetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

//@Repository
//@RepositoryRestResource(collectionResourceRel = "loginDetails", path = "Login-details")
@CrossOrigin("http://localhost:4200")
public interface LoginRepo extends JpaRepository<logindetails, Long>
{

}
