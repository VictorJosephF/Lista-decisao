import java.util.Scanner;
public class Q15 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("informe um comprimento do primeiro lado do triangulo: ");
        double lado1 = read.nextDouble();
        System.out.print("informe um comprimento do segundo lado do triangulo: ");
        double lado2 = read.nextDouble();
        System.out.print("informe um comprimento do terceiro lado do triangulo: ");
        double lado3 = read.nextDouble();
        read.close();
        if(lado1+lado2 > lado3 || lado3+lado1 > lado2 || lado2+ lado3 >lado1){
            if(lado1 == lado2 && lado1 == lado3){
                System.out.print("Esses valores formam um triangulo equilátero.");
            }
            else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
                System.out.println("Esses valores formam um triângulo Isôsceles.");
            }
            else {
                System.out.println("Esses valores formam um triângulo escaleno.");
            }
        }
        else{
            System.out.println("Os valores informados não podem informar um triâgulo.");
        }


    }
}
