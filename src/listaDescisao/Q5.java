package listaDescisao;

import java.util.Scanner;
public class Q5 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Digite a primeira nota parcial: ");
        double score = read.nextDouble();
        System.out.print("Digite a segunda nota parcial: ");
        double score2 = read.nextDouble();
        read.close();

        double average = (score + score2) / 2;

        if(average >= 7 && average < 10){
            System.out.printf("'APROVADO' com media %.1f.",average);
        }
        else if( average == 10){
            System.out.printf("'APROVADO COM DISTINÇÃO' com media %.1f.", average);
        }
        else{
            System.out.printf("'REPROVADO' com media %.1f.",average);
        }
    }
}