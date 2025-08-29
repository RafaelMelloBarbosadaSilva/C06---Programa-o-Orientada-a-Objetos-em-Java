public class Banda{
    String nome;
    String genero;
    Empresario empresario;
    Musica[] musicas = new Musica[5];
    Membro[] membros = new Membro[5];

    public Banda(String nome, String genero){
        this.nome = nome;
        this.genero = genero;
    }
    void addMusica(Musica novaMusica){
        for(int i = 0; i < musicas.length; i++){
            if(musicas[i] == null){
                musicas[i] = novaMusica;
                break;
            }
        }
    }
    void addMembro(Membro novoMembro){
        for(int i = 0; i < membros.length; i++){
            if(membros[i] == null){
                membros[i] = novoMembro;
                break;
            }
        }
    }
    void mostraInfo(){
        System.out.println(this.nome + " membros:");
        for (Membro membro : membros) {
            if(membro != null)
                System.out.println(membro.getNome());
        }
        System.out.println("Musicas da banda: " + this.nome);
        for (Musica musica : musicas) {
            if(musica != null)
                System.out.println(musica.getNome());
        }
    }
    public void setEmpresario(Empresario empresario) {
        this.empresario = empresario;
    }
}