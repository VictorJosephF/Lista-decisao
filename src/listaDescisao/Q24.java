package listaDescisao;
import java.util.Scanner;
public class Q24 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = read.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = read.nextDouble();

        System.out.print("Digite a operação desejada (+, -, *, /): ");
        String operacao = read.next();

        double resultado = calcular(num1, num2, operacao);

        String tipoResultado = verificarNumero(resultado);


        System.out.println("\nResultado: " + resultado);
        System.out.println("Informações adicionais:");
        System.out.println("O resultado é " + tipoResultado);

    }

    public static double calcular(double num1, double num2, String operacao) {
        double resultado = 0.0;

        switch (operacao) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Operação inválida!");
                System.exit(0);
        }

        return resultado;
    }

    public static String verificarNumero(double resultado) {
        String tipo = "";

        if (resultado % 2 == 0) {
            tipo += "par, ";
        } else {
            tipo += "ímpar, ";
        }

        if (resultado >= 0) {
            tipo += "positivo e ";
        } else {
            tipo += "negativo e ";
        }

        if (resultado == Math.round(resultado)) {
            tipo += "inteiro";
        } else {
            tipo += "decimal";
        }

        return tipo;
    }

}
