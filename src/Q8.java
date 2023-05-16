import java.util.Scanner;

public class Q8 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Digite o valor do produto 01: ");
        double num = read.nextDouble();
        System.out.print("Digite o valor do produto 02: ");
        double num2 = read.nextDouble();
        System.out.print("Digite o valor do produto 03: ");
        double num3 = read.nextDouble();
        read.close();

        if(num < num2 && num < num3){
            System.out.printf("O produto 1 e o mais barato, valor: %.2f.", num);
        }
        else if(num2 < num3 && num2 < num){
            System.out.printf("O produto 2 tem o vaor mais barato, valor: %.2f.", num2);
        }
        else{
            System.out.printf("P produto 3 tem o valor e o mais barato valor: %.2f.", num3);
        }
    }
}
