package br.com.bytebank.banco.modelo;
public class Designer extends Funcionario{
    
    
    /** 
     * @return double
     */
    public double getBonificacao(){
        System.out.println("Chamando o método de bonificacao do Desainer");
        return  200;
    }
}
