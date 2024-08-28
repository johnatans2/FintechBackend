public class Despesa{
    //Atributos
    String nome;
    double valor;
    String data;
    String categoria;
    String hora;
    //BufferedImage icone;
    String anotacao;
    ContaBancaria contaBancariaVinculada;
    //Constructor
    public Despesa(String nome,double valor,String data,String categoria){
        this.nome=nome;
        this.valor=valor;
        this.data=data;
        this.categoria=categoria;
    }
}