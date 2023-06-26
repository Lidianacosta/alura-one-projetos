package br.com.bytebank.banco.modelo;

public class SistemaInterno {
    
   private int senha = 2222;

    
    /** 
     * @param a
     */
    public void autentica(Autenticado  a){
        if(a.autentica(this.senha)){
            System.out.println("pode entraentrar no sistema!");
        }else {
            System.out.println("Não pode entrar no sistema!");
        }
    }

}
