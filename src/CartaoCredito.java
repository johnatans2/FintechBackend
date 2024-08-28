public class CartaoCredito {
    String nome;
    //BufferedImage icone;
    double limite;
    ContaBancaria contaVinculada;
    Despesa despesa;
    double fatura=0;
    //Contructor
    public CartaoCredito(String nome,double limite){
        this.nome=nome;
        this.limite=limite;
    }
}
