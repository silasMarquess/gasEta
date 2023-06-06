package devandroid.silas.appgaseta.apoio;

public class UltilGasEta {
    public static String messagem(double gasolina, double alcool) {
        String messagemRetorno;
        //preco gasolina: 5.12
        //preco etanol: 3,99

        //preco ideal = gasolina * 0,70;
        double precoIdeal = gasolina * 0.70;

        if (alcool <= precoIdeal) {
            messagemRetorno = "Melhor Abastecer com Etanol";
        } else {
            messagemRetorno = "Melhor Bastecer com Gasolina";
        }
        return messagemRetorno;

    }
}
