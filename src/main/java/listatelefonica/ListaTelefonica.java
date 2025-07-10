package listatelefonica;

import java.util.Scanner;

public class ListaTelefonica {
    private String name;
    private String telephone;
    private String email;
    public Scanner scanner;
    public Integer user;


    public ListaTelefonica() {
        this.user=user;
        this.email = email;
        this.name=name;
        this.telephone=telephone;
        this.scanner=new Scanner(System.in) ;
    }


    public void AdicionarCtt(){
      while (true){
          System.out.println("Seu nome:");
          name=scanner.nextLine();

          System.out.println("seu telefone:");
          telephone=scanner.nextLine();

          System.out.println("seu email:");
          email= scanner.nextLine();

          System.out.println("digite x para fechar:");
          String userResposta= scanner.nextLine();

          if (userResposta.equals("x")){
              break;
          }


      }
    }
    public void RemeoverCtt(){
        System.out.println("Contatos que deseja remover com base no ID:");
        user =scanner.nextInt();
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getTelephone() {
        return telephone;
    }

    public Integer getUser() {
        return user;
    }
}
