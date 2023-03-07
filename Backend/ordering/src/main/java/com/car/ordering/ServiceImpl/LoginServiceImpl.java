package com.car.ordering.ServiceImpl;

import com.car.ordering.Service.LoginService;
import com.car.ordering.dbutil.DBUtil;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Service
@CrossOrigin("http://localhost:4200")
public class LoginServiceImpl implements LoginService
{
    Connection connection;
    int flag = 0;
    public LoginServiceImpl() throws SQLException
    {
        connection = DBUtil.getConnection();
    }

    @Override
    public int loginValidation(String username, String password) throws SQLException {
try{
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM logindetails WHERE username = '"+username+"'");
        ResultSet rs = statement.executeQuery();

        while(rs.next())
        {
            if(rs.getString(6).equals(username)&&rs.getString(5).equals(password))
            {
                flag=1;
            }
            else
            {
              System.out.println("Invalid Username and password");
              flag=0;
            }
        }
    }
    catch(SQLException e)
    {
        e.printStackTrace();
    }
    return flag;
}
}