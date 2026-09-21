package revisao.impressora;

import java.util.LinkedList;
import java.util.Stack;

public class Fila {
    Stack<String> pilha = new Stack<>();
    LinkedList<String> fila = new LinkedList<>();
    int quantidade = 0;

    public void inserir(String e){
        fila.addLast(e);
        quantidade ++;

    }
    
    public String remover(){
        if (verificar()) {
            System.out.println("A lista está vazia! ");
        }
        else{
            return fila.removeFirst();
        }

        quantidade--;

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

    public void inverter(){
        for(int i = 0; i <= quantidade; i++){
            pilha.push(fila.element());
        }

        for(int j = 0; j <= quantidade; j++){
            fila.addLast(pilha. );

        }
                
    
    }

    }
