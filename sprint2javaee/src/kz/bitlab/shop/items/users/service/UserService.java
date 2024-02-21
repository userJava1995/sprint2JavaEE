package kz.bitlab.shop.items.users.service;

import kz.bitlab.shop.items.DBManager;
import kz.bitlab.shop.items.users.entity.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserService extends DBManager {

    public static Long login(String email, String password){
        Long id = null;
        try{
            PreparedStatement statement = connection.prepareStatement("" +
                    "select id from users where email = ? and password = ?");
            statement.setString(1, email);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next()){
                id = resultSet.getLong("id");
            }
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return id;
    }

    public static String returnName(Long id){
        String name = "";
        try{
            PreparedStatement statement= connection.prepareStatement("" +
                    "select full_name from users where id = ?");
            statement.setLong(1, id);
            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next()){
                name = resultSet.getString("full_name");
                System.out.println(name);
            }
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(name);
        return name;
    }
}
