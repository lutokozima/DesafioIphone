package Teste;

import Aparelho.IPhone;


public class Teste {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();
        iphone.ligar("12345");
        iphone.atender();
        iphone.iniciarCorreioDeVoz();
        iphone.exibirPagina("www.dio.me");
        iphone.abrirNovaAba("www.dio.me");
        iphone.atualizarPagina();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Ciranda Cirandinha");
    }

}
