package listaDescisao;
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Informe o turno que voce estuda e digite M-matutino ou V-Vespertino ou N- Noturno: ");
        char letter = read.next().charAt(0);
        read.close();
        if(letter == 'm' || letter == 'M'){
            System.out.print("BOM DIA!");
        }
        else if(letter == 'V' || letter == 'v'){
            System.out.print("BOA TARDE!");
        }
        else if(letter == 'n' || letter == 'N') {
            System.out.print("BOA NOITE!");
        }
        else{
            System.out.print("Valor invalido.");
        }
    }
}