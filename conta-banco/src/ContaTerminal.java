import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, digite o usuário: ");
        int numero = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Por favor, digite o número da agência: ");
        String agencia = entrada.nextLine();
        System.out.println("Por favor, digite o nome do cliente");
        String nomeCliente = entrada.nextLine();
        System.out.println("Por favor, digite o valor que deseja depositar");
        int saldo = entrada.nextInt();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
             ", conta " + numero + " e seu saldo R$" + saldo + ",00 já está disponível para saque.");

        entrada.close();
    }
}
