package listaDescisao;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int number1 = read.nextInt();
        System.out.print("Digite um numero: ");
        int number2 = read.nextInt();
        read.close();
        if(number1 > number2){
            System.out.printf("O numero %d é maior que o %d. ", number1,number2);

        }
        else if(number2 > number1 ){
            System.out.printf("O numero %d e maior que o %d", number2, number1);
        }
        else{
            System.out.println("Os numero são iguais");

        }





    }


}