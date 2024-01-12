package exe4.Util;

public class CurrencyConverter {
    private static final double IOF = 6;

    public static double converterParaReais(double quantidade, double cotacao){
        double totalSemIOF = quantidade * cotacao;
        double totalComIOF = totalSemIOF * (1 + IOF / 100);
        return totalComIOF;
    }
}
