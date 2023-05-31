package listaDescisao;
import java.util.Scanner;
public class Q11 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Informe  seu salario atual: ");
        double sal_atual = read.nextDouble();
        read.close();
        if(sal_atual <= 280){
            System.out.printf("Salario antes do reajuste: R$%.2f \n",sal_atual);
            System.out.println("Ajuste de 20% aplicado.");
            System.out.printf("valor do aumento: R$%.2f\n",sal_atual*0.2);
            System.out.printf("O salario após reajuste: R$%.2f\n", sal_atual*1.2);
        }
        if(sal_atual > 280 && sal_atual < 700){
            System.out.printf("Salario antes do reajuste: R$%.2f \n",sal_atual);
            System.out.println("Ajuste de 15% aplicado.");
            System.out.printf("valor do aumento: R$%.2f\n",sal_atual*0.15);
            System.out.printf("O salario após reajuste: R$%.2f\n", sal_atual*1.15);
        }
        if(sal_atual > 700 && sal_atual  < 1500 ){
            System.out.printf("Salario antes do reajuste: R$%.2f \n",sal_atual);
            System.out.println("Ajuste de 10% aplicado.");
            System.out.printf("valor do aumento: R$%.2f\n",sal_atual*0.1);
            System.out.printf("O salario após reajuste: R$%.2f\n", sal_atual*1.1);
        }
        if(sal_atual > 1500){
            System.out.printf("Salario antes do reajuste: R$%.2f \n",sal_atual);
            System.out.println("Ajuste de 5% aplicado.");
            System.out.printf("valor do aumento: R$%.2f\n",sal_atual*0.05);
            System.out.printf("O salario após reajuste: R$%.2f\n", sal_atual*1.05);
        }


    }

}
