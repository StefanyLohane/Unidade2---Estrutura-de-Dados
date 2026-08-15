package listaSimplesmenteEncadeada;

import java.util.Scanner;

public class ListaLigada1 {
    private Celula1 primeira;
    private Celula1 ultima;
    private int tamanho = 0;
    
    public ListaLigada1() {
    }
    public ListaLigada1(Celula1 primeira, Celula1 ultima) {
        this.primeira = primeira;
        this.ultima = ultima;
    }

    public Celula1 getPrimeira() {
        return primeira;
    }
    public void setPrimeira(Celula1 primeira) {
        this.primeira = primeira;
    }
    public Celula1 getUltima() {
        return ultima;
    }
    public void setUltima(Celula1 ultima) {
        this.ultima = ultima;
    }

    public void inserirNoFim(int valor){
        Celula1 novaCelula = new Celula1(valor);
        if (primeira == null) {
            primeira = novaCelula;
            ultima = novaCelula;
        }
        else {
             ultima.setProxima(novaCelula);
             ultima = novaCelula;

        }

        this.tamanho = tamanho + 1;
        
    }
    
    public void inserirNoComeco(int valor){
        Celula1 novaCelula = new Celula1(valor);
        if (primeira == null) {
            primeira = novaCelula;
            ultima = novaCelula;
        }
        else {
            novaCelula.setProxima(primeira);
            primeira = novaCelula;
        }

        this.tamanho = tamanho + 1;
    }
    
    public void inserirEmQualquerPosicao() {
        Scanner scan = new Scanner(System.in);
        
        int valor;
        int posicao;
        
        System.out.println("Digite o número que quer colocar: ");
        valor = scan.nextInt();
        
        System.out.println("Digite a posição que quer colocar: ");
        posicao = scan.nextInt();

        Celula1 novaCelula = new Celula1(valor);
        
        if (posicao == 0) {
            novaCelula.setProxima(primeira);
            primeira = novaCelula;
            
            if (ultima == null) {
                ultima = novaCelula;
            }
            
            return;
        }
        
        Celula1 atual = primeira;
        
        for (int i = 0; i < posicao - 1; i++) {
            atual = atual.getProxima();
        }
        
        novaCelula.setProxima(atual.getProxima());
        atual.setProxima(novaCelula);
        
        if (novaCelula.getProxima() == null) {
            ultima = novaCelula;
        }

        this.tamanho = tamanho + 1;
    }
    
    public void imprimirLista() {
        
        Celula1 atual = primeira;

        while (atual != null) {
            
            System.out.print(atual.getElemento() + " -> ");
            atual = atual.getProxima();
        }
    }

     public void removerNoComeco(){
        this.primeira = primeira.getProxima();
        
        this.tamanho = tamanho - 1;
    }
    
    public void removerNoFim(){
        Celula1 aux = this.primeira;

        for(int i = 0; i < this.tamanho-2; i++){
            aux = aux.getProxima();
        }
        
        aux.setProxima(null);
        this.primeira = aux;

        this.tamanho--; //this usa para dizer q as variaveis são da classe e não do método
    }
    
    public void removerPorPosicao(int posicao){
        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
        
        if (posicao == 0) {
            removerNoComeco();
        }
        
        else if (posicao == tamanho - 1) {
            removerNoFim(); 
        }
        
        else{
            Celula1 aux = this.primeira;
            for(int i = 0; i < posicao - 1; i++){
                aux = aux.getProxima();
            }
            Celula1 removida = aux.getProxima();
            ultima.setProxima(ultima.getProxima().getProxima());

            removida.setProxima(null);
        }

        this.tamanho = tamanho - 1;
    }

    public String toString(){
        if (this.tamanho == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        Celula1 aux = this.primeira;

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