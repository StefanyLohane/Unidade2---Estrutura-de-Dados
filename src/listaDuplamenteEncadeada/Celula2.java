package listaDuplamenteEncadeada;

public class Celula2 {

    private Celula2 proxima;
    private Celula2 anterior;
    private int elemento;

    public Celula2() {
    }

    public Celula2(Celula2 proxima, Celula2 anterior, int elemento) {
        this.proxima = proxima;
        this.anterior = anterior;
        this.elemento = elemento;
    }

    public Celula2(int elemento) {
        this.elemento = elemento;
    }

    public Celula2 getProxima() {
        return proxima;
    }

    public void setProxima(Celula2 proxima) {
        this.proxima = proxima;
    }

    public Celula2 getAnterior() {
        return anterior;
    }

    public void setAnterior(Celula2 anterior) {
        this.anterior = anterior;
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }
}