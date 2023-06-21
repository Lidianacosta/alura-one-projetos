import src.br.com.bytebank.banco.modelo.Cliente;

public class Conta {
    private Cliente titular;
    private int agencia;
    private int numero;
    private double saldo;
    private static int totalDeContas = 0;

    public Conta(){
        Conta.totalDeContas++;
    }

    public static int getTotalDeContas(){
        return Conta.totalDeContas;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular( Cliente titular) {
        this.titular = titular;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia( int agencia){
        this.agencia = agencia;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero( int numero){
        this.numero = numero;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public boolean saca( double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean deposita( double valor){
        if(valor > 0){
           this.saldo += valor; 
           return true ;
        }      
        return false;
    }

    public boolean transfere( double valor, Conta destino){
        if(this.saldo >= valor){
            this.saca(valor);
            destino.deposita(valor);
            return true;
        }
        return false;
    }
}


