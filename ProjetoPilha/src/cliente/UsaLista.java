package cliente;
import Lista.Pilha;
import Modelo.Pessoa;
public class UsaLista {

    public static void main(String[] args) {
       /* Pilha lista = new Pilha();
        lista.inserir(new Pessoa("Alexandre", 50));
        lista.inserir(new Pessoa("Renam", 22));
        lista.inserir(new Pessoa("Pina", 22));
        lista.inserir(new Pessoa("Patrick", 22));
        //Exibir dados
        lista.exibir();
        //Removendo
//        System.out.println("--------Após a remoção-----------");
//        if (lista.remover(1)) {
//            lista.exibir();
//        }else{
//            System.out.println("Não achou");
//        }
//        System.out.println("--------------------");
//        System.out.println(lista.pesquisar(3));
          lista.atualizar(1, 40);
          lista.exibir();
        */
       
       Pilha p = new Pilha();
       p.push(8);
       p.push(10);
       p.push(15);
       p.size();
       p.top();
       p.pop();
       p.size();
       p.top();
       p.pop();
       p.size();
       p.top();
       p.pop();
      // p.empty();
    }
    
}
