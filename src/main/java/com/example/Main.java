package com.example;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Biblioteca bibliotecaDaEsquina = new Biblioteca();
        
            ArrayList<Livro> livros = new ArrayList<Livro>();
            Livro L1 = new Livro("O Senhor dos Anéis","J.R.R. Tolkien",1954);
            Livro L2 = new Livro("Duna","Frank Herbert",1965);
            Livro L3 = new Livro("1984","George Orwell",1949);

            livros.add(L1);
            livros.add(L2);
            livros.add(L3);
            
            System.out.println(livros);
            
        
        bibliotecaDaEsquina.listarLivros();
    }
}
