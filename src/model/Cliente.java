package model;

/**
 *
 * @author Iverton
 */
public class Cliente {//Atributos e metodos de Cliente
    private String nome;
    private int cpf;
    
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getCpf(){
        return cpf;
    }

    public void setCpf(int cpf){
        this.cpf = cpf;
    }
}