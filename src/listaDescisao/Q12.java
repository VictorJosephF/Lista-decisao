package listaDescisao;
import java.util.Scanner;
public class Q12 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Informe a quantidade de horas trabalhadas: ");
        double horas_trab = read.nextDouble();
        System.out.print("informe valor da sua remuneração por hora trabalhada: ");
        double valor_hora = read.nextDouble();
        read.close();
        double sal_bruto = horas_trab * valor_hora;
        double inss = sal_bruto*0.1;
        double fgts = sal_bruto*0.11;

        if(sal_bruto <=900){
            double ir = sal_bruto*0;
            double sal_des = inss+ir;

            System.out.print("=================================================================\n");
            System.out.print("          Salário Bruto:      "); System.out.print("("+horas_trab);System.out.print("*");System.out.print(valor_hora+")");System.out.print("           : R$\n");
            System.out.println(sal_bruto);
            System.out.print("-----------------------------------------------------------------\n");
            System.out.print("          (-) IR (Insento)");System.out.print("                        : R$\n");
            System.out.println(ir);
            System.out.print("-----------------------------------------------------------------\n");
            System.out.print("          (-) INSS (10%)");System.out.print("                          : R$\n");
            System.out.println(inss);
            System.out.print("-----------------------------------------------------------------\n");
            System.out.print("          FGTS (11%)");System.out.print("                              : R$\n");
            System.out.println(fgts);
            System.out.print("-----------------------------------------------------------------\n");
            System.out.print("          Total de descontos");System.out.print("                      : R$\n");
            System.out.println(sal_des);
            System.out.print("-----------------------------------------------------------------\n");
            System.out.print("          Salário Liquido");System.out.print("                         : R$\n");
            System.out.println(sal_bruto-sal_des);
            System.out.print("=================================================================\n");
        }
        if(sal_bruto > 900 && sal_bruto <= 1500){
            double ir = sal_bruto*0.05;
            double sal_des = inss+ir;
            System.out.print("=================================================================\n");
            System.out.print("          Salário Bruto:      "); System.out.print("("+horas_trab);System.out.print("*");System.out.print(valor_hora+")");System.out.print("           : R$\n");
            System.out.println(sal_bruto);
            System.out.print("-----------------------------------------------------------------\n");
            System.out.print("          (-) IR (Insento)");System.out.print("                        : R$\n");
            System.out.println(ir);
            System.out.print("-----------------------------------------------------------------\n");
            System.out.print("          (-) INSS (10%)");System.out.print("                          : R$\n");
            System.out.println(inss);
            System.out.print("-----------------------------------------------------------------\n");
            System.out.print("          FGTS (11%)");System.out.print("                              : R$\n");
            System.out.println(fgts);
            System.out.print("-----------------------------------------------------------------\n");
            System.out.print("          Total de descontos");System.out.print("                      : R$\n");
            System.out.println(sal_des);
            System.out.print("-----------------------------------------------------------------\n");
            System.out.print("          Salário Liquido");System.out.print("                         : R$\n");
            System.out.println(sal_bruto-sal_des);
            System.out.print("=================================================================\n");
        }
        if(sal_bruto > 1500 && sal_bruto < 2500){
            double ir = sal_bruto*0.10;
            double sal_des = inss+ir;
            System.out.print("=================================================================\n");
            System.out.print("          Salário Bruto:      "); System.out.print("("+horas_trab);System.out.print("*");System.out.print(valor_hora+")");System.out.print("           : R$\n");
            System.out.println(sal_bruto);
            System.out.print("-----------------------------------------------------------------\n");
            System.out.print("          (-) IR (Insento)");System.out.print("                        : R$\n");
            System.out.println(ir);
            System.out.print("-----------------------------------------------------------------\n");
            System.out.print("          (-) INSS (10%)");System.out.print("                          : R$\n");
            System.out.println(inss);
            System.out.print("-----------------------------------------------------------------\n");
            System.out.print("          FGTS (11%)");System.out.print("                              : R$\n");
            System.out.println(fgts);
            System.out.print("-----------------------------------------------------------------\n");
            System.out.print("          Total de descontos");System.out.print("                      : R$\n");
            System.out.println(sal_des);
            System.out.print("-----------------------------------------------------------------\n");
            System.out.print("          Salário Liquido");System.out.print("                         : R$\n");
            System.out.println(sal_bruto-sal_des);
            System.out.print("=================================================================\n");
        }
        if(sal_bruto >= 2500){
            double ir = sal_bruto*0.20;
            double sal_des = inss+ir;
            System.out.print("=================================================================\n");
            System.out.print("          Salário Bruto:      "); System.out.print("("+horas_trab);System.out.print("*");System.out.print(valor_hora+")");System.out.print("           : R$\n");
            System.out.println(sal_bruto);
            System.out.print("-----------------------------------------------------------------\n");
            System.out.print("          (-) IR (Insento)");System.out.print("                        : R$\n");
            System.out.println(ir);
            System.out.print("-----------------------------------------------------------------\n");
            System.out.print("          (-) INSS (10%)");System.out.print("                          : R$\n");
            System.out.println(inss);
            System.out.print("-----------------------------------------------------------------\n");
            System.out.print("          FGTS (11%)");System.out.print("                              : R$\n");
            System.out.println(fgts);
            System.out.print("-----------------------------------------------------------------\n");
            System.out.print("          Total de descontos");System.out.print("                      : R$\n");
            System.out.println(sal_des);
            System.out.print("-----------------------------------------------------------------\n");
            System.out.print("          Salário Liquido");System.out.print("                         : R$\n");
            System.out.println(sal_bruto-sal_des);
            System.out.print("=================================================================\n");
        }
    }
}
