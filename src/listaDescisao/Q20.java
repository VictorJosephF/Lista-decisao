package listaDescisao;
import java.util.Scanner;
public class Q20 {
    public static void main(String[] args){
        double nota1, nota2, nota3, media;
        Scanner read = new Scanner(System.in);
        System.out.print("Informe uma das notas: ");
        nota1 = read.nextDouble();
        System.out.print("Informe uma das notas: ");
        nota2 = read.nextDouble();
        System.out.print("Informe uma das notas: ");
        nota3 = read.nextDouble();
        read.close();

        media = (nota1+nota2+nota3)/3;

        if(media >= 7 && media < 10 ){
            System.out.println("APROVADO");
        }
        else if(media == 10){
            System.out.println("Aprovado com Distinção");
        }
        else{
            System.out.println("REPROVADO");
        }


    }

}
