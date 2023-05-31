package listaDescisao;
import java.util.Scanner;

public class Q3 {
    public static void main(String[ ]args){
        Scanner read = new Scanner(System.in);
        System.out.print("Digite a inicial correspondente ao seu sexo: ");
        char letter = read.next().charAt(0);
        read.close();
        if(letter == 'M' || letter == 'm'){
            System.out.printf("A inicial %c corresponde ao sexo masculino.", letter);
        }
        else if(letter == 'F' || letter == 'f') {
            System.out.printf("A inicial %c corresponde ao sexo feminino.", letter);
        }
        else{
            System.out.print("Cade o banheiro dos não binarie kkkkkkk");
        }

    }
}
