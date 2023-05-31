package listaDescisao;
import java.util.Scanner;

public class Q18 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("informe o dia:");
        int dia = read.nextInt();
        System.out.print("Informe o mês");
        int mes = read.nextInt();
        System.out.print("Informe o mês");
        int ano = read.nextInt();
        short valido = 0;
        read.close();
        if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
            if (dia<=31) {
                valido += 1;
            }
        }
        if (mes==4||mes==6||mes==9||mes==11) {
            if (dia<=30) {
                valido += 1;
            }
        }
        if (mes==2) {
            if (ano%4==0 && ano%100!=0 || ano%400==0) {
                if (dia<=29) {
                    valido += 1;
                }
            } else if (dia<=28) {
                valido += 1;
            }
        }
        if (valido==4) {
            System.out.println("Data Valida!");
        } else {
            System.out.println("Data Invalida!");
        }


    }
}
