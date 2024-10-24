package school.sptech;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private String autor;
    private LocalDate dataPublicacao;
    private List<Avaliacao> avaliacoes = new ArrayList<>();

    public Livro() {
    }

    public Livro(String titulo, String autor, LocalDate dataPublicacao, List<Avaliacao> avalicoes) {
        this.titulo = titulo;
        this.autor = autor;
        this.dataPublicacao = dataPublicacao;
        this.avaliacoes = new ArrayList<>();
    }

    public void adicionarAvaliacao(String descricao, Double qtdEstrelas){

        if (descricao == null || descricao.isBlank()){
            System.out.println("Aasd");
        } else if (qtdEstrelas == null){
            System.out.println("adsd");
        } else if (qtdEstrelas >= 0 && qtdEstrelas <= 5){
            Avaliacao a = new Avaliacao(descricao, qtdEstrelas);
            avaliacoes.add(a);
        }
    }

    public Double calcularMediaAvaliacoes(){
        Double media = 0.0;

        if (avaliacoes.isEmpty()) {return media;}

        for (int cont = 0; cont < avaliacoes.size(); cont++){
            media += avaliacoes.get(cont).getQtdEstrelas();
        }
        media = media / avaliacoes.size();

        return media;
    }

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

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    @Override
    public String toString() {
        return """
                Título: %s
                Autor: %s
                Data de Publicação: %s
                """.formatted(titulo, autor, dataPublicacao);
    }
}
