package co.com.bancolombia.model.client.gateways;

import co.com.bancolombia.model.client.Client;

import java.util.List;

public interface ClientRepository {

    Client getClient(String id);
    List<Client> listClients();
    Client setClient(Client client);
}
