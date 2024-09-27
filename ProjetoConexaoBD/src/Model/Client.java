/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Client {
    private int codigo;
    private String nome;
    private String telefone;
    private String email;
    Conexao con = new Conexao();

    public Client() {
        this(0,"","","");
    }

    public Client(int codigo, String nome, String telefone, String email) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void cadastrar(){
    String sql;
    sql = "insert into Cliente(codigo, nome, telefone, email) values"+ 
            "("+ getCodigo()+ ", '" + getNome()+ 
            "','"+ getTelefone()+ "', ' "+ getEmail() +"')";
con.executeSQL(sql);
JOptionPane.showMessageDialog(null,"Registro salvo com sucesso");
    }
    public ResultSet consultar(){
    ResultSet tabela;
    tabela = null;
    String sql = "select * from Cliente";
    tabela = con.RetornarResultset(sql);
            return tabela;
    }
    
}
