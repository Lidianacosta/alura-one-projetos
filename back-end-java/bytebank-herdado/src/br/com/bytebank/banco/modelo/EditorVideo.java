package br.com.bytebank.banco.modelo;
public class EditorVideo extends Funcionario{
    
    
    /** 
     * @return double
     */
    public double getBonificacao(){
        System.out.println("Chamando o método de bonificacao do Editor de Vídeo");
        return 100.0;
    }
}
