//Empacotando...
package modelos.submodelos;
//Importando...
import modelos.Transacao;
public class Receita extends Transacao{
    public Receita(String nome, double valor, String data) {
        super(nome, valor, data);
    }
    public Receita(){
        super();
    }
}