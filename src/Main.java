public class Main{
    //Início do Programa
    public static void main(String[] args){
        //Declaração de Variáveis
        int opcao;
        Usuario usuario=new Usuario();
        String nomeUsuario;
        String email;
        String senha;
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
                    nomeUsuario=Usuario.cadastrarNomeUsuario();
                    email=Usuario.cadastrarEmail();
                    senha=Usuario.cadastrarSenha();
                    do{
                        System.out.println("Cadastrar Usuário?");
                        Fintech.exibirMensagemVoltaAoMenu();
                        opcao=Fintech.inputInt();
                        switch (opcao){
                            case 1:
                                usuario=new Usuario(nomeUsuario,email,senha);
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
                            do {
                                //Verificação de Login
                                do {
                                    loginUsuario=Usuario.loginUsuario();
                                    if(!loginUsuario.equals(usuario.nomeUsuario)){
                                        System.out.println("Usuário não cadastrado");
                                    }else{
                                        break;
                                    }
                                    opcao=Fintech.tentarNovamente();
                                }while(!loginUsuario.equals(usuario.nomeUsuario)&&opcao!=0);
                                if(opcao==0){
                                    break;
                                }
                                do{
                                    loginEmail=Usuario.loginEmail();
                                    if(!loginEmail.equals(usuario.email)){
                                        System.out.println("E-mail não cadastrado");
                                    }else{
                                        break;
                                    }
                                    opcao=Fintech.tentarNovamente();
                                }while(!loginEmail.equals(usuario.email)&&opcao!=0);
                                if(opcao==0){
                                    break;
                                }
                                do{
                                    loginSenha=Usuario.loginSenha();
                                    if(!loginSenha.equals(usuario.senha)){
                                        System.out.println("Senha incorreta");
                                    }else{
                                        break;
                                    }
                                    opcao=Fintech.tentarNovamente();
                                }while(!loginSenha.equals(usuario.senha)&&opcao!=0);
                                if(opcao!=0){
                                    login=true;
                                    break;
                                }
                            }while(opcao!=0);
                        }
                        if(opcao==0){
                            opcao=1;
                            break;
                        }
                    }while(opcao!=0);
                    break;
                default:
                    System.out.println("Opção selecionada inválida...");
                    break;
            }
        }while(opcao!=0);
        //Fim do Programa
    }
}