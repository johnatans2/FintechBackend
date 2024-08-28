public class Usuario{
    //Atributos
    static String nomeUsuario;
    static String email;
    static String senha;
    ContaBancaria contaBancaria;
    int contasCadastradas=0;
    //Constructors
    public Usuario(String nomeUsuario,String email,String senha){
        this.nomeUsuario=nomeUsuario;
        this.email=email;
        this.senha=senha;
    }
    public Usuario(){}
    //Métodos
    public static String cadastrarNomeUsuario(){
        System.out.println("Por favor, digite seu usuário:");
        nomeUsuario=Fintech.inputString().toLowerCase();
        return nomeUsuario;
    }
    public static String cadastrarEmail(){
        System.out.println("Por favor, digite seu e-mail:");
        email=Fintech.inputString().toLowerCase();
        return email;
    }
    public static String cadastrarSenha(){
        System.out.println("Por favor, digite sua senha:");
        senha=Fintech.inputString();
        return senha;
    }
    public static void loginUsuario(){
        String loginUsuario;
        do {
            System.out.println("Por favor, digite seu usuário:");
            loginUsuario=Fintech.inputString();
            if(!loginUsuario.equals(nomeUsuario)){
                System.out.println("Usuário não cadastrado");
            }else{
                break;
            }
            Fintech.tentarNovamente();
        }while(!loginUsuario.equals(nomeUsuario)&&Main.opcao!=0);
    }
    public static void loginEmail(){
        String loginEmail;
        do{
            System.out.println("Por favor, digite seu e-mail:");
            loginEmail=Fintech.inputString();
            if(!loginEmail.equals(email)){
                System.out.println("E-mail não cadastrado");
            }else{
                break;
            }
            Fintech.tentarNovamente();
        }while(!loginEmail.equals(email)&&Main.opcao!=0);
    }
    public static void loginSenha(){
        String loginSenha;
        do{
            System.out.println("Por favor, digite sua senha:");
            loginSenha=Fintech.inputString();
            if(!loginSenha.equals(senha)){
                System.out.println("Senha incorreta");
            }else{
                break;
            }
            Fintech.tentarNovamente();
        }while(!loginSenha.equals(senha)&&Main.opcao!=0);
    }
}