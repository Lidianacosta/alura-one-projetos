package src.br.com.bytebank.banco.testes;

import src.br.com.bytebank.banco.modelo.ControleBonificacao;
import src.br.com.bytebank.banco.modelo.Designer;
import src.br.com.bytebank.banco.modelo.EditorVideo;
import src.br.com.bytebank.banco.modelo.Gerente;

public class TestaReferencia {
    public static void main(String[] args){
        Gerente gerente = new Gerente();
        gerente.setSalario(1000);

        EditorVideo editorVideo = new EditorVideo();
        editorVideo.setSalario(1000);

        Designer designer = new Designer();
        designer.setSalario(1000);

        ControleBonificacao controle = new ControleBonificacao();

        controle.registra(gerente);
        controle.registra(editorVideo);
        controle.registra(designer);

        System.out.println(controle.getSoma()); 

    }
}


