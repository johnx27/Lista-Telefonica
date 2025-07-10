package crud;

import connection.ConnectionForBD;
import listatelefonica.ListaTelefonica;

import java.sql.*;

public class Crud {
   private Connection conn;
   ListaTelefonica l1;

    public Crud() throws SQLException {
        ConnectionForBD conexao= new ConnectionForBD();
        this.conn=conexao.Conexao();
        this.l1= new ListaTelefonica();

    }


    public void InsertForBd() throws SQLException {

        l1.AdicionarCtt();
        String sql= "INSERT INTO contatos(nome,email,telefone) VALUES(?,?,?)";
        PreparedStatement smt=conn.prepareStatement(sql);


        smt.setString(1,l1.getName());
        smt.setString(3,l1.getTelephone());
        smt.setString(2,l1.getEmail());
        smt.executeUpdate();
        smt.close();

    }

    public void Exclused()throws SQLException{
        String queryLista= "SELECT id,nome FROM contatos";
        Statement smtListar= conn.createStatement();
        ResultSet result= smtListar.executeQuery(queryLista);

        System.out.println("=== REGISTROS ENCONTRADOS ===");
        while (result.next()) { // o codigo roda ate que nao tenha mais linhas para imprimir
            int id = result.getInt("id");
            String nome = result.getString("nome");
            System.out.println("ID: " + id + " | Nome: " + nome);
        }

        try {
            String queryDelete = "DELETE FROM  contatos WHERE id=?";
            l1.RemeoverCtt();
            PreparedStatement smt = conn.prepareStatement(queryDelete);
            smt.setInt(1, l1.getUser());
            smt.executeUpdate();
            smt.close();
            System.out.println("exclusao bem sucedida");
        }catch (SQLException e){
            System.out.println("erro na remoçao:"+e.getMessage());
        }


    }
}
