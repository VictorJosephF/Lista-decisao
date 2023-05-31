package listaDescisao;
import java.util.Scanner;
public class Q22 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Digite um numero para saber se ele e par ou impar: ");
        int n = read.nextInt();
        if(n%2==0 && n != 0){
            System.out.printf("%i esse numero e par"+ n);
        }
        else if(n%2==1){
            System.out.println("Esse numero e impar");
        }
        else{
            System.out.println("esse numero e neutro.");
        }
    }

}
