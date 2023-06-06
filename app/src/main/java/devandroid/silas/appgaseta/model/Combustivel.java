package devandroid.silas.appgaseta.model;

public class Combustivel {
    private String nomeCombustivel;
    private double valCombustivel;
    private String recomendacoes;

    public Combustivel(String nomeCombustivel, double valCombustivel, String recomendacoes) {
        this.nomeCombustivel = nomeCombustivel;
        this.valCombustivel = valCombustivel;
        this.recomendacoes = recomendacoes;
    }

    public String getNomeCombustivel() {
        return nomeCombustivel;
    }

    public void setNomeCombustivel(String nomeCombustivel) {
        this.nomeCombustivel = nomeCombustivel;
    }

    public double getValCombustivel() {
        return valCombustivel;
    }

    public void setValCombustivel(double valCombustivel) {
        this.valCombustivel = valCombustivel;
    }

    public String getRecomendacoes() {
        return recomendacoes;
    }

    public void setRecomendacoes(String recomendacoes) {
        this.recomendacoes = recomendacoes;
    }
}
