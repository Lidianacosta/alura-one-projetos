package src.br.com.bytebank.banco.testes;
import src.br.com.bytebank.banco.modelo.CalculadorDeImposto;
import src.br.com.bytebank.banco.modelo.ContaCorrente;
import src.br.com.bytebank.banco.modelo.SeguroDeVida;

public class TesteTributaveis {
    public static void main(String[] args){
        ContaCorrente cc = new ContaCorrente(222, 222);
        cc.deposita(1000);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorDeImposto calc = new CalculadorDeImposto();

        calc.registra(cc);
        calc.registra(seguro);

        System.out.println(calc.getTotalImposto());

    }
}
