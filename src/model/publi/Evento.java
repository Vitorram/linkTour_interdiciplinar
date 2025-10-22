package model.publi;

public class Evento extends Publicacao {
    private int idAlocacao;
    private int capacidade;
    private String dataInicio;
    private String dataFim;

    public Evento(int idUsuario, String dataCriar, String titulo, String descricao,
                  int idAlocacao, int capacidade, String dataInicio, String dataFim) {
        super(idUsuario, dataCriar, titulo, descricao);
        this.idAlocacao = idAlocacao;
        this.capacidade = capacidade;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public int getIdAlocacao() {
        return idAlocacao;
    }

    public void setIdAlocacao(int idAlocacao) {
        this.idAlocacao = idAlocacao;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }
}
