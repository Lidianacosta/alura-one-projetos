package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.Gerente;
import br.com.bytebank.banco.modelo.SistemaInterno;

public class TestaGerente {
    
    public static void main(String[] args){
        System.out.println("Hello, world!!");

        SistemaInterno si = new SistemaInterno();


        Gerente lidiana = new Gerente();
        lidiana.setNome("Lidiana Costa");
        lidiana.setCpf("222.222.222-22");
        lidiana.setSalario(5000);
        lidiana.setSenha(2222);
        
        System.out.println(lidiana.getNome());
        System.out.println(lidiana.getCpf());
        System.out.println(lidiana.getSalario());
        System.out.println(lidiana.autentica(2222));
        System.out.println(lidiana.getBonificacao());

        si.autentica(lidiana);
    }
}

