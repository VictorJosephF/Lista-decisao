package listaDescisao;
import java.util.Scanner;
public class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char sexo;
        char eCivil;
        System.out.println("O NOME DEVE SER MAIOR QUE 3 CARACTERES!");
        System.out.println("O IDADE DEVE ESTAR ENTRE 0 E 150!");
        System.out.println("O SALÁRIO DEVE SER MAIOR QUE 0!");
        System.out.println("SEX0 'F' OU 'M'!");
        System.out.println("ESTADO CIVIL: 'S', 'C', 'V', 'D'!");
        System.out.printf("\n");
        System.out.println("Informe o nome: ");
        String nome = sc.next();
        while (nome.length() <= 3) {
            System.out.println("Nome inválido!");
            System.out.println("O NOME DEVE SER MAIOR QUE 3 CARACTERES!");
            System.out.println("Informe o nome: ");
            nome = sc.next();
        }
        System.out.println("Informe a idade: ");
        double idade = sc.nextInt();
        while (idade > 0 && idade < 150) {
            System.out.println("Idade inválida!");
            System.out.println("O IDADE DEVE ESTAR ENTRE 0 E 150!");
            System.out.println("Informe a idade: ");
            idade = sc.nextInt();
        }
        System.out.println("Informe o salário: ");
        double salario = sc.nextDouble();
        while (salario <= 0) {
            System.out.println("Salário inválido!");
            System.out.println("O SALÁRIO DEVE SER MAIOR QUE 0!");
            System.out.println("Informe o salário:");
            salario = sc.nextDouble();
        }
        System.out.println("Informe o sexo: ");
        sexo = sc.next().charAt(0);
        while (sexo != 'F' && sexo != 'M') {
            System.out.println("Sexo inválido!");
            System.out.println("SEX0 'F' OU 'M'!");
            System.out.println("Informe o sexo: ");
            sexo = sc.next().charAt(0);
        }
        System.out.println("Informe o Estado Civil: ");
        eCivil = sc.next().charAt(0);
        while (eCivil != 'S' && eCivil != 'C' && eCivil != 'V' && eCivil != 'D') {
            System.out.println("Estado Civil inválido!");
            System.out.println("ESTADO CIVIL: 'S', 'C', 'V', 'D'!");
            System.out.println("Informe o Estado Civil: ");
            eCivil = sc.next().charAt(0);
        }
    }
}