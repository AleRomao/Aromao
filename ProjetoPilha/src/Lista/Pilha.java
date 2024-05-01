package Lista;

import Modelo.Pessoa;

public class Pilha {

    private Celula inicio, atual, aux;
    private int cont = 0;

    public boolean isListaVazia() {
        return inicio == null;
    }

    public void push(Object objeto) {
        if (isListaVazia()) {
            inicio = new Celula(null, null, objeto);
            aux = inicio;
        } else {
            atual = new Celula(aux, null, objeto);
            aux.setProx(atual);
            aux = atual;
        }
    }

    public void top() {
        Celula c = atual;
        if (c != null) {
            System.out.println(c.getDados());
        }
    }

    public void size() {
        Celula pesq = inicio;
        cont = 0;
        while (pesq != null) {
            cont++;
            pesq = pesq.getProx();
        }
        System.out.println("Tamanho: " + cont);
    }

    public boolean empty() {
        Celula b = inicio;
        if (b == null) {
            return true;
        }
        return false;
    }

    public void pop() {
        Celula p = atual;
            if (p == inicio) {
                this.inicio = p.getProx();
                p.setProx(null);
                this.inicio.setAnt(null);
            } else if (p == atual){
                this.atual = p.getAnt();
                this.atual.setProx(null);
            }

        }
    
}
