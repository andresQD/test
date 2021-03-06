package co.com.bancolombia.generica;

import co.com.bancolombia.model.client.Client;
import co.com.bancolombia.model.client.gateways.ClientRepository;

import java.util.List;

public class ClientSatic implements ClientRepository {

    private List<Client> clients;

    public ClientSatic(){
        clients = ListClients.getClients();
    }


    @Override
    public Client getClient(String id) {
        return null;
    }

    @Override
    public List<Client> listClients() {
        return clients;
    }

    @Override
    public Client setClient(Client client) {
        clients.add(client);
        return client;
    }
}
