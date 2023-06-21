package src.br.com.bytebank.banco.testes;
import src.br.com.bytebank.banco.modelo.ContaCorrente;
import src.br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteSaca {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(123, 321);

        conta.deposita(200.0);
    
        try {
            conta.saca(200.0);
        } catch (SaldoInsuficienteException e) {
            System.out.println("ex: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println(conta.getSaldo());
    }
}
