package listaDescisao;
import java.util.Scanner;
public class Q25 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int validade = 0;
        String resposta;
        System.out.println("Responda as seguintes perguntas com Sim ou Não!");
        System.out.println("telefonou para a vítimas?");
        resposta = read.next();

        if(resposta.equals("Sim")){
            validade += 1;
        }
        System.out.println("Esteve no local do crime?");
        resposta = read.next();

         if(resposta.equals("Sim")){
            validade +=1;
        }
        System.out.println("Mora perto do crime?");
        resposta = read.next();

        if(resposta.equals("Sim")){
            validade +=1;
        }
        System.out.println("Devia para a vítima?");
        resposta = read.next();

        if(resposta.equals("Sim")){
            validade +=1;
        }
        System.out.println("Já trabalhou para a vítima?");
        resposta = read.next();

        if(resposta.equals("Sim")){
            validade +=1;
        }
        if(validade == 2){
            System.out.println("Classificação: Suspeita!");
        }
        if(validade >=3 &&  validade <= 4){
            System.out.println("Classificação: Cúmplice!");
        }
        if(validade == 5){
            System.out.println("Classificação: Culpado!");
        }
        if(validade < 2){
            System.out.println("Classificação: Inocente!");
        }
    }
}
