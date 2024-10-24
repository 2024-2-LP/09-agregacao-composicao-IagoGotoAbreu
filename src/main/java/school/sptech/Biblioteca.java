package school.sptech;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Biblioteca {
    private String nome;
    private List<Livro> livros = new ArrayList<>();

    public Biblioteca() {
    }

    public Biblioteca(String nome, List<Livro> livros) {
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){
        if (livro == null){

        } else if (livro.getTitulo() == null || livro.getTitulo().isBlank()){
            System.out.println("fsdf");
        } else if (livro.getAutor() == null || livro.getAutor().isBlank()) {
            System.out.println("fsdf");
        } else if (livro.getDataPublicacao() == null) {
            System.out.println("fsdf");
        } else {
            livros.add(livro);
        }
    }
    public void removerLivroPorTitulo(String titulo){
        for (int cont = 0; cont < livros.size(); cont++ ){
            if (livros.get(cont).getTitulo().equalsIgnoreCase(titulo)){
                livros.remove(cont);
                break;
            }
        }
    }
    public Livro buscarLivroPorTitulo(String titulo){
        if (titulo == null || titulo.isBlank()){
            return null;
        } else {
            for (int cont = 0; cont < livros.size(); cont++ ){
                if (livros.get(cont).getTitulo().equalsIgnoreCase(titulo)){
                    return livros.get(cont);
                }
            }
        }
        return null;
    }
    public Integer contarLivros(){
        return livros.size();
    }
    public List<Livro> obterLivrosAteAno(Integer ano){

        List<Livro> lista = new ArrayList<>();

        for (Livro livro : livros) {
            if (livro.getDataPublicacao().getYear() <= ano){
                lista.add(livro);
            }
        }
        return lista;
    }

    public List<Livro> retornarTopCincoLivros(){
        return livros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
