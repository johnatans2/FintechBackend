package modelos;
//Importando...
import funcionalidades.Fintech;
public class CartaoCredito {
    private String nome;
    private double limite;
    private double fatura;
    //Contructor
    public CartaoCredito(String nome,double limite,double fatura){
        this.nome=nome;
        this.limite=limite;
        this.fatura=fatura;
    }
    public CartaoCredito(){}
    //Setters
    public String setNome(){
        System.out.println("Qual será o nome do cartão de crédito?");
        return Fintech.inputString();
    }
    public double setLimite(){
        System.out.println("Qual é o limite do cartão de crédito?");
        return Fintech.inputDouble();
    }
    public double setFatura(){
        do{
            System.out.println("""
                    Você já possui faturas vinculadas a este cartão?
                    
                    1 - Sim
                    0 - Não
                    """);
            Fintech.opcao=Fintech.inputInt();
            switch(Fintech.opcao){
                case 0:
                    break;
                case 1:
                    break;
                default:
                    Fintech.exibirMensagemOpcaoIncorreta();
                    break;
            }
        }while(Fintech.opcao!=0&&Fintech.opcao!=1);
        switch(Fintech.opcao){
            case 0:
                return 0;
            default:
                System.out.println("Por favor, digite o valor atual da fatura:");
                return Fintech.inputDouble();
        }
    }
    //Getters
    public String getNome(){
        return this.nome;
    }
    public double getLimite(){
        return this.limite;
    }
    public double getFatura(){
        return this.fatura;
    }
    public void exibirMensagemNenhumCartaoCadastrado(){
        System.out.println("Você ainda não possui nenhum cartão de crédito registrado. Para utilizar esta funcionalidade, por favor, registre um.");
    }
}
