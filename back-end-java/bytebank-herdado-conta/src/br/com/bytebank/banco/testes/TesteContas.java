package src.br.com.bytebank.banco.testes;
import src.br.com.bytebank.banco.modelo.ContaCorrente;
import src.br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteContas {
    public static void main(String[] args) {
        System.out.println("Hello, world!!");

        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100);

        ContaPoupanca cp = new ContaPoupanca(222,2222);
        cp.deposita(200);

        //cc.transfere(1120, cp);

        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());

    }
}

