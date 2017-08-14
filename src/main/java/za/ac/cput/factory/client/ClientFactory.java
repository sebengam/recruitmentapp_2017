package za.ac.cput.factory.client;


import za.ac.cput.domain.client.Client;

import java.util.Map;

public class ClientFactory
{ public static Client getClient(Map<String, String> values)
    {
        Client client = new Client.Builder()
                .companyName(values.get("companyName"))
                .regNumber(values.get("regNumber"))
                .email(values.get("email"))
                .id(values.get("id"))
                .build();
        return client;

    }
}
