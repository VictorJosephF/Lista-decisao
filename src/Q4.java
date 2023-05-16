//Faça um Programa que verifique se uma letra digitada é vogal ou consoante.

import java.util.Scanner;
public class Q4 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Digite uma letra: ");
        char letter = read.next().charAt(0);
        read.close();
                if(letter == 'A'|| letter == 'a' || letter == 'E'|| letter == 'e' ||letter == 'I'||
                   letter == 'i' ||letter == 'O'|| letter == 'o' ||letter == 'U'|| letter == 'u'){

                    System.out.printf("A letra '%c' é uma vogal.", letter);
        }
                 else{
                    System.out.printf("A letra '%c' e uma consoante", letter);
        }
    }
}
