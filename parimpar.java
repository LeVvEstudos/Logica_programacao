import java.util.Scanner;

public class parimpar{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número escolhido:");
        int valor = leitor.nextInt();

        int resto = valor%2;

        if (resto == 0){
            System.out.println("O valor é par");
        }
        else if(resto == 1){
            System.out.println("O valor é impar");
        }
    }

}