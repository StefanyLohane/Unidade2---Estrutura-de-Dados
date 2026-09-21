package fila;

import java.util.Stack;

public class Pilha {
    Stack<String> pilha = new Stack<>();

    public void inserir(String e){
        pilha.push(e);

    }
    
    public String remover(){
        if (verificar()) {
            System.out.println("A lista está vazia! ");
        }
        else{
            return pilha.pop();
        }

        return null;
    }

    public boolean verificar(){
        if (this.pilha.isEmpty()) {
            return true;
        }
        return false;
    }

    public void mostrar(){
        if (verificar()) {
            System.out.println("A lista tá vazia");
            
        }
        else{
            System.out.println("Fila: " + pilha);
        }
        
    }
    
}
