package listaDescisao;
import java.util.Scanner;
public class Q27 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        double kgMorango, kgMaca, valorMorango, valorMaca, total;
        System.out.println("Informe quantos kilos de morango: ");
        kgMorango = read.nextDouble();
        System.out.println("Informe quantos kilos de maçã: ");
        kgMaca = read.nextDouble();
        read.close();
        if(kgMorango <= 5){
            valorMorango = kgMorango*2.50;
        }
        else{
            valorMorango = kgMorango*2.2;
        }
        if(kgMaca <= 5){
            valorMaca = kgMaca*1.8;
        }
        else{
            valorMaca = kgMaca*1.5;
        }
        total = valorMorango + valorMaca;
        System.out.printf("O valor total da compra foi de: R$ %.2f ", total);
    }
}
