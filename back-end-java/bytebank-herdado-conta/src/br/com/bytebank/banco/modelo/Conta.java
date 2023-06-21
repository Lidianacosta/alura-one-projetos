package src.br.com.bytebank.banco.modelo;

public abstract class Conta {
    private Cliente titular;
    private int agencia;
    private int numero;
    protected double saldo;
    private static int totalDeContas = 0;

    public Conta(int numero, int agencia) {
        Conta.totalDeContas++;
        //System.out.println("O total de contas é " + Conta.totalDeContas);
        this.agencia = agencia;
        this.numero = numero;
        //this.saldo = 100;
        //System.out.println("Estou criando uma conta " + this.numero);
    }

    public static int getTotalDeContas() {
        return Conta.totalDeContas;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void saca(double valor) throws SaldoInsuficienteException {

        if (this.saldo < valor)
           throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        this.saldo -= valor;

    }

    public abstract boolean deposita(double valor);

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
        this.saca(valor);
        destino.deposita(valor);
    }
}
