import java.util.Scanner;

public class ContaTerminal {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Bem vindo ao ByteBank!");
        System.out.println("Me diga seu nome completo: ");
        String clientName = scanner.nextLine();
        System.out.println("agora digite o número da sua agência: XXXX");
        int agencyNumber = scanner.nextInt();
        System.out.println("Digite o número da sua conta: XXXXXX-X: ");
        String accountNumber = scanner.next();
        System.out.println("Por último, digite o saldo da sua conta: ");
        double accountBalance = scanner.nextDouble();
        System.out.println("Olá, " + clientName + " obrigado por criar uma conta em nosso banco, sua agência é " + agencyNumber + ", conta " + accountNumber + " e seu saldo " +accountBalance + " já está disponível para saque.");
    }
}
