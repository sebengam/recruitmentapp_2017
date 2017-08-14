package za.ac.cput.factory;

import org.testng.annotations.BeforeMethod;
import za.ac.cput.domain.Administrator.Administrator;
import za.ac.cput.domain.client.Client;
import za.ac.cput.factory.administrator.AdministratorFactory;
import za.ac.cput.factory.client.ClientFactory;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class ClientTest {
    Map<String,String> values;

    @BeforeMethod
    public void setUp() throws Exception {
        values = new HashMap<String, String>();
        values.put("id","1");
        values.put("companyName","123");
        values.put("regNumber","123");
        values.put("email","123@gmail.com");
    }

    @org.testng.annotations.Test
    public void getPerson() throws Exception {
         Client client = ClientFactory.getClient(values);
        assertEquals("123",client.getRegNumber());
    }
}
