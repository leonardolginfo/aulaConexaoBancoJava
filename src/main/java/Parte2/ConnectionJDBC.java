package Parte2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {
    public static void main(String[] args) {

        String passw = "784512";
        String userBd="postgres";
        String urlConnection = "jdbc:postgresql://localhost:5432/digital_dio_tqi/";
        Connection conectadBd=null;
try {
    conectadBd = DriverManager.getConnection(urlConnection, userBd,passw);
} catch (SQLException throwables) {
    throwables.printStackTrace();
}
    }
    }


