package com.car.ordering.Service;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.sql.SQLException;


@Repository
@CrossOrigin("http://localhost:4200")
public interface LoginService
{
    public int loginValidation(String username,String password) throws SQLException;
}
