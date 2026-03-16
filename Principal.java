import java.util.Scanner;

public class Principal {
    public static void main(String[] args){

        Cliente cliente1 = new Cliente("123456789", "Lucas dos Santos", "");
        Conta minhaConta = new Conta(1000, cliente1);

        Cliente cliente2 = new Cliente("987654321", "Paula Henrique", "");
        Conta outraConta = new Conta(2000, cliente2);

        Scanner sc = new Scanner(System.in);
        int option = 0;
        double valor = 0;

        String successMessage = "Operação realizada com sucesso!";
        String errorMessage = "Erro ao realizar operação!";

        System.out.println("\nBem-vindo ao Banco-FIP");
        
        do{

            System.out.println("\n----MENU----");
            System.out.println("1 - SAQUE");
            System.out.println("2 - DEPÓSITO");
            System.out.println("3 - TRANSFERÊNCIA");
            System.out.println("4 - RESUMO");
            System.out.println("5 - SAIR\n");

            System.out.print("Digite o índice da operação: ");
            option = sc.nextInt();

            switch(option){
                case 1:
                    System.out.println("\n----SAQUE----\n");

                    System.out.println("Saldo disponível: " + minhaConta.getSaldo());
                    System.out.print("Valor: ");
                    valor = sc.nextDouble();

                    if(minhaConta.sacar(valor, "SAQUE")) {
                        System.out.println(successMessage);
                    }
                    else {
                        System.out.println(errorMessage);
                    }

                    break;
                case 2:
                    // DEPÓSITO
                    System.out.println("\n----DEPÓSITO----\n");

                    System.out.print("Valor: ");
                    valor = sc.nextDouble();

                    if(minhaConta.depositar(valor)){
                        System.out.println(successMessage);
                    }
                    else{
                        System.out.println(errorMessage);
                    }
                    break;
                case 3:
                    // TRANSFERIR
                    System.out.println("\n----TRANSFERÊNCIA----\n");

                    System.out.print("Valor: ");
                    valor = sc.nextDouble();

                    if(minhaConta.transferir(outraConta, valor)){
                        System.out.println(successMessage);
                    }
                    else{
                        System.out.println(errorMessage);
                    }

                    break;
                case 4:
                    // RESUMO
                    System.out.println("\n----RESUMO DA CONTA----\n");
                    String resumo = minhaConta.getResumo();
                    System.out.println(resumo);
                    break;
                case 5:
                    // SAIR
                    System.out.println("Saindo... até logo!");
                    break;

            }

        }while(option != 5);
    }
}