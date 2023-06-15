package listaDescisao;
import java.util.Scanner;
public class Q28 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String tipoCarne, tipoPagamento;
        double peso, valor, desconto = 0, preco = 0;
        System.out.println("Informe o tipo da carne que deseja: FD = file duplo, AL = alcatra, PC = picanha.");
        tipoCarne = read.next();
        System.out.println("informe o tipo do pagamento: Dinheiro, Cartao, cl = Cartão da Loja");
        tipoPagamento = read.next();
        System.out.println("Informe quantos kilos dessa carne você deseja: ");
        peso = read.nextDouble();
        read.close();
        if(tipoCarne.equals("FD") || tipoCarne.equals("fd")){
            if(peso <= 5){
                preco = 4.9;
                valor = peso*preco;
                if(tipoPagamento.equals("cl")){
                    desconto = valor*0.05;
                    valor = valor - desconto;
                }
                System.out.println("========================================");
                System.out.println("Tipo da carne: Filé Duplo");
                System.out.printf("Quantidade de carne: %.2f\n", peso);
                System.out.printf("Preco total: %.2f\n", peso*preco);
                System.out.println("Tipo de pagamento: "+ tipoPagamento);
                System.out.printf("Valor do desconto: %.2f\n", desconto);
                System.out.printf("Valor a pagar: %.2f\n", valor);
                System.out.println("========================================");
            }
            if(peso > 5){
                preco = 5.8;
                valor = peso*preco;
                if(tipoPagamento.equals("cl")){
                    desconto = valor*0.05;
                    valor = valor - desconto;
                }
                System.out.println("========================================");
                System.out.println("Tipo da carne: Filé Duplo");
                System.out.printf("Quantidade de carne: %.2f\n", peso);
                System.out.printf("Preco total: %.2f\n", peso*preco);
                System.out.println("Tipo de pagamento: "+ tipoPagamento);
                System.out.printf("Valor do desconto: %.2f\n", desconto);
                System.out.printf("Valor a pagar: %.2f\n", valor);
                System.out.println("========================================");
            }
        }
        if(tipoCarne.equals("AL") || tipoCarne.equals("al")){
            if(peso <= 5){
                preco = 5.9;
                valor = peso*preco;
                if(tipoPagamento.equals("cl")){
                    desconto = valor*0.05;
                    valor = valor - desconto;
                }
                System.out.println("========================================");
                System.out.println("Tipo da carne: Filé Duplo");
                System.out.printf("Quantidade de carne: %.2f\n", peso);
                System.out.printf("Preco total: %.2f\n", peso*preco);
                System.out.println("Tipo de pagamento: "+ tipoPagamento);
                System.out.printf("Valor do desconto: %.2f\n", desconto);
                System.out.printf("Valor a pagar: %.2f\n", valor);
                System.out.println("========================================");
            }
            if(peso > 5){
                preco = 6.8;
                valor = peso*preco;
                if(tipoPagamento.equals("cl")){
                    desconto = valor*0.05;
                    valor = valor - desconto;
                }
                System.out.println("========================================");
                System.out.println("Tipo da carne: Filé Duplo");
                System.out.printf("Quantidade de carne: %.2f\n", peso);
                System.out.printf("Preco total: %.2f\n", peso*preco);
                System.out.println("Tipo de pagamento: "+ tipoPagamento);
                System.out.printf("Valor do desconto: %.2f\n", desconto);
                System.out.printf("Valor a pagar: %.2f\n", valor);
                System.out.println("========================================");
            }
        }
        if(tipoCarne.equals("PC") || tipoCarne.equals("pc")){
            if(peso <= 5){
                preco = 6.9;
                valor = peso*preco;
                if(tipoPagamento.equals("cl")){
                    desconto = valor*0.05;
                    valor = valor - desconto;
                }
                System.out.println("========================================");
                System.out.println("Tipo da carne: Filé Duplo");
                System.out.printf("Quantidade de carne: %.2f\n", peso);
                System.out.printf("Preco total: %.2f\n", peso*preco);
                System.out.println("Tipo de pagamento: "+ tipoPagamento);
                System.out.printf("Valor do desconto: %.2f\n", desconto);
                System.out.printf("Valor a pagar: %.2f\n", valor);
                System.out.println("========================================");
            }
            if(peso > 5){
                preco = 7.8;
                valor = peso*preco;
                if(tipoPagamento.equals("cl")){
                    desconto = valor*0.05;
                    valor = valor - desconto;
                }
                System.out.println("========================================");
                System.out.println("Tipo da carne: Filé Duplo");
                System.out.printf("Quantidade de carne: %.2f\n", peso);
                System.out.printf("Preco total: %.2f\n", peso*preco);
                System.out.println("Tipo de pagamento: "+ tipoPagamento);
                System.out.printf("Valor do desconto: %.2f\n", desconto);
                System.out.printf("Valor a pagar: %.2f\n", valor);
                System.out.println("========================================");
            }
        }
    }
}
