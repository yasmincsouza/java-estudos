package util;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double dolarParaReal(double quantia, double precoDolar){
        return quantia * precoDolar * (1.0 + IOF);
    }
}
