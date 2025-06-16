package dbo.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public static Connection conectar( String url) {
        String usuario = "root";
        String senha = "";
        Connection conexao = null;

        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão estabelecida com o db!");

        } catch (SQLException e) {
            System.err.println("Falha na conexão com o db: " + e.getMessage());
        }

        return conexao;
    }
}
