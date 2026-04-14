import java.util.Scanner;

public class ifelse {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual a senha:");
        int senha = leitor.nextInt();

        if(senha == 1234){
        System.out.println("A senha está correta!");
        }
        else {
            System.out.println("A senha está incorreta!");
        }
    }
    
}