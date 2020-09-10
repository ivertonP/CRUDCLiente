package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Iverton
 */
public class Conexao {//Classe criada unicamente para estabelecer a conexao com o banco
    
    public static Connection getConexao(){
        
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud", "root", "2020");
            System.out.println("Conectado com sucesso.");
            return connection;
        }
        catch(SQLException e){
            System.out.println("Erro ao conectar com o banco de dados.\nErro: " + e);
        }
        return null;
    }
}
