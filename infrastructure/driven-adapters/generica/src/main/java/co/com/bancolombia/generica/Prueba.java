package co.com.bancolombia.generica;

import co.com.bancolombia.model.client.Client;

import java.util.List;

public class Prueba {
    public static void main(String[] args) {
        List<Client> clients = ListClients.getClients();

        clients.stream().map(client -> {
            client.setId("id: "+ client.getId());
            return client;
        }).forEach(System.out::println);

    }

}
