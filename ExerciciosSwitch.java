import java.util.Scanner;

class ExerciciosSwitch{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Escolha uma das opções: ");
        System.out.println("*1 Financeiro");
        System.out.println("*2 Suporte");
        System.out.println("*3 Comercial");
        System.out.println("*4 Cancelamento");
        System.out.println("*5 Sair do Menu");
        int opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Financeiro selecionado");
                break;
                case 2:
                System.out.println("Suporte selecionado");
                break;
                case 3:
                System.out.println("Comercial selecionado");
                break;
                case 4:
                System.out.println("Cancelamento");
                break;
                case 5:
                System.out.println("Saindo do menu");
                break;
            default:
                System.out.println("Não há essa opção;");
        }
    }
}