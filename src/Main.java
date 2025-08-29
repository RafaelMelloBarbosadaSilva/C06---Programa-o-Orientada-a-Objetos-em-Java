public class Main
{
    public static void main(String[] args) {
        Cantina CantinadoInatel = new Cantina();
        Salgado salgado1 = new Salgado();
        Salgado salgado2 = new Salgado();
        Salgado salgado3 = new Salgado();

        salgado1.nome = "enroladinho";
        salgado2.nome = "esfirra";
        salgado3.nome = "Hamburguer";


        CantinadoInatel.addSalgado(salgado1);
        CantinadoInatel.addSalgado(salgado2);
        CantinadoInatel.addSalgado(salgado3);

        CantinadoInatel.mostrainfo();
    }
}
