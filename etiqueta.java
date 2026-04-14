import java.util.Scanner;

public class etiqueta {
    public static void main(String[] args) 
    {
        // 2° questão:
        //Dados que vou usar:
        // String nome = "Carlos Levi";
        // int dataNascimento = 2007;
        // String naturalidade = "Cearense";
        // String nacionalidade = "Brasilerio";
        // String matricula = "21615-6";
        // //+ é uma concatenação
        // System.out.println("Nome: "+nome+"\nNaturalidade: "+naturalidade+"\nNacionalidade: "+nacionalidade+"\nMatricula: "+matricula );

        // 3° questão:
        Scanner scanner = new Scanner(System.in);// Chamo o objeto Scanner que vai servir para ler o teclado

        System.out.println("Qual seu nome: ");
        String nome = scanner.nextLine();// puxo os os metódos do Scanner
        System.out.println("Qual ano que você nasceu?");
        int dataNascimento = scanner.nextInt();

        System.out.println("Nome: "+nome+"\nAno de nascimento:"+dataNascimento);

    }
}
