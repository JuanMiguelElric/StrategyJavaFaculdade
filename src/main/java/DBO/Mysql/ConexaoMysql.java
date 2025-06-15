package DBO.Mysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMysql {

    private static  final String Usuario= "root";
    private static final String Senha ="";
    private static final String URL = "jdbc:mysql://localhost:3306/seu_banco";

    public static Connection conectar(){
        Connection conexao = null;

        try{
            conexao = DriverManager.getConnection(URL,Usuario, Senha);
            System.out.println("Conexão estabelecida com o Mysql");

        }catch (SQLException e){
            System.err.println("Falha na Conexao com o mysql" + e.getMessage());
        }
    }
}
