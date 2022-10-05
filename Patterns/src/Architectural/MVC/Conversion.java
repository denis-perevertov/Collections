package Architectural.MVC;

public class Conversion {

    private int initialValue;
    private String initialCurrency;
    private String wantedCurrency;
    private double convertedValue;

    public Conversion(int initialValue, String initialCurrency, String wantedCurrency, double convertedValue) {
        this.initialValue = initialValue;
        this.initialCurrency = initialCurrency;
        this.wantedCurrency = wantedCurrency;
        this.convertedValue = convertedValue;
    }

    public int getInitialValue() {
        return initialValue;
    }

    public void setInitialValue(int initialValue) {
        this.initialValue = initialValue;
    }

    public String getInitialCurrency() {
        return initialCurrency;
    }

    public void setInitialCurrency(String initialCurrency) {
        this.initialCurrency = initialCurrency;
    }

    public String getWantedCurrency() {
        return wantedCurrency;
    }

    public void setWantedCurrency(String wantedCurrency) {
        this.wantedCurrency = wantedCurrency;
    }

    public double getConvertedValue() {
        return convertedValue;
    }

    public void setConvertedValue(int convertedValue) {
        this.convertedValue = convertedValue;
    }

    @Override
    public String toString() {
        return "Conversion{" +
                "initialValue=" + initialValue +
                ", initialCurrency='" + initialCurrency + '\'' +
                ", wantedCurrency='" + wantedCurrency + '\'' +
                ", convertedValue=" + convertedValue +
                '}';
    }
}
