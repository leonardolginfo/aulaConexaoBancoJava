package Parte2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {
    public static void main(String[] args) throws SQLException {

        // 2 - Definir parâmetros para se conectar ao banco de dados MySQL.
        String driver = "postgresql";
        String dataBaseAddress = "localhost";
        String dataBaseName = "digital_dio_tqi";
        String user = "rootnew";
        String password = "123456";

        String sbd = "jdbc:" + driver + "://" + dataBaseAddress + "/" + dataBaseName;

        String connectionUrl; //sb.toString() == "jdbc:postgresql://localhost/digital_dio_tqi"
        connectionUrl = sbd;


        try (Connection conn = DriverManager.getConnection(connectionUrl, user, password)) {
            System.out.println("SUCESSO ao se conectar ao banco Postgres!");
        } catch (SQLException e) {
            System.out.println("FALHA ao se conectar ao banco Postgres!");
            e.printStackTrace();
        }
    }
}


