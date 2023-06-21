package src.br.com.bytebank.banco.modelo;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    public abstract double getBonificacao();

    
    /** 
     * @return double
     */
    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}