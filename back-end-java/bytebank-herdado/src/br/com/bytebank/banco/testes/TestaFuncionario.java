package src.br.com.bytebank.banco.testes;

import src.br.com.bytebank.banco.modelo.Funcionario;
import src.br.com.bytebank.banco.modelo.Gerente;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario lidiana = new Gerente();
        lidiana.setNome("Lidiana Costa");
        lidiana.setCpf("222.222.222.22 ");
        lidiana.setSalario(2600.00);

        System.out.println(lidiana.getNome());
        System.out.println(lidiana.getBonificacao()); 
    }
}

