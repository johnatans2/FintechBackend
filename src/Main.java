public class Main{
    //Início do Programa
    static int opcao;
    public static void main(String[] args){
        //Declaração de Variáveis
        Usuario usuario;
        boolean login=false;
        String loginUsuario;
        String loginEmail;
        String loginSenha;
        int contasBancarias=0;
        String nomeContaBancaria;
        String tipoContaBancaria;
        String bancoVinculado;
        double saldoConta;
        ContaBancaria contaBancaria;
        //Apresentação
        System.out.println("""
                
                Ｆｉｎｔｅｃｈ
                
                Olá, seja bem vindo ao Fintech, o seu gestor de finanças online!
                """);
        do{
            System.out.println("""
                    
                    Por favor, selecione uma das opções abaixo:
                    
                    1 - Cadastrar-se
                    2 - Login
                    0 - Encerrar programa
                    """);
            opcao=Fintech.inputInt();
            switch (opcao) {
                case 0:
                    System.out.println("Encerrando o programa... Muito obrigado por utilizar o Fintech!");
                    break;
                case 1:
                    //Cadastro de Usuário
                    usuario=new Usuario(Usuario.cadastrarNomeUsuario(),Usuario.cadastrarEmail(),Usuario.cadastrarSenha());
                    do{
                        System.out.println("Cadastrar Usuário?");
                        Fintech.exibirMensagemVoltaAoMenu();
                        opcao=Fintech.inputInt();
                        switch (opcao){
                            case 1:
                                System.out.println("Usuário cadastrado com sucesso!");
                                do{
                                    System.out.println("Deseja fazer o login?");
                                    Fintech.exibirMensagemVoltaAoMenu();
                                    opcao=Fintech.inputInt();
                                    switch(opcao){
                                        case 1:
                                            opcao=2;
                                            login=true;
                                            break;
                                        case 0:
                                            break;
                                        default:
                                            Fintech.exibirMensagemOpcaoIncorreta();
                                            break;
                                    }
                                }while(opcao!=2&&opcao!=0);
                                break;
                            case 0:
                                usuario=new Usuario();
                                break;
                            default:
                                Fintech.exibirMensagemOpcaoIncorreta();
                                break;
                        }
                        if(opcao==0){
                            opcao=1;
                            break;
                        }else if(opcao==2){
                            break;
                        }
                    }while(opcao!=0);
                    if(opcao!=2){
                        break;
                    }
                case 2:
                    do {
                        if (login) {
                            System.out.println("Login efetuado com sucesso!\n");
                            System.out.println("Ｆｉｎｔｅｃｈ, o seu gestor de finanças online!");
                            //Começando de Fato o Programa
                            do{
                                System.out.println("""
                                        
                                        Menu Principal
                                        
                                        Selecione uma das opções abaixo:
                                        
                                        1 - Painel de contas bancárias
                                        2 - Registrar cartão de crédito
                                        3 - Registrar receita
                                        4 - Registrar despesa
                                        0 - Logout
                                        """);
                                opcao=Fintech.inputInt();
                                switch(opcao){
                                    case 0:
                                        login=false;
                                        System.out.println("Fazendo logout...");
                                        break;
                                    case 1:
                                        do {
                                            System.out.println("""
                                                    Painel de contas bancárias
                                                    
                                                    Qual funcionalidade deseja utilizar?
                                                    
                                                    1 - Registrar conta bancária
                                                    2 - Exibir contas bancárias cadastradas
                                                    3 - Verificar saldo de conta bancária
                                                    0 - Retornar ao menu
                                                    """);
                                            opcao=Fintech.inputInt();
                                            switch(opcao){
                                                case 1:
                                                    nomeContaBancaria = ContaBancaria.registrarNomeConta();
                                                    tipoContaBancaria=ContaBancaria.registrarTipoConta();
                                                    bancoVinculado=ContaBancaria.registrarBancoVinculado();
                                                    saldoConta=ContaBancaria.registrarSaldoConta();
                                                    do{
                                                        System.out.println("Deseja registrar a conta?");
                                                        Fintech.exibirMensagemVoltaAoMenu();
                                                        opcao=Fintech.inputInt();
                                                        switch(opcao){
                                                            case 1:
                                                                contaBancaria=new ContaBancaria(nomeContaBancaria,tipoContaBancaria,bancoVinculado,saldoConta);
                                                                System.out.println("Conta bancária registrada com sucesso!");
                                                                contasBancarias++;
                                                                break;
                                                            default:
                                                                Fintech.exibirMensagemOpcaoIncorreta();
                                                                break;
                                                        }
                                                    }while(opcao!=0&&opcao!=1);
                                                    if(opcao==0){
                                                        opcao=1;
                                                    }
                                                    break;
                                            }
                                        }while(opcao!=0);
                                    default:
                                        System.out.println("Opção selecionada inválida...");
                                        break;
                                }
                            }while(opcao!=0);
                        }else{
                            //Verificação de Login
                            Usuario.loginUsuario();
                            if(opcao==0){
                                break;
                            }
                            Usuario.loginEmail();
                            if(opcao==0){
                                break;
                            }
                            Usuario.loginSenha();
                            if(opcao!=0){
                                login=true;
                            }
                        }
                    }while(opcao!=0);
                    Fintech.naoEncerrarPrograma();
                    break;
                default:
                    System.out.println("Opção selecionada inválida...");
                    break;
            }
        }while(opcao!=0);
        //Fim do Programa
    }
}