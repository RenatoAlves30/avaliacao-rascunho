package entities;
import java.util.Date;


public abstract class Aluno {
    private String nome;
    private Integer idade;
    private Date dataDaAvaliacao;
    private String observacao;
    private String pressaoArterial;

    private Double peso;
    private Double altura;
    private Double cintura;
    private Double quadril;
    private Double braco;
    private Double coxa;


    public Aluno(String nome, Integer idade, Date dataDaAvaliacao,
                 String observacao, String pressaoArterial,
                 Double peso, Double altura, Double cintura,
                 Double quadril, Double braco, Double coxa) {

        this.nome = nome;
        this.idade = idade;
        this.dataDaAvaliacao = dataDaAvaliacao;
        this.observacao = observacao;
        this.pressaoArterial = pressaoArterial;
        this.peso = peso;
        this.altura = altura;
        this.cintura = cintura;
        this.quadril = quadril;
        this.braco = braco;
        this.coxa = coxa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Date getDataDaAvaliacao() {
        return dataDaAvaliacao;
    }

    public void setDataDaAvaliacao(Date dataDaAvaliacao) {
        this.dataDaAvaliacao = dataDaAvaliacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getPressaoArterial() {
        return pressaoArterial;
    }

    public void setPressaoArterial(String pressaoArterial) {
        this.pressaoArterial = pressaoArterial;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getCintura() {
        return cintura;
    }

    public void setCintura(Double cintura) {
        this.cintura = cintura;
    }

    public Double getQuadril() {
        return quadril;
    }

    public void setQuadril(Double quadril) {
        this.quadril = quadril;
    }

    public Double getBraco() {
        return braco;
    }

    public void setBraco(Double braco) {
        this.braco = braco;
    }

    public Double getCoxa() {
        return coxa;
    }

    public void setCoxa(Double coxa) {
        this.coxa = coxa;
    }

    public abstract String pollock3();

}
