import crud.Crud;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        try {
            Crud crud = new Crud();
            crud.InsertForBd();
            System.out.println("inserçao correta");
            crud.Exclused();


        } catch (SQLException e) {
            System.out.println("erro em:" +e.getMessage());
        }
    }}
