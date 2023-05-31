package listaDescisao;
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = read.nextInt();
        System.out.print("Digite outro numero: ");
        int num2 = read.nextInt();
        System.out.print("Digite outro numero: ");
        int num3 = read.nextInt();
        read.close();

        if(num > num2 && num > num3){
            System.out.printf("O numero %d é maior que os outros.", num);
        }
        else if(num2 > num3 && num2 > num){
            System.out.printf("O numero %d e maior que os outros.", num2);
        }
        else{
            System.out.printf("O numero %d e maior que os outros.", num3);
        }
    }
}
