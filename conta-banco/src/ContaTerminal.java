import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o seu nome: ");
        String nomeCliente = sc.nextLine();
        System.out.println("Digite o número da agência");
        String agencia = sc.nextLine();
        System.out.println("Digite o número da conta sem o digito: ");
        int numero = sc.nextInt();

        long saldo = 1 + (long)(Math.random() * (1_000_000_000 - 1));

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia +  ", conta: " + numero + " e seu saldo " + saldo + " já está disponível para saque");
        
        sc.close();
    }    
}
