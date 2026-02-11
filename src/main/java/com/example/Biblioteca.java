package  com.example;

import java.util.ArrayList;

public class Biblioteca {
    private static final int MAX_LIVROS = 100; // Variável de classe
    private ArrayList<Livro> livros;// Variável de instância

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public boolean adicionarLivro(Livro livro) {
        for(Livro ltemp : livros)
        {
            if(ltemp.getTitulo() == livro.getTitulo())
            {
                return false;
            }
        }
        livros.add(livro);
        return true;
    }

    public boolean removerLivro(String titulo) {
        for(Livro ltemp : livros)
        {
            if(ltemp.getTitulo() == titulo)
            {
                livros.remove(ltemp);
                return true;
            }
        }
        return false;
    }

    public void listarLivros() {
        System.out.println("Livros disponíveis:");
        for (Livro livro : livros) 
        {
            System.out.println(
            " - " + livro.getTitulo() +  " / " + livro.getAutor() +" / " + livro.getAno()
            );
        }
    }
}
