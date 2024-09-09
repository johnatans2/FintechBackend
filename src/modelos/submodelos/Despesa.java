package modelos.submodelos;

import modelos.Transacao;
import modelos.CartaoCredito;
public class Despesa extends Transacao{
    private CartaoCredito cartaoCreditoVinculado;
    //Constructors
    public Despesa(String nome,double valor,String data){
        super(nome,valor,data);
    }
    public Despesa(){
        super();
    }
}