package fila;

import java.util.LinkedList;

public class EstruturaFila {
    LinkedList<String> fila = new LinkedList<>();

    public void inserir(String e){
        fila.addLast(e);

    }
    
    public String remover(){
        if (verificar()) {
            System.out.println("Alista está vazia! ");
        }
        else{
            return fila.removeFirst();
        }

        return null;
    }

    public boolean verificar(){
        if (this.fila.isEmpty()) {
            return true;
        }
        return false;
    }

    public void mostrar(){
        if (verificar()) {
            System.out.println("A lista tá vazia");
            
        }
        else{
            System.out.println("Fila: " + fila);
        }
        
    }
}
