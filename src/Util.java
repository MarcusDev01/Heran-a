import static java.lang.Long.parseLong;
import static java.lang.Integer.parseInt;

import java.util.Scanner;

public class Util {
    Controle controle=new Controle();
    Scanner sc= new Scanner(System.in);
    public void menu(){

        int opcao;



        System.out.println("escolha uma opcao de 1 a 4:\n1.inserir\n2.pesquisar\n3.listar\n4.finalizar");
        opcao=sc.nextInt();

        do{if(opcao<1 || opcao>4) {
            System.out.println("opcao invalida, escolha de 1 a 4");
            opcao = sc.nextInt();

            }else {
                switch (opcao) {
                    case 1:
                        inserir();
                        break;
                    case 2:
                        pesquisar();
                        break;
                    case 3:
                        listar();
                        break;
                    case 4:
                        return;
            }
        }

        }while(opcao!=4);

    }


    private void inserir(){
      long matricula;
      String nome;
      double totalDeVendas;
      double comissao;
      int totalDeHorasTrabalhadas;
      double valorDaHoraTrabalhada;
      String menu="1.empregado Comissionado\n2.empregado Horista\n3.sair";
      int opcao;


      while (true){
          System.out.println(menu);
          opcao=sc.nextInt();


          if(opcao==1 || opcao==2){
              System.out.println("digite o nome do empregado:");
              nome=sc.next();
              System.out.println("matricula do empregado:");
              matricula=sc.nextLong();

              if(opcao==1){
                  System.out.println("total de vendas:");
                  totalDeVendas=sc.nextDouble();
                  System.out.println("valor da venda:");
                  comissao=sc.nextDouble();


                  controle.inserir(new EmpregadoC(matricula,nome,totalDeVendas,comissao));
              }else{
                  System.out.println("total de horas:");
                  totalDeHorasTrabalhadas=sc.nextInt();
                  System.out.println("valor da hora trabalhada");
                  valorDaHoraTrabalhada=sc.nextDouble();
                  controle.inserir(new EmpregadoH(matricula,nome,totalDeHorasTrabalhadas,valorDaHoraTrabalhada));
              }

          }
          if(opcao==3){
              return;
          }
      }



    }

    private void pesquisar(){
        long matricula;

        System.out.println("matricula para pesquisa:");
        matricula=sc.nextLong();
        Empregado empregado;

        empregado=controle.pesquisar(matricula);

        if(empregado==null){
            System.out.println("Empregado nao encontrado");
        }else{
            System.out.println(empregado.getDados()+" encontrado");
        }
    }

    private void listar(){
        String lista= controle.listar();
        System.out.println(lista);
    }
}
