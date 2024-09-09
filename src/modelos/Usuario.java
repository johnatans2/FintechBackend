package modelos;
import funcionalidades.Fintech;
public class Usuario{
    //Atributos
    private String nomeUsuario;
    private String email;
    public String senha;
    //public static ContaBancaria contaBancaria;
    int contasCadastradas=0;
    //Constructors
    public Usuario(String nomeUsuario,String email,String senha){
        this.nomeUsuario=nomeUsuario;
        this.email=email;
        this.senha=senha;
    }
    public Usuario(){}
    //Setters
    public String setNomeUsuario(){
        System.out.println("Por favor, digite seu usuário:");
        return Fintech.inputString().toLowerCase();
    }
    public String setEmail(){
        System.out.println("Por favor, digite seu e-mail:");
        return Fintech.inputString().toLowerCase();
    }
    public String setSenha(){
        System.out.println("Por favor, digite sua senha:");
        return Fintech.inputString();
    }
    public void loginUsuario(){
        String loginUsuario;
        do {
            System.out.println("Por favor, digite seu usuário:");
            loginUsuario=Fintech.inputString();
            if(!loginUsuario.equals(this.nomeUsuario)){
                System.out.println("Usuário não cadastrado");
            }else{
                break;
            }
            Fintech.tentarNovamente();
        }while(!loginUsuario.equals(this.nomeUsuario)&&Fintech.opcao!=0);
    }
    //Métodos Comuns
    public void loginEmail(){
        String loginEmail;
        do{
            System.out.println("Por favor, digite seu e-mail:");
            loginEmail=Fintech.inputString();
            if(!loginEmail.equals(this.email)){
                System.out.println("E-mail não cadastrado");
            }else{
                break;
            }
            Fintech.tentarNovamente();
        }while(!loginEmail.equals(this.email)&&Fintech.opcao!=0);
    }
    public void loginSenha(){
        String loginSenha;
        do{
            System.out.println("Por favor, digite sua senha:");
            loginSenha=Fintech.inputString();
            if(!loginSenha.equals(this.senha)){
                System.out.println("Senha incorreta");
            }else{
                break;
            }
            Fintech.tentarNovamente();
        }while(!loginSenha.equals(this.senha)&&Fintech.opcao!=0);
    }
}