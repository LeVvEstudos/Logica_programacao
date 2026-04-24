import java.util.Scanner;

public class Calculadora {
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);

            System.out.println("Escolha um número:");
            int num1 = leitor.nextInt();
            System.out.println("Escolha outro número:");
            int num2 = leitor.nextInt();
            System.out.println("Agora escolha o tipo expressão pra calcular:");
            System.out.println("*1 Soma;\n*2 Subtração\n*3 Multiplicação\n*4 Divisão");
            int opcao = leitor.nextInt();

            double resultado;

            switch (opcao) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println(resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println(resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println(resultado);
                    break;
                case 4:
                    resultado = num1 / num2;
                    System.out.println(resultado);
                    break;
                default:
                    System.out.println("Opção inválida;");
            }
            
        }
}