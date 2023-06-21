package src.br.com.bytebank.banco.modelo;

/** Class para calcular impostos
 * @author Lidiana costa
 * @version 0.1
 */

public class CalculadorDeImposto {

    private double totalImposto;

    /**
     * Registrar o valor do imposto.
     * 
     * @param t
     */
    public void registra(Tributavel t) {
        this.totalImposto += t.getValorImposto();
    }

    public double getTotalImposto() {
        return totalImposto;
    }
}
