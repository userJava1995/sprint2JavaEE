package kz.bitlab.shop.items.service;

import kz.bitlab.shop.items.DBManager;
import kz.bitlab.shop.items.entity.Item;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ItemService extends DBManager {

    public static List<Item> findAll(){
        List<Item> items = new ArrayList<>();

        try{
            PreparedStatement statement = connection.prepareStatement("" +
                    "select * from items");
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                Item item = new Item();
                item.setId(resultSet.getLong("id"));
                item.setName(resultSet.getString("name"));
                item.setDescription(resultSet.getString("description"));
                item.setPrice(resultSet.getDouble("price"));
                items.add(item);
            }
            statement.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        return items;
    }

    public static List<Item> findTop10(){
        List<Item> bigPriceProducts = new ArrayList<>();

        try{
            PreparedStatement statement = connection.prepareStatement("" +
                    "select * from items order by price desc limit 10");
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                Item item = new Item();
                item.setId(resultSet.getLong("id"));
                item.setName(resultSet.getString("name"));
                item.setDescription(resultSet.getString("description"));
                item.setPrice(resultSet.getDouble("price"));
                bigPriceProducts.add(item);
            }
            statement.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        return bigPriceProducts;
    }

}
