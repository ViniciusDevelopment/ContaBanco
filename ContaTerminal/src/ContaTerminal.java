import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Numero;
        String Agencia, NomeCliente;
        double Saldo;
        


        System.out.println("Digite o seu nome:");
        NomeCliente = sc.nextLine();
        System.out.println("Digite o numero da agencia:");
        Agencia = sc.nextLine();
        System.out.println("Digite o numero da conta:");
        Numero = sc.nextInt();
        System.out.println("Digite o saldo da conta:");
        Saldo = sc.nextDouble();


        System.out.printf("O nome e: %s | A agencia e %s | O numero da conta e: %d | O saldo da conta e: %f", NomeCliente, Agencia, Numero, Saldo);



    }
}
    

