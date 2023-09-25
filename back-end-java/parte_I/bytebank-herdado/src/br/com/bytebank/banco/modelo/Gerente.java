package br.com.bytebank.banco.modelo;

public class Gerente extends Funcionario implements Autenticado {
    
    private AutenticacaoUtil Autentificador;

    public Gerente(){
        this.Autentificador = new AutenticacaoUtil();
    }

    
    /** 
     * @param senha
     */
    public void setSenha(int senha){
        this.Autentificador.setSenha(senha);
    }

    
    /** 
     * @param senha
     * @return boolean
     */
    public boolean autentica(int senha) {
        return this.Autentificador.autentica(senha);
    }

    
    /** 
     * @return double
     */
    public double getBonificacao(){
        System.out.println("Chamando o método de bonificacao do Gerente");
        return super.getSalario();
    }
}

