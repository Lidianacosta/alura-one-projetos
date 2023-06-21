package src.br.com.bytebank.banco.modelo;
public class ControleBonificacao {
    
    private double  soma = 0;

    
    /** 
     * @param f
     */
    public void registra(Funcionario f){
        this.soma += f.getBonificacao();
    }

    public double  getSoma() {
        return soma;
    }

}
