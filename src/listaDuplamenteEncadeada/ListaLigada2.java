package listaDuplamenteEncadeada;

public class ListaLigada2 {
    private Celula2 primeira;
    private Celula2 ultima;
    private int tamanho = 0;
    
    public ListaLigada2() {
    }
    public ListaLigada2(Celula2 primeira, Celula2 ultima) {
        this.primeira = primeira;
        this.ultima = ultima;
    }

    public Celula2 getPrimeira() {
        return primeira;
    }
    public void setPrimeira(Celula2 primeira) {
        this.primeira = primeira;
    }
    public Celula2 getUltima() {
        return ultima;
    }
    public void setUltima(Celula2 ultima) {
        this.ultima = ultima;
    }

    public void inserirNoFim(int valor){
        Celula2 novaCelula = new Celula2(valor);
        if (primeira == null) {
            primeira = novaCelula;
            ultima = novaCelula;
        }
        else {
             ultima.setProxima(novaCelula);
             novaCelula.setAnterior(ultima);
             ultima = novaCelula;

        }
        this.tamanho = tamanho + 1;
    }
    
    public void inserirNoComeco(int valor){
        Celula2 novaCelula = new Celula2(valor);
        if (primeira == null) {
            primeira = novaCelula;
            ultima = novaCelula;
        }
        else {
             novaCelula.setProxima(primeira);
             primeira.setAnterior(novaCelula);
             primeira = novaCelula;
        }
        this.tamanho = tamanho + 1;
    }
    
    public void inserirEmQualquerPosicao(int valor, int posicao) {
    Celula2 novaCelula = new Celula2(valor);

    if (posicao == 0) {
        novaCelula.setProxima(primeira);
        primeira.setAnterior(novaCelula);
        primeira = novaCelula;
    }

    else {
        Celula2 atual = primeira;

        for (int i = 0; i < posicao - 1; i++) {
            atual = atual.getProxima();
        }

        novaCelula.setProxima(atual.getProxima());
        novaCelula.setAnterior(atual);

        atual.getProxima().setAnterior(novaCelula);
        atual.setProxima(novaCelula);
    }

    this.tamanho = tamanho + 1;
    }

    public void removerNoComeco() {

    Celula2 aux = this.primeira;

    this.primeira = primeira.getProxima();

    if (primeira != null) {
        primeira.setAnterior(null);
    }

    aux.setProxima(null);
    aux.setAnterior(null);

    if (primeira == null) {
        ultima = null;
    }

    this.tamanho = tamanho - 1;
    }
    
    public void removerNoFim() {

    Celula2 aux = this.ultima;

    this.ultima = ultima.getAnterior();

    if (ultima != null) {
        ultima.setProxima(null);
    }

    aux.setAnterior(null);
    aux.setProxima(null);

    if (ultima == null) {
        primeira = null;
    }

    this.tamanho = tamanho - 1;
}
    
    public void removerPorPosicao(int posicao) {

    if (posicao < 0 || posicao >= tamanho) {
        throw new IndexOutOfBoundsException("Posição inválida");
    }

    if (posicao == 0) {
        removerNoComeco();
    }

    else if (posicao == tamanho - 1) {
        removerNoFim();
    }

    else {
        Celula2 removida = primeira;

        for (int i = 0; i < posicao; i++) {
            removida = removida.getProxima();
        }

        Celula2 anterior = removida.getAnterior();
        Celula2 proxima = removida.getProxima();

        anterior.setProxima(proxima);
        proxima.setAnterior(anterior);

        removida.setProxima(null);
        removida.setAnterior(null);

        this.tamanho--;
    }
    }

    public String toString(){
        if (this.tamanho == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        Celula2 aux = this.primeira;

        for(int i = 0; i < this.tamanho - 1; i++){
            sb.append(aux.getElemento());
            sb.append(", ");

            aux = aux.getProxima();
        }

        sb.append(aux.getElemento());
        sb.append("]");

        return sb.toString();
    }
}