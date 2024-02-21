package kz.bitlab.shop.items;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBManager {
    protected static Connection connection;

    static {
        try{
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/bitlab_shop",
                    "postgres",
                    "Gojava1995"
            );
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
