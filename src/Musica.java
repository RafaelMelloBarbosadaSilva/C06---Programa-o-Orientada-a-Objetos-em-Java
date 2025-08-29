public class Musica {
    String nome;
    Double duracao;

    public Musica(String nome, Double duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }
    //Getter e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getDuracao() {
        return duracao;
    }
    public void setDuracao(Double duracao) {
        this.duracao = duracao;
    }
}
