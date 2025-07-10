package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionForBD {
   private  String url = "jdbc:postgresql://localhost:5432/lista_telefonica";
   private String user = "postgres";
   private String password = "99695421";


    public Connection Conexao() throws SQLException {
        try {
                Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão bem-sucedida!");
            return conn;
        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
        }
        return null;
    }


}

