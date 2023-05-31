package listaDescisao;
import java.util.Scanner;
public class Q19 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Informe um numero menor que 1000: ");
        int num = read.nextInt();
        read.close();

        if(num < 0 || num >=1000);{
            System.out.println("O número digitado está fora do intervalo desejado");

        }
        int centenas = num / 100;
        int dezenas = (num % 100)/10;
        int unidades = num % 10;

        System.out.print(num +" = ");

        if(centenas > 0) {
            System.out.print(centenas);
            if(centenas == 1) {
                System.out.print(" centena");
            } else {
                System.out.print(" centenas");
            }
            if(dezenas > 0 || unidades > 0) {
                System.out.print(" e ");
            }
        }

        if(dezenas > 0) {
            System.out.print(dezenas);
            if(dezenas == 1) {
                System.out.print(" dezena");
            } else {
                System.out.print(" dezenas");
            }
            if(unidades > 0) {
                System.out.print(" e ");
            }
        }

        if(unidades > 0) {
            System.out.print(unidades);
            if(unidades == 1) {
                System.out.print(" unidade");
            } else {
                System.out.print(" unidades");
            }
        }

        System.out.println(".");
    }
  }


