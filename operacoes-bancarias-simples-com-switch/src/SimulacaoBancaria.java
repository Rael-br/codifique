import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;
        
        String textoGrande = """
                |----- Seja Bem-vindo -----|
                por favor escolha umas das opções abaixo
                1.Depositar.
                2.Sacar.
                3.Consultar Saldo
                0.Encerrar.
                """;       
        System.out.println(textoGrande);

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                System.out.println( "Por favor, digite o saldo a depositar!");
                double saldoDeposito = scanner.nextDouble();
                if (saldoDeposito >= 0) {
                    saldo += saldoDeposito;
                    System.out.println("Depósito realizado com sucesso. Saldo atual: " + saldo);
                }else {
                    System.out.println("Valor de depósito inválido.");
                }
                    break;
                case 2:
                System.out.println("Por favor, digite o saldo a retirar");
                double saldoRetirar = scanner.nextDouble();
                if (saldoRetirar <= saldo) {    
                    saldo -=saldoRetirar;
                System.out.println("Saque de " + saldoRetirar + " realizado com sucesso. Saldo atual: " + saldo);
                } else {
                    System.out.println("Saldo insuficiente para saque.");
                }
                    break;
                case 3:
                System.out.println("O seu saldo atual e: " + saldo);   
                    break;
                case 0:
                    System.out.println("Programa encerrado.Obrigado pela sua preferencia!");
                    continuar = false; 
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
