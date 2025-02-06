import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome.");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta.");
        int conta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência.");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o Valor Depositado.");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá "+ nome + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ conta +" e seu saldo "+ saldo +" já está disponível para saque\"");

        scanner.close();
    }
}
