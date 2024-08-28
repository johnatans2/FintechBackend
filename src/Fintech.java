//Importando Bibliotecas
import java.util.Scanner;
public class Fintech{
    //Métodos
    public static String inputString(){
        Scanner input=new Scanner(System.in);
        String entrada=input.nextLine();
        return entrada;
    }
    public static int inputInt(){
        Scanner input=new Scanner(System.in);
        int entrada=input.nextInt();
        return entrada;
    }
    public static double inputDouble(){
        Scanner input=new Scanner(System.in);
        double entrada=input.nextDouble();
        return entrada;
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
    public static int tentarNovamente(){
        int selecao;
        do {
            System.out.println("Deseja tentar novamente?");
            Fintech.exibirMensagemVoltaAoMenu();
            selecao = Fintech.inputInt();
            if(selecao!=1&&selecao!=0){
                Fintech.exibirMensagemOpcaoIncorreta();
            }
        }while(selecao!=1&&selecao!=0);
        return selecao;
    }
}