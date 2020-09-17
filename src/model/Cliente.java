package model;

/**
 *
 * @author Iverton
 */
public class Cliente {//Atributos e metodos de Cliente
    private String nome, cpf, email, tel;
    
    
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }
    
    public String getTel(){
        return tel;
    }

    public void setTel(String tel){
        this.tel = tel;
    }
}