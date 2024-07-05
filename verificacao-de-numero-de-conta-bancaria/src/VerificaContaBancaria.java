import java.util.Scanner;
public class VerificaContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String numeroConta = scanner.nextLine();
        
        try {
            verificarNumeroConta(numeroConta);
            System.out.println("Numero de conta valido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
        scanner.close();
    }
    
    public static void verificarNumeroConta(String numeroConta) {
        if (numeroConta.length() != 8) {
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }
        
        for (char c : numeroConta.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException("Numero de conta invalido. Digite apenas números.");
            }
        }
    }
}