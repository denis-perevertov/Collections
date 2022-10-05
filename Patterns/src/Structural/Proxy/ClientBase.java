package Structural.Proxy;

import java.util.ArrayList;
import java.util.List;

public class ClientBase {

    List<Client> listOfClients = new ArrayList<>();


    ClientBase() {
        listOfClients.add(new Client("Igor"));
        listOfClients.add(new Client("dsljsdflf"));
        listOfClients.add(new Client("Denis"));
        listOfClients.add(new Client("Anton"));
        listOfClients.add(new Client("Client5"));
        listOfClients.add(new Client("Client6"));
    }

    public void addClient(Client... clients) {
        for(Client client : clients) {
            listOfClients.add(client);
        }
    }

    public List<Client> getListOfClients (){
        return listOfClients;
    }
}
