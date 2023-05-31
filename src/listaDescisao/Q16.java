package listaDescisao;
import java.util.Scanner;
public class Q16 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite o valor de a: ");
        double a = read.nextDouble();
        read.close();
        if (a == 0) {
            System.out.println("A equação não é do segundo grau. Encerrando o programa.");
            System.exit(0);
        }
        System.out.print("Digite o valor de b: ");
        double b = read.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = read.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            System.out.println("A equação não possui raízes reais. Encerrando o programa.");
            System.exit(0);
        } else if (delta == 0) {
            double raiz = -b / (2 * a);
            System.out.println("A equação possui apenas uma raiz real: " + raiz);
        } else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("A equação possui duas raízes reais: " + raiz1 + " e " + raiz2);}
         }
}



