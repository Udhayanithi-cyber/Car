package com.car.ordering.Controller;

import com.car.ordering.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@CrossOrigin("http://localhost:4200")
@RestController
public class LoginController
{
    @Autowired
    private LoginService loginService;

    @GetMapping("user/{username}/{password}")
    public int LoginUser(@PathVariable("username") String username1, @PathVariable("password") String password1) throws SQLException {
        int flag = loginService.loginValidation(username1,password1);
        if (flag == 0)
        {
           return 0;
        }
        else
        {
            return flag;
        }

    }
}
