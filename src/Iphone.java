public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página");
    }

    @Override
    public void adicionarNovaAba() {
       System.out.println("Adicionando Nova Aba");
    }

    @Override
    public void atualizarPagina() {
       System.out.println("Atualizando Página");
    }

    @Override
    public void ligar() {
       System.out.println("Ligando");
    }

    @Override
    public void atender() {
        System.out.println("Atender telefone");
    }

    @Override
    public void iniciarCorreioDeVoz() {
       System.out.println("iniciando Correio de Voz");
    }

    @Override
    public void selecionarMusica() {
      System.out.println("Selecionando Música");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Música");
    }

    @Override
    public void parar() {
        System.out.println("Parando a Música");
    }
}
