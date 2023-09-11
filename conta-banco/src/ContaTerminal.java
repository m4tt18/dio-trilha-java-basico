import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, digite o usuário: ");
        int numeroUsuario = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Por favor, digite o número da agência: ");
        String numeroAgencia = entrada.nextLine();
        System.out.println("Por favor, digite o nome do cliente");
        String nomeCliente = entrada.nextLine();
        System.out.println("Por favor, digite o valor que deseja depositar");
        int valorSaldo = entrada.nextInt();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia +
             ", conta " + numeroUsuario + " e seu saldo R$" + valorSaldo + ",00 já está disponível para saque.");

        entrada.close();
    }
}
