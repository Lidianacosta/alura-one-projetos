package src.br.com.bytebank.banco.modelo;

public class Cliente implements Autenticado {

    private AutenticacaoUtil autentificador;

    public Cliente() {
        this.autentificador = new AutenticacaoUtil();
    }

    
    /** 
     * @param senha
     */
    @Override
    public void setSenha(int senha) {
        this.autentificador.setSenha(senha);
    }

    
    /** 
     * @param senha
     * @return boolean
     */
    @Override
    public boolean autentica(int senha) {
        return this.autentificador.autentica(senha);
    }

}