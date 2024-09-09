package modelos;
public abstract class Transacao{
    private String nome;
    private double valor;
    private String data;
    private String categoria;
    private String hora;
    private String anotacao;
    private ContaBancaria contaBancariaVinculada;
    //Constructor
    protected Transacao(String nome,double valor,String data){
        this.nome=nome;
        this.valor=valor;
        this.data=data;
    }
    protected Transacao(){}
}