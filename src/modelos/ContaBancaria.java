package modelos;
//Importando...
import funcionalidades.Fintech;
//Classe
public class ContaBancaria {
    //Atributos
    private String nome;
    private String tipoConta;
    private String bancoVinculado;//O ícone serviria para esta funcionalidade, mas não sei o tipo de dado de um ícone/imagem, tudo o que eu encontrei sobre foi isto: BufferedImage icone;
    private double saldo;
    //Constructor
    public ContaBancaria(String nome, String tipoConta, String bancoVinculado, double saldo){
        this.nome=nome;
        this.tipoConta=tipoConta;
        this.bancoVinculado=bancoVinculado;
        this.saldo=saldo;
    }
    public ContaBancaria(){}
    //Métodos
    //Setters
    public String setNome(){
        System.out.println("Qual é o nome da conta?");
        return Fintech.inputString();
    }
    public String setTipo(){
        do{
            System.out.println("""
                    Qual é o tipo de conta bancária?
                    
                    1 - Conta poupança
                    2 - Conta corrente
                    3 - Conta Salário
                    4 - Conta de pagamentos
                    """);
            Fintech.opcao=Fintech.inputInt();
            if(Fintech.opcao>4|| Fintech.opcao<1) {
                Fintech.exibirMensagemOpcaoIncorreta();
            }
        }while(Fintech.opcao>4|| Fintech.opcao<1);
        switch(Fintech.opcao){
            case 1:
                return "Conta Poupança";
            case 2:
                return "Conta Corrente";
            case 3:
                return "Conta Salário";
            default:
                return "Conta de Pagamentos";
        }

    }
    public String setBancoVinculado(){
        do {
            System.out.println("""
                    Qual é o banco vinculado a esta conta?
                    
                    1 - Itaú
                    2 - Santander
                    3 - Bradesco
                    4 - Caixa
                    5 - Banco do Brasil
                    6 - C6 Bank
                    7 - PicPay
                    8 - Nubank
                    9 - Mercado Pago
                    10 - Inter
                    """);
            Fintech.opcao=Fintech.inputInt();
            if(Fintech.opcao>10||Fintech.opcao<1){
                Fintech.exibirMensagemOpcaoIncorreta();
            }
        }while(Fintech.opcao>10||Fintech.opcao<1);
        switch(Fintech.opcao){
            case 1:
                return "Itaú";
            case 2:
                return "Santander";
            case 3:
                return "Bradesco";
            case 4:
                return "Caixa";
            case 5:
                return "Banco do Brasil";
            case 6:
                return "C6 Bank";
            case 7:
                return "PicPay";
            case 8:
                return "Nubank";
            case 9:
                return "Mercado Pago";
            default:
                return "Inter";
        }
    }
    public double setSaldo(){
        System.out.println("Qual é o saldo que você tem, no momento, na conta?");
        return Fintech.inputDouble();
    }
    //Getters
    public String getNome(){
        return this.nome;
    }
    public String getTipoConta(){
        return this.tipoConta;
    }
    public String getBancoVinculado(){
        return this.bancoVinculado;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void exibirMensagemNenhumaContaCadastrada(){
        System.out.println("Você ainda não possui nenhuma conta bancária registrada. Para utilizar esta funcionalidade, por favor, registre uma.");
    }
}