//Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args){
      Scanner read = new Scanner(System.in);
      System.out.print("Digite um numero: ");
      int number = read.nextInt();
      read.close();
      if(number > 0){
          System.out.printf("O numero %d é positivo.", number);
      }
      else if(number < 0){
          System.out.printf("O numero %d é negativo.", number);
      }
      else{
          System.out.printf("O numero %d é neutro.", number);
      }
    }
}
