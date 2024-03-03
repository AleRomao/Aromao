package br.sp.senac.e169.calcularareaperimetro;

public class Biblioteca {
    private Livro [] listaLivro = new Livro[3];
    private int contador = 0;
    
    public void inserir(Livro livro) {
        if (contador >= listaLivro.length) {
            listaLivro = alocarNovoArray();
        }
    }
    
    private Livro[] alocarNovoArray() {
        Livro[] novoArray = new Livro[listaLivro.length + 3];
        for(int i = 0; i < listaLivro.length; i++) {
            novoArray[i] = listaLivro[i];
        }
        return novoArray;
    }
    
    public boolean verificarDisponibilidade(String titulo) {
        for(int i = 0; i < contador; i++) {
            if(listaLivro[i] != null && listaLivro[i].getTitulo().equals(titulo) ) {
                return listaLivro[i].isDidponivel();
            }
        }
        return false;
    }
    
    public void emprestarLivro(String titulo) {
        for(int i = 0; i < contador; i++) {
            if(listaLivro[i] != null && listaLivro[i].getTitulo().equals(titulo)) {
                if(listaLivro[i].isDidponivel()) {
                    listaLivro[i].emprestar();
                    System.out.println("Livro: " + titulo + " Emprestado");
                } else {
                    System.out.println("Livro: " + titulo + " Indisponivel");
                }
            }
        }
        System.out.println("Livro: " + titulo + "Livro não localizado");
    }
    
    public void devolverLivro(String titulo) {
        for(int i = 0; i < contador; i++) {
            if(listaLivro[i] != null && listaLivro[i].getTitulo().equals(titulo)) {
                if(!listaLivro[i].isDidponivel()) {
                    listaLivro[i].devolver();
                    System.out.println("Livro: " + titulo + " Devolvido");
                } else {
                    System.out.println("Livro: " + titulo + " Não pode ser devolvido");
                }
            }
        }
        System.out.println("Livro: " + titulo + " Não encontrado na biblioteca");
    }
    
    public void inserir(Livro livro) {
        if(contador <= listaLivro.length) {
            listaLivro = alocarNovoArray();
        }
        listaLivro[contador++] = livro;
    }
    
}