public class Main{
    public static void main(String args[]){

        Empresario empresario = new Empresario("Peter Mensch",123456789);

        Musica musica1 = new Musica("Thunderstruck",4.52);
        Musica musica2 = new Musica("Back in Black", 4.15 );
        Musica musica3 = new Musica("T.N.T", 3.34);
        Membro membro1 = new Membro("Angus Young", "Guitarra Solo");
        Membro membro2 = new Membro("Stevie Young","Guitarra rítmica");
        Membro membro3 = new Membro("Cliff Williams","Baixista");
        Membro membro4 = new Membro("Brian Johnson","Vocalista");
        Membro membro5 = new Membro("Phil Rudd","Baterista");

        Banda banda = new Banda("AC/DC","Rock");
        banda.setEmpresario(empresario);

        banda.addMusica(musica1);
        banda.addMusica(musica2);
        banda.addMusica(musica3);

        banda.addMembro(membro1);
        banda.addMembro(membro2);
        banda.addMembro(membro3);
        banda.addMembro(membro4);
        banda.addMembro(membro5);

        banda.mostraInfo();

    }
}