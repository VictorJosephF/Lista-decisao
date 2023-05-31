package listaDescisao;
import java.util.Scanner;
public class Q23 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double numero = read.nextDouble();
        String tipoNumero = verificarNumero(numero);
        System.out.println("O número é " + tipoNumero);
    }

    public static String verificarNumero(double numero) {
        if (numero == Math.round(numero)) {
            return "inteiro";
        } else {
            return "decimal";
        }
    }

}



