import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Dados Dos Clientes.
        String name = "Alguém Aleatório";
        String accountType = "Corrente";
        double openingBalance = 2330.00;

        System.out.println("*************************************************************");
        System.out.println("\nNome do cliente: " + name);
        System.out.println("\nTipo de conta: " + accountType);
        System.out.println("\nSaldo atual: " + openingBalance);
        System.out.println("\n*************************************************************");

        //Menu.
        int option = 0;

        String menu = """
                
                ***** Menu de Opções *****                
                1 - Consulta do saldo
                2 - Transferir Valores
                3 - Receber / Depósito
                4 - Sair
                **************************
                """;

        // Lê o que foi digitado(Scanner) e Permite inserir as opções (System.in).
        Scanner reading = new Scanner(System.in);

        //Encerra caso a opção for 4.
        while (option != 4) {
            System.out.println(menu);
            option = reading.nextInt();

            // Realiza as transações.
            if (option == 1) {
                System.out.println("Saldo atual é R$" + openingBalance);
            } else if ( option == 2) {
                System.out.println("Insira valor para tranferência.");
                double value = reading.nextDouble();
                if (value > openingBalance){
                    System.out.println("Saldo Insuficiente para transação.");
                } else {
                    openingBalance -= value; // openingBalance = value - openingBalance
                    System.out.println("Transação realizada com Sucesso. Saldo atual: " + openingBalance);
                }
            } else if ( option == 3) {
                System.out.println("Valor recebido: ");
                double value = reading.nextDouble();
                openingBalance += value; // openingBalance = value + openingBalance
                System.out.println("Saldo Atual: " + openingBalance);
            } else if ( option != 4) {
                System.out.println("Opção Inválida");
            }
        }
    }
}