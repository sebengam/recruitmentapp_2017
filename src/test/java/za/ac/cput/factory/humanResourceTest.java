package za.ac.cput.factory;

import org.testng.annotations.BeforeMethod;
import za.ac.cput.domain.client.Client;
import za.ac.cput.domain.humanResource.HumanResource;
import za.ac.cput.factory.client.ClientFactory;
import za.ac.cput.factory.humanResource.HumanResourceFactory;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class humanResourceTest {
    Map<String, String> values;

    @BeforeMethod
    public void setUp() throws Exception {
        values = new HashMap<String, String>();
        values.put("id", "1");
        values.put("name", "123");
        values.put("surname", "123");
        values.put("email", "123@gmail.com");
    }

    @org.testng.annotations.Test
    public void getHumanResource() throws Exception {
        HumanResource humanResource = HumanResourceFactory.getHumanResource(values);
        assertEquals("123", humanResource.getSurname());

    }
}
