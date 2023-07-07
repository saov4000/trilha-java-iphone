public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();

        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioDeVoz();

        iphone.selecionarMusica();
        iphone.tocar();
        iphone.parar();

        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
