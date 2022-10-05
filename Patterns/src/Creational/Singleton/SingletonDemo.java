package Creational.Singleton;

public class SingletonDemo {

    public static void main(String[] args) {

        SingletonStoreService store = SingletonStoreService.getInstance();

        ShopItem sword = new ShopItem("Sword", 50.0);
        ShopItem knife = new ShopItem("Knife", 25.0);
        ShopItem gun = new ShopItem("Gun", 100.0);

        Card myCard = new Card(10000.0, "1234 5689 1234 5868", 842, 1234);

        store.addItem(sword);
        store.addItem(knife);
        store.addItem(gun);

        store.buy(sword, myCard);

        store.deposit(100.0, myCard);
        store.withdraw(100000.0, myCard);



    }

}
