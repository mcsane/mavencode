package task7_2.dao;


import java.sql.*;
import java.util.*;


import task7_2.datasource.MariaDbConnection;

public class CurrencyDao {
    public double getRate(String app){
        Connection conn = MariaDbConnection.getInstance();
        String sql = "SELECT rate FROM currencies WHERE currency = ?";
        double rate = 0.0;

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, app);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                rate = rs.getDouble("rate");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return rate;
    }
}
