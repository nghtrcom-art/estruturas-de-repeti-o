import java.util.Scanner;

public class algotitmo {

    public static void main(String[] args) {

        //Criação do objeto Scanner
        Scanner sc = new Scanner(System.in);

        //Declarando as variáveis
        String nome;
        int num = 0, i = 0, y;


        //Instruções ao usuário e leitura das entradas//
        System.out.println("Para começar, digite o seu nome");
        nome = sc.nextLine().trim();


        System.out.println("Olá " + nome + "! Agora digite um número:");
        num = sc.nextInt();


        //Estrutura que irá exibir o nome digitado n vezes
        if(nome.length() > 6){
            for(y = 0; y < nome.length(); y ++){

                System.out.print(nome + " ");
            }
        }else{

            System.out.println(nome);
        }

        //Estrutura de repetição que irá realizar a contagem
        System.out.print("\nAqui está a ordem crescente:\n");

        while (i < num) {
            i++;
            System.out.print(i + " ");
        }

        System.out.println("\nAqui está a ordem decrescente:");
        while (num > 0) {

            System.out.print(num + " ");
            num--;

        }


    }
}