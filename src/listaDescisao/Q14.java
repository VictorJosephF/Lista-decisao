package listaDescisao;
import java.util.Scanner;
public class Q14 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Informe o valor da primeira nota parcial: ");
        double nota1 = read.nextDouble();
        System.out.print("Informe o valor da segunda nota parcial: ");
        double nota2 = read.nextDouble();
        double media = (nota1+nota2)/2;
        read.close();
        if(media >= 6){
            if(media >=9 && media <= 10){
                System.out.println("Nota A");
            }
            else if (media >= 7.5 && media < 9) {
                System.out.println("Nota B");
            }
            else if(media < 7.5){
                System.out.println("Nota C");
            }
            System.out.println("Aprovado!");
        }
        else if (media < 6) {
            if(media >= 4){
                System.out.println("Nota D");
            }
            else if(media < 4){
                System.out.println("Nota E");
            }
            System.out.println("Reprovado!");
        }
    }
}
