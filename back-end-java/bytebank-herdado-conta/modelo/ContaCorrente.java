package src.br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(int numero, int agencia) {
        super(numero, agencia);

    }

    @Override // faz sobrescrita e faz o compilador saber e nos ajuda caso erra como ta a implementação na class super (mãe);
    public void saca(double valor) throws SaldoInsuficienteException {
            super.saca(valor + 0.20);
    }

    @Override
    public boolean deposita(double valor) {
        super.saldo += valor;
        return true;
    }

    @Override
    public double getValorImposto() {
        return super.getSaldo() * 0.1;
    }

}
