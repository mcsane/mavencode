package task7_2.datasource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MariaDbConnection {
    private static Connection conn = null;

    public static Connection getInstance(){
        if(conn == null){
            try{
                conn = DriverManager.getConnection(
                        "jdbc:mariadb://localhost:3306/currency_converter?user=appuser&password=password");
            }catch (SQLException e){
                e.printStackTrace();
                System.out.println("Connection failed");
            }
            return conn;
        }
        else {
            return conn;
        }
    }
    public static void terminate(){
        try{
            getInstance().close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
