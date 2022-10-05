package Creational.Singleton;

import java.util.ArrayList;

public class SingletonStoreService {

    public volatile static SingletonStoreService uniqueInstance = null;
    public static double storeBalance;
    public static ArrayList<ShopItem> itemList;

    private SingletonStoreService() {
        storeBalance = 0.0;
        itemList = new ArrayList<ShopItem>();
    }

    public static SingletonStoreService getInstance() {
        if(uniqueInstance == null){
            synchronized (SingletonStoreService.class) {
                if(uniqueInstance == null) {
                    uniqueInstance = new SingletonStoreService();
                }
            }
        }
        return uniqueInstance;
    }

    public void deposit(double moneyAmount, Card creditCard) {
        if(creditCard.accountBalance > moneyAmount) {
            storeBalance += moneyAmount;
            creditCard.accountBalance -= moneyAmount;
            System.out.println("Deposited " + moneyAmount);
        }
        else System.out.println("Not enough money on your card to deposit, you need " + (moneyAmount - creditCard.accountBalance));
    }

    public void withdraw(double moneyAmount, Card creditCard) {
        if(moneyAmount <= storeBalance) {
            storeBalance -= moneyAmount;
            creditCard.accountBalance += moneyAmount;
            System.out.println("Withdrew " + moneyAmount);
        }
        else System.out.println("Not enough money on your account to withdraw, you need " + (moneyAmount - creditCard.accountBalance));
    }

    public void buy (ShopItem item, Card creditCard) {
        if (creditCard.accountBalance > item.cost) {
            creditCard.accountBalance -= item.cost;
            item.transfer();
            System.out.println("Bought item "+item.name + " for " + item.cost);
        }
        else System.out.println("You don't have enough money, you need " + (item.cost - creditCard.accountBalance));
    }

    public void addItem(ShopItem item) {
        itemList.add(item);
        System.out.println("Added item " + item.name);
    }

}
