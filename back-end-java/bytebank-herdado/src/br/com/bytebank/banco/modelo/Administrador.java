package src.br.com.bytebank.banco.modelo;

public class Administrador extends Funcionario implements Autenticado {

    private AutenticacaoUtil autentificador;

    public Administrador(){
        this.autentificador = new AutenticacaoUtil();
    }

    
    /** 
     * @return double
     */
    @Override
    public double getBonificacao() {
        System.out.println("Chamando o método de bonificacao do Administrador");
        return super.getSalario();
    }

    
    /** 
     * @param senha
     */
    @Override
    public void setSenha(int senha) {
        this.autentificador.setSenha(senha);
    }

    @Override 
    public boolean autentica(int senha) {
        return this.autentificador.autentica(senha);
    };

}

