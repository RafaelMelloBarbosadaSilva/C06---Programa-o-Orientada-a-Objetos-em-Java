public class Cantina {
    String nome;
    Salgado[] salgados = new Salgado[3];

    public void addSalgado(Salgado novosalgado){
        for(int j=0;j< salgados.length;j++){
            if (salgados[j] == null){
                salgados[j] = novosalgado;
                break;
            }
        }
    }
    public void mostrainfo(){
        for (int i = 0; i< salgados.length;i++){
            System.out.println(salgados[i].nome);
        }
    }
}
