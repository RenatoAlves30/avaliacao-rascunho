package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Mulher extends Aluno{
    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    private Double dobraTriciptal;
    private Double dobraSupraIliaca;
    private Double dobraCoxa;

    public Mulher(String nome, Integer idade, Date dataDaAvaliacao, String observacao, String pressaoArterial, Double peso, Double altura, Double cintura, Double quadril, Double braco, Double coxa, Double dobraTriciptal, Double dobraSupraIliaca, Double dobraCoxa) {
        super(nome, idade, dataDaAvaliacao, observacao, pressaoArterial, peso, altura, cintura, quadril, braco, coxa);
        this.dobraTriciptal = dobraTriciptal;
        this.dobraSupraIliaca = dobraSupraIliaca;
        this.dobraCoxa = dobraCoxa;
    }

    public Double getDobraTriciptal() {
        return dobraTriciptal;
    }

    public void setDobraTriciptal(Double dobraTriciptal) {
        this.dobraTriciptal = dobraTriciptal;
    }

    public Double getDobraSupraIliaca() {
        return dobraSupraIliaca;
    }

    public void setDobraSupraIliaca(Double dobraSupraIliaca) {
        this.dobraSupraIliaca = dobraSupraIliaca;
    }

    public Double getDobraCoxa() {
        return dobraCoxa;
    }

    public void setDobraCoxa(Double dobraCoxa) {
        this.dobraCoxa = dobraCoxa;
    }

    @Override
    public String pollock3() {
        double totalDrobras = 0.0;
        double densidadeCorporal = 0.0;

        totalDrobras = dobraTriciptal + dobraSupraIliaca + dobraCoxa;
        densidadeCorporal = 1.099421 - 0.0009929 * (totalDrobras) + 0.0000023 * (totalDrobras * totalDrobras) - 0.0001392 * (getIdade());

        double percentualDeGordura = 0.0;

        percentualDeGordura = (((4.95 / densidadeCorporal) - 4.50) * 100);

        double massaGorda = (super.getPeso() * percentualDeGordura) / 100;

        double massaMagra = (super.getPeso() - massaGorda);

        double massaCorporalIdeal = massaMagra / 0.75;

        double massaCorporalEmExcesso = super.getPeso() - massaMagra;

        return "Percentual de Gordura: "+String.format("%.2f",percentualDeGordura) + "\n"
                + "Massa Gorda: " + String.format("%.2f", massaGorda)+ "\n"
                + "Massa Magra: " + String.format("%.2f", massaMagra) + "\n"
                + "Massa Corporal Ideal: " + String.format("%.2f",massaCorporalIdeal) + "\n"
                + "Massa Corporal em Excesso: " + String.format("%.2f", massaCorporalEmExcesso);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: " + super.getNome() + "\n");
        sb.append("Idade: " + super.getIdade() + "\n");
        sb.append("Data da Avaliação: " + sdf.format(super.getDataDaAvaliacao()) + "\n");
        sb.append("Observação sobre o aluno: " + super.getObservacao() + "\n");
        sb.append("Pressão Arterial: " + getPressaoArterial() + "\n");
        sb.append("Peso: " + String.format("%.1f ",getPeso()) + "\n");
        sb.append("Altura: " + String.format("%.1f ",getAltura()) + "\n");
        sb.append("Cintura: " + String.format("%.1f ",getCintura()) + "\n");
        sb.append("Quadril: " + String.format("%.1f ",getQuadril()) + "\n");
        sb.append("Braço: " + String.format("%.1f ",getBraco()) + "\n");
        sb.append("Coxa: " + String.format("%.1f ",getCoxa()) + "\n");


        return sb.toString();
    }
}
