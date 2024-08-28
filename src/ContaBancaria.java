public class ContaBancaria {
    //Atributos
    String nome;
    String tipoConta;
    String bancoVinculado;//O ícone serviria para esta funcionalidade, mas não sei o tipo de dado de um ícone/imagem, tudo o que eu encontrei sobre foi isto: BufferedImage icone;
    double saldo;
    //Constructor
    public ContaBancaria(String nome, String tipoConta, String bancoVinculado, double saldo){
        this.nome=nome;
        this.tipoConta=tipoConta;
        this.bancoVinculado=bancoVinculado;
        this.saldo=saldo;
    }
    //Métodos
    public static String registrarNomeConta(){
        System.out.println("Qual é o nome da conta?");
        String nomeConta=Fintech.inputString();
        return nomeConta;
    }
    public static String registrarTipoConta(){
        int selecao;
        do{
            System.out.println("""
                    Qual é o tipo de conta bancária?
                    
                    1 - Conta poupança
                    2 - Conta corrente
                    3 - Conta Salário
                    4 - Conta de pagamentos
                    """);
            selecao=Fintech.inputInt();
            if(selecao>4||selecao<1) {
                Fintech.exibirMensagemOpcaoIncorreta();
            }
        }while(selecao>4||selecao<1);
        switch(selecao){
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
    public static String registrarBancoVinculado(){
        System.out.println("Qual é o banco vinculado a esta conta?");
        //Eu poderia criar um sistema parecido com o metodo anterior, mas ficaría muito extenso
        String bancoVinculado=Fintech.inputString();
        return bancoVinculado;
    }
    public static double registrarSaldoConta(){
        System.out.println("Qual é o saldo que você tem, no momento, na conta?");
        double saldoConta=Fintech.inputDouble();
        return saldoConta;
    }
}