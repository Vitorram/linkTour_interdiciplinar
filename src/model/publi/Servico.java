package model.publi;

public class Servico extends Publicacao {
    private String categoria;
    private double custo;
    private String disponibilidade;
    private int vendasMaxima;
    private String duracao;

    public Servico(int idUsuario, String dataCriar, String titulo, String descricao,
                   String categoria, double custo, String disponibilidade,
                   int vendasMaxima, String duracao) {
        super(idUsuario, dataCriar, titulo, descricao);
        this.categoria = categoria;
        this.custo = custo;
        this.disponibilidade = disponibilidade;
        this.vendasMaxima = vendasMaxima;
        this.duracao = duracao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public int getVendasMaxima() {
        return vendasMaxima;
    }

    public void setVendasMaxima(int vendasMaxima) {
        this.vendasMaxima = vendasMaxima;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

}
