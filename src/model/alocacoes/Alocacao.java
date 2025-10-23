package model.alocacoes;


public class Alocacao {
    private double latitude;
    private double longitude;
    private String nome;
    private String descricao;
    private int lotacao;
    private byte[] documentacao;
    private byte[] fachada;

    public Alocacao(double latitude, double longitude, String nome, String descricao, int lotacao, byte[] documentacao, byte[] fachada) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.nome = nome;
        this.descricao = descricao;
        this.lotacao = lotacao;
        this.documentacao = documentacao;
        this.fachada = fachada;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getLotacao() {
        return lotacao;
    }

    public byte[] getDocumentacao() {
        return documentacao;
    }

    public byte[] getFachada() {
        return fachada;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setLotacao(int lotacao) {
        this.lotacao = lotacao;
    }

    public void setDocumentacao(byte[] documentacao) {
        this.documentacao = documentacao;
    }

    public void setFachada(byte[] fachada) {
        this.fachada = fachada;
    }
    
    
}
