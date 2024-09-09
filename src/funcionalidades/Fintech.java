package funcionalidades;
//Importando Bibliotecas
import java.util.Scanner;
public class Fintech{
    public static int opcao;
    //Métodos
    public static String inputString(){
        Scanner input=new Scanner(System.in);
        return input.nextLine();
    }
    public static int inputInt(){
        Scanner input=new Scanner(System.in);
        return input.nextInt();
    }
    public static double inputDouble(){
        Scanner input=new Scanner(System.in);
        return input.nextDouble();
    }
    public static void exibirMensagemVoltaAoMenu(){
        System.out.println("""
            1 - Sim
            0 - Voltar ao menu
            """);
    }
    public static void exibirMensagemOpcaoIncorreta(){
        System.out.println("Opção selecionada inválida, por favor, digite novamente:");
    }
    public static void tentarNovamente(){
        do {
            System.out.println("Deseja tentar novamente?");
            Fintech.exibirMensagemVoltaAoMenu();
            opcao = Fintech.inputInt();
            if(opcao!=1&&opcao!=0){
                Fintech.exibirMensagemOpcaoIncorreta();
            }
        }while(opcao!=1&&opcao!=0);
    }
    public static void naoEncerrarPrograma(){
        if(opcao==0){
            opcao=1;
        }
    }
    public static void exibirMensagemExclusaoDeDados(){
        System.out.println("Você já possui dados do tipo registrados, caso queira prosseguir com esta funcionalidade, os dados anteriores serão sobreescritos");
        System.out.println("Deseja sobreescrever os dados registrados?");
    }
}