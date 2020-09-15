package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Cliente;
import utils.Conexao;

/**
 *
 * @author Iverton
 */
public class ClienteDAO {//Classe que detem as atribuicoes SQL de Cliente conectando-se ao banco
    Connection connection = Conexao.getConexao();
    
    public void save(Cliente cliente){
        try {
            String insrt = "INSERT INTO clientes (nome, cpf) VALUES (?, ?)";
            PreparedStatement stmt = connection.prepareStatement(insrt);
            stmt.setString(1, cliente.getNome());
            stmt.setInt(2, cliente.getCpf());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso.");
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    public void update(Cliente cliente){
        try {
            String updt = "UPDATE clientes SET nome=? WHERE cpf=?";
            PreparedStatement stmt = connection.prepareStatement(updt);
            stmt.setString(1, cliente.getNome());
            stmt.setInt(2, cliente.getCpf());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso.");
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delete(Cliente cliente){
        try {
            String dlt = "DELETE FROM clientes WHERE cpf=?";
            PreparedStatement stmt = connection.prepareStatement(dlt);
            stmt.setInt(1, cliente.getCpf());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Cliente deletado com sucesso.");
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Cliente> select(){
        
        Connection con = Conexao.getConexao();
        PreparedStatement stmt;
        ResultSet rs;
        List<Cliente> listaCli = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM clientes");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Cliente cliente = new Cliente();
                cliente.setNome(rs.getString("Nome"));
                cliente.setCpf(rs.getInt("cpf"));
                listaCli.add(cliente);                
            }
            
        }
        catch(SQLException ex){
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaCli;
    }
}
