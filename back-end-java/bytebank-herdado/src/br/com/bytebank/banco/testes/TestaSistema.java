package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.Administrador;
import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Gerente;
import br.com.bytebank.banco.modelo.SistemaInterno;

public class TestaSistema {
    public static void main(String[] args){

        SistemaInterno si = new SistemaInterno();

        Gerente g = new Gerente();
        g.setSenha(2222);
       
        Administrador a = new Administrador();
        a.setSenha(2222);
        
        Cliente c = new Cliente();
        c.setSenha(2222);

        si.autentica(g);
        si.autentica(a);
        //si.autentica(c);

    }
}

