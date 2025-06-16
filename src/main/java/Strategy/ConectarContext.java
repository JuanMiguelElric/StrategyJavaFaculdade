package Strategy;

public class ConectarContext {
    private DbStrategy conectar;

    public String urlSqlServer = "a";
    public String Mysql = "b";


    public void setConectar (DbStrategy strategy){
        this.conectar = strategy;
    }

    public void realizarConexao(String conexao){

        if(conexao == "1"){
            //para conectar ao mysql
            conectar.selecionar_db(Mysql);
        }

        if(conexao == "2"){
            //vair conectar com o sql server
            conectar.selecionar_db(urlSqlServer);
        }


    }
}
