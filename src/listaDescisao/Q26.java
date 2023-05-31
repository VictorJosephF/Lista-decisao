package listaDescisao;
import java.util.Scanner;
public class Q26 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        double valor = 0.0, litros = 0.0;
        char combustivel;
        System.out.println("Digite o tipo do combustivel que voce deseja G para gasolina ou A para alcool: ");
        combustivel = read.next().charAt(0);
        System.out.println("Digite quantos litros do combustivel: ");
        litros = read.nextDouble();
        read.close();
        if(combustivel == 'G'){
            if(litros <= 20){
                valor = litros*2.4;
            }
            if(litros > 20){
                valor = litros*2.35;
            }
        }
        if(combustivel == 'A'){
            if(litros <= 20){
                valor = litros*1.843;
            }
            if(litros > 20){
                valor = litros*1.805;
            }
        }
        System.out.println("O valor a ser pago é: R$"+ valor);
    }
}
