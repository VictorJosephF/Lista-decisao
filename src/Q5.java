//Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
//A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
//A mensagem "Reprovado", se a média for menor do que sete;
//A mensagem "Aprovado com Distinção", se a média for igual a dez.]

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