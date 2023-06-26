package br.com.bytebank.banco.modelo;

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

    
    /** 
     * @param salario
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    /** 
     * @return String
     */
    public String getCpf() {
        return this.cpf;
    }

    
    /** 
     * @param cpf
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    /** 
     * @return String
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
}