package contabanco.stdr;

import java.util.Scanner;
import java.math.BigDecimal;

public class ContaTerminal {

    public static void main(String[] args) {
       
        //TODO: Conhecer e importar a classe Scanner
        
        //Exibir as mensagens para o nosso usuario
        
        //Exibir a mensagem "Conta criada"
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Bem vindo ao nosso banco! Vamos criar sua conta?");
        
        System.out.println("Para começarmos, digite para mim seu nome completo: ");
        String nome = ler.nextLine();
        
        System.out.println("Perfeito! agora digite o ano em que você nasceu: ");
        int anoNasc = ler.nextInt();
        
        int idade = 2025 - anoNasc;
        
        if (idade < 18){
            System.out.println("Ops, infelizmente você não tem idade suficiente para abrir uma conta conosco, volte quando tiver 18 anos!");
            System.exit(0);
        } else {
            System.out.println("Certo, vamos continuar: ");
        }
        
        System.out.println("Informe o número da sua agência: (Ex.: 000-1)");
        String numAgenc = ler.next();
        
        System.out.println("Agora digite aqui o número da sua conta: ");
        int numConta = ler.nextInt();
        
        System.out.println("Muito bem! agora escolha a quantia a ser depositada para começar a movimentar sua conta: ");
        String entrada = ler.next();
        BigDecimal saldo = new BigDecimal(entrada);
        
       System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco.%nAgência: %s | Conta: %s | Saldo: R$%.2f já disponível para saque.%n", nome, numAgenc, numConta, saldo);

        
       
        
    }
    
}
