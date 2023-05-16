import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;
public class Q13 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Digite o numero correspondente ao dia exe(1-Domingo, 2- Segunda, etc.): ");
        char num_dia = read.next().charAt(0);
        if(num_dia == '1'){
            System.out.println("Hoje é Domingo.");
        }
        else if(num_dia == '2'){
            System.out.println("Hoje é Segunda-feira.");
        }
        else if(num_dia == '3'){
            System.out.println("Hoje é Terça-feira.");
        }
        else if(num_dia == '4'){
            System.out.println("Hoje é Quarta-feira.");
        }
        else if(num_dia == '5'){
            System.out.println("Hoje é Quinta-feira.");
        }
        else if(num_dia == '6'){
            System.out.println("Hoje é Sexta-feira.");
        }
        else if(num_dia == '7'){
            System.out.println("Hoje é Sábado.");
        }
        else{
            System.out.println("Numero fora dos parâmetros");
        }

    }
}
