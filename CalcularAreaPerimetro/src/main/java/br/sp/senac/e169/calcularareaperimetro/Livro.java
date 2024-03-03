package br.sp.senac.e169.calcularareaperimetro;

public class Livro {
    //Atributos
    private String titulo;
    private String autor;
    private int numPagina;
    private boolean disponivel;
    //Construtor
    public Livro(String titulo, String autor, int numPagina) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPagina = numPagina;
        this.disponivel = true;
    }
    //Métodos Getter/Setter
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    } 
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public int getNumPagina() {
        return numPagina;
    }
    
    public void setNumPagina(int numPagina) {
        this.numPagina = numPagina;
    }
    
    public boolean isDidponivel() {
        return disponivel;
    }
    
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    public void emprestar() {
        this.disponivel = false;
    }
    
    public void devolver() {
        this.disponivel = true;
    }
}
