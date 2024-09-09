//Importações
import modelos.ContaBancaria;
import modelos.Usuario;
import funcionalidades.Fintech;
import modelos.CartaoCredito;
public class Main {
    //Início do Programa
    public static void main(String[] args){
        //Declaração de Variáveis
        Usuario usuario=new Usuario();
        int usuariosCadastrados=0;
        boolean login=false;
        ContaBancaria contaBancaria=new ContaBancaria();
        int contasBancariasCadastradas=0;
        CartaoCredito cartaoCredito=new CartaoCredito();
        int cartoesCreditoCadastrados=0;
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
            Fintech.opcao= Fintech.inputInt();
            switch (Fintech.opcao) {
                case 0:
                    System.out.println("Encerrando o programa... Muito obrigado por utilizar o Fintech!");
                    break;
                case 1:
                    //Cadastro de Usuário
                    if(usuariosCadastrados==0) {
                        usuario = new Usuario(usuario.setNomeUsuario(), usuario.setEmail(), usuario.setSenha());
                        do{
                            System.out.println("Cadastrar Usuário?");
                            Fintech.exibirMensagemVoltaAoMenu();
                            Fintech.opcao = Fintech.inputInt();
                            switch(Fintech.opcao){
                                case 1:
                                    usuariosCadastrados++;
                                    System.out.println("Usuário cadastrado com sucesso!");
                                    break;
                                case 0:
                                    usuario = new Usuario();
                                    break;
                                default:
                                    Fintech.exibirMensagemOpcaoIncorreta();
                                    break;
                            }
                        }while(Fintech.opcao!=0&&Fintech.opcao!=1);
                    }else{
                        do{
                            Fintech.exibirMensagemExclusaoDeDados();
                            Fintech.exibirMensagemVoltaAoMenu();
                            Fintech.opcao=Fintech.inputInt();
                            switch(Fintech.opcao){
                                case 0:
                                    break;
                                case 1:
                                    usuario=new Usuario(usuario.setNomeUsuario(),usuario.setEmail(),usuario.setSenha());
                                    System.out.println("Usuário cadastrado com sucesso!");
                                    break;
                                default:
                                    Fintech.exibirMensagemOpcaoIncorreta();
                                    break;
                            }
                        }while(Fintech.opcao!=0&&Fintech.opcao!=1);
                    }
                    if(Fintech.opcao==1) {
                        do {
                            System.out.println("Deseja fazer o login?");
                            Fintech.exibirMensagemVoltaAoMenu();
                            Fintech.opcao = Fintech.inputInt();
                            switch (Fintech.opcao) {
                                case 1:
                                    login = true;
                                    break;
                                case 0:
                                    break;
                                default:
                                    Fintech.exibirMensagemOpcaoIncorreta();
                                    break;
                            }
                        }while(Fintech.opcao!=0&&Fintech.opcao!=1);
                    }
                    if(Fintech.opcao==0){
                        Fintech.opcao=1;
                        break;
                    }
                case 2:
                    do {
                        if (login) {
                            System.out.println("Login efetuado com sucesso!\n");
                            System.out.println("Ｆｉｎｔｅｃｈ, o seu gestor de finanças online!");
                            //Começando, de Fato, o Programa
                            do{
                                System.out.println("""
                                        
                                        Menu Principal
                                        
                                        Selecione uma das opções abaixo:
                                        
                                        1 - Painel de contas bancárias
                                        2 - Painel cartões de crédito
                                        3 - Registrar receita
                                        4 - Registrar despesa
                                        0 - Logout
                                        """);
                                Fintech.opcao= Fintech.inputInt();
                                switch(Fintech.opcao){
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
                                                    2 - Exibir dados da conta bancária
                                                    3 - Verificar saldo da conta bancária
                                                    0 - Retornar ao menu
                                                    """);
                                            Fintech.opcao= Fintech.inputInt();
                                            switch(Fintech.opcao){
                                                case 0:
                                                    break;
                                                case 1:
                                                    if(contasBancariasCadastradas==0) {
                                                        contaBancaria = new ContaBancaria(contaBancaria.setNome(), contaBancaria.setTipo(), contaBancaria.setBancoVinculado(), contaBancaria.setSaldo());
                                                        do{
                                                            System.out.println("Deseja registrar a conta bancária?");
                                                            Fintech.exibirMensagemVoltaAoMenu();
                                                            Fintech.opcao= Fintech.inputInt();
                                                            switch(Fintech.opcao){
                                                                case 0:
                                                                    contaBancaria = new ContaBancaria();
                                                                    break;
                                                                case 1:
                                                                    contasBancariasCadastradas++;
                                                                    System.out.println("Conta bancária registrada com sucesso!");
                                                                    break;
                                                                default:
                                                                    Fintech.exibirMensagemOpcaoIncorreta();
                                                                    break;
                                                            }
                                                        }while(Fintech.opcao!=0&&Fintech.opcao!=1);
                                                    }else{
                                                        do{
                                                            Fintech.exibirMensagemExclusaoDeDados();
                                                            Fintech.exibirMensagemVoltaAoMenu();
                                                            Fintech.opcao=Fintech.inputInt();
                                                            switch(Fintech.opcao){
                                                                case 0:
                                                                    break;
                                                                case 1:
                                                                    contaBancaria=new ContaBancaria(contaBancaria.setNome(),contaBancaria.setTipo(),contaBancaria.setBancoVinculado(),contaBancaria.setSaldo());
                                                                    System.out.println("Conta bancária registrada com sucesso!");
                                                                    break;
                                                                default:
                                                                    Fintech.exibirMensagemOpcaoIncorreta();
                                                                    break;
                                                            }
                                                        }while(Fintech.opcao!=0 && Fintech.opcao!=1);
                                                    }
                                                    Fintech.naoEncerrarPrograma();
                                                    break;
                                                case 2:
                                                    if(contasBancariasCadastradas==0){
                                                        contaBancaria.exibirMensagemNenhumaContaCadastrada();
                                                    }else{
                                                        System.out.println("Nome da Conta Bancária: "+contaBancaria.getNome());
                                                        System.out.println("Tipo de Conta Bancária: "+contaBancaria.getTipoConta());
                                                        System.out.println("Banco Vinculado: "+contaBancaria.getBancoVinculado());
                                                        System.out.println("Saldo: "+contaBancaria.getSaldo());
                                                    }
                                                    break;
                                                case 3:
                                                    if(contasBancariasCadastradas==0){
                                                        contaBancaria.exibirMensagemNenhumaContaCadastrada();
                                                    }else{
                                                        System.out.println("O saldo da conta "+contaBancaria.getNome()+" é de R$:"+contaBancaria.getSaldo());
                                                    }
                                                    break;
                                                default:
                                                    Fintech.exibirMensagemOpcaoIncorreta();
                                                    break;
                                            }
                                        }while(Fintech.opcao!=0);
                                        Fintech.naoEncerrarPrograma();
                                        break;
                                    case 2:
                                        do {
                                            System.out.println("""
                                                    Painel de Cartões de Crédito
                                                    
                                                    Qual funcionalidade deseja utilizar?
                                                    
                                                    1 - Registrar cartão de crédito
                                                    2 - Exibir dados do cartão de crédito
                                                    3 - Exibir fatura do cartão de crédto
                                                    0 - Retornar ao menu
                                                    """);
                                            Fintech.opcao=Fintech.inputInt();
                                            switch(Fintech.opcao) {
                                                case 0:
                                                    break;
                                                case 1:
                                                    if (cartoesCreditoCadastrados == 0) {
                                                        cartaoCredito=new CartaoCredito(cartaoCredito.setNome(),cartaoCredito.setLimite(),cartaoCredito.setFatura());
                                                        do{
                                                            System.out.println("Deseja registrar o cartão de crédito?");
                                                            Fintech.exibirMensagemVoltaAoMenu();
                                                            Fintech.opcao=Fintech.inputInt();
                                                            switch(Fintech.opcao){
                                                                case 0:
                                                                    cartaoCredito=new CartaoCredito();
                                                                    break;
                                                                case 1:
                                                                    cartoesCreditoCadastrados++;
                                                                    System.out.println("Cartão de crédito registrado com sucesso!");
                                                                    break;
                                                                default:
                                                                    Fintech.exibirMensagemOpcaoIncorreta();
                                                                    break;
                                                            }
                                                        }while(Fintech.opcao!=0&&Fintech.opcao!=1);
                                                    }else{
                                                        do{
                                                            Fintech.exibirMensagemExclusaoDeDados();
                                                            Fintech.exibirMensagemVoltaAoMenu();
                                                            Fintech.opcao=Fintech.inputInt();
                                                            switch(Fintech.opcao){
                                                                case 0:
                                                                    break;
                                                                case 1:
                                                                    cartaoCredito=new CartaoCredito(cartaoCredito.setNome(),cartaoCredito.setLimite(),cartaoCredito.setFatura());
                                                                    System.out.println("Cartão de crédito registrado com sucesso!");
                                                                    break;
                                                                default:
                                                                    Fintech.exibirMensagemOpcaoIncorreta();
                                                                    break;
                                                            }
                                                        }while(Fintech.opcao!=0&&Fintech.opcao!=1);
                                                    }
                                                    Fintech.naoEncerrarPrograma();
                                                    break;
                                                case 2:
                                                    if(cartoesCreditoCadastrados==0){
                                                        cartaoCredito.exibirMensagemNenhumCartaoCadastrado();
                                                    }else {
                                                        System.out.println("Nome do Cartão: " + cartaoCredito.getNome());
                                                        System.out.println("Limite do Cartão: " + cartaoCredito.getLimite());
                                                    }
                                                    break;
                                                case 3:
                                                    if(cartoesCreditoCadastrados==0){
                                                        cartaoCredito.exibirMensagemNenhumCartaoCadastrado();
                                                    }else{
                                                        System.out.println("A fatura do cartão de crédito: "+cartaoCredito.getNome()+"; é de R$:"+cartaoCredito.getFatura());
                                                    }
                                                    break;
                                                default:
                                                    Fintech.exibirMensagemOpcaoIncorreta();
                                                    break;
                                            }
                                        }while(Fintech.opcao!=0);
                                        Fintech.naoEncerrarPrograma();
                                        break;
                                    default:
                                        System.out.println("Opção selecionada inválida...");
                                        break;
                                }
                            }while(Fintech.opcao!=0);
                        }else{
                            //Verificação de Login
                            usuario.loginUsuario();
                            if(Fintech.opcao==0){
                                break;
                            }
                            usuario.loginEmail();
                            if(Fintech.opcao==0){
                                break;
                            }
                            usuario.loginSenha();
                            if(Fintech.opcao!=0){
                                login=true;
                            }
                        }
                    }while(Fintech.opcao!=0);
                    Fintech.naoEncerrarPrograma();
                    break;
                default:
                    System.out.println("Opção selecionada inválida...");
                    break;
            }
        }while(Fintech.opcao!=0);
        //Fim do Programa
    }
}