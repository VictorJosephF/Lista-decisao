package listaDescisao;

import java.util.Scanner;
public class Q21 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Digite o valor do saque (entre 10 e 600 reais): ");
        int valorSaque = read.nextInt();

        if (valorSaque < 10 || valorSaque > 600) {
            System.out.println("Valor de saque inválido. O valor mínimo é de 10 reais e o máximo é de 600 reais.");
        } else {
            int notas100 = valorSaque / 100;
            valorSaque %= 100;

            int notas50 = valorSaque / 50;
            valorSaque %= 50;

            int notas10 = valorSaque / 10;
            valorSaque %= 10;

            int notas5 = valorSaque / 5;
            valorSaque %= 5;

            int notas1 = valorSaque;

            System.out.println("Quantidade de notas fornecidas:");
            System.out.println("Notas de 100 reais: " + notas100);
            System.out.println("Notas de 50 reais: " + notas50);
            System.out.println("Notas de 10 reais: " + notas10);
            System.out.println("Notas de 5 reais: " + notas5);
            System.out.println("Notas de 1 real: " + notas1);
        }

        read.close();
    }

}
