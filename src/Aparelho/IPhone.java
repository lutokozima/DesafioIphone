package Aparelho;


import Funcionalidade.AparelhoTelefonico;
import Funcionalidade.NavegadorInternet;
import Funcionalidade.ReprodutorMusical;

public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void ligar(String numero){
        System.out.println("Ligando para o numero: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo");

    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Correio de voz");
    }


    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina da url: " + url);
    }

    @Override
    public void abrirNovaAba(String url) {
        System.out.println("Abrindo nova aba da url: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Pagina");
    }

    @Override
    public void tocar() {
        System.out.println("Tocar musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar musica");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionanco musica: " + musica);
    }
}
