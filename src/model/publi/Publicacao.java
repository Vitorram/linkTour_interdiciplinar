package model.publi;

public class Publicacao{
    private int idUsuario;
    private String dataCriar;
    private String titulo;
    private String descricao;


    public Publicacao(int idUsuario, String dataCriar, String titulo, String descricao) {
        this.idUsuario = idUsuario;
        this.dataCriar = dataCriar;
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getDataCriar() {
        return dataCriar;
    }

    public void setDataCriar(String dataCriar) {
        this.dataCriar = dataCriar;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
