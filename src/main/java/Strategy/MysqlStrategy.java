package Strategy;

import dbo.mysql.Conexao;

public class MysqlStrategy implements DbStrategy {



    @Override
    public void selecionar_db(String chave){
        dbo.mysql.Conexao conectar = new Conexao();



    }


}
