package Structural.Proxy;

public class Card {

    public double accountBalance;
    private final String cardNumber;
    private final int cvv2_code;
    private final int pinCode;

    Card(double accountBalance, String cardNumber, int cvv2_code, int pinCode) {
        this.accountBalance = accountBalance;
        this.cardNumber = cardNumber;
        this.cvv2_code = cvv2_code;
        this.pinCode = pinCode;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public int getCvv2_code() {
        return cvv2_code;
    }

    public int getPinCode() {
        return pinCode;
    }
}
