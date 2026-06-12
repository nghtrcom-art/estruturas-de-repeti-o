import java.util.Scanner;

public class algotitmo {

    public static void main(String[] args) {

        //Criação do objeto Scanner
        Scanner sc = new Scanner(System.in);

        //Declarando as variáveis
        String nome;
        int num, i = 0;


        //Instruções ao usuário e leitura das entradas
        System.out.println("Para começar, digite o seu nome");
        nome = sc.nextLine();

        System.out.println("Olá " + nome + "! Agora digite um número:");
        num = sc.nextInt();

        System.out.print("Aqui está a ordem crescente:\n");
        while (i < num) {
            i++;
            System.out.print(i + " ");
        }

        System.out.println("\nAqui está a ordem decrescente:");
        while (num > 0) {

            num--;
            System.out.print(num + " ");
        }
    }
} // Resolver problema de lógica no segundo loop, está comendo um número