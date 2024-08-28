public class Usuario{
    //Atributos
    String nomeUsuario;
    String email;
    String senha;
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
        String usuario=Fintech.inputString();
        return usuario;
    }
    public static String cadastrarEmail(){
        System.out.println("Por favor, digite seu e-mail:");
        String emailUsuario=Fintech.inputString();
        return emailUsuario;
    }
    public static String cadastrarSenha(){
        System.out.println("Por favor, digite sua senha:");
        String senhaUsuario=Fintech.inputString();
        return senhaUsuario;
    }
    public static String loginUsuario(){
        System.out.println("Por favor, digite seu usuário:");
        String loginUsuario=Fintech.inputString();
        return loginUsuario;
    }
    public static String loginEmail(){
        System.out.println("Por favor, digite seu e-mail:");
        String loginEmail=Fintech.inputString();
        return loginEmail;
    }
    public static String loginSenha(){
        System.out.println("Por favor, digite sua senha:");
        String loginSenha=Fintech.inputString();
        return loginSenha;
    }
}