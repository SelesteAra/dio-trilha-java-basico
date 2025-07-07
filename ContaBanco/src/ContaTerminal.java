import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: Conhecer e importar a classe Scanner

        // Exibir as mensagens para nosso usuário

        // Obter pela classe scanner os valores digitados no terminal

        // Exibir a mensagem conta criada


        
        var scanner = new Scanner(System.in); 
        
        System.out.println("Informe o numero da conta: ");
        var Numero = scanner.nextInt();

        System.out.println("Informe a agencia: ");
        var Agencia = scanner.next();

        System.out.println("Informe o nome do cliente: ");
        var NomeCliente = scanner.next();

        System.out.println("Informe o Saldo");
        
        var Saldo = scanner.nextFloat();

        
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque \n", NomeCliente, Agencia, Numero, Saldo); 

        scanner.close(); 
    }
