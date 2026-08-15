package listaSimplesmenteEncadeada;

public class Celula1 {
    private Celula1 proxima;
    private int elemento;
    
    public Celula1() {
    }

    public Celula1(Celula1 proxima, int elemento) {
        this.proxima = proxima;
        this.elemento = elemento;
    }

    public Celula1(int elemento){
        this.elemento = elemento;
    }

    public Celula1 getProxima() {
        return proxima;
    }

    public void setProxima(Celula1 proxima) {
        this.proxima = proxima;
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }
    
}
