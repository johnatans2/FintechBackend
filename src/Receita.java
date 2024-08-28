public class Receita{
    //Atributos
    String nome;
    double valor;
    String data;
    String categoria;
    String hora;
    String anotacao;
    ContaBancaria contaBancariaVinculada;
    //Constructor
    public Receita(String nome,double valor,String data){
        this.nome=nome;
        this.valor=valor;
        this.data=data;
    }
}