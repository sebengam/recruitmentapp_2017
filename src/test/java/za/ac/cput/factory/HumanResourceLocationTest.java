package za.ac.cput.factory;

import org.testng.annotations.BeforeMethod;
import za.ac.cput.domain.humanResource.HumanResource;
import za.ac.cput.domain.humanResource.HumanResourceLocation;
import za.ac.cput.factory.humanResource.HumanResourceFactory;
import za.ac.cput.factory.humanResource.HumanResourceLocationFactory;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class HumanResourceLocationTest {
    Map<String, String> values;

    @BeforeMethod
    public void setUp() throws Exception {
        values = new HashMap<String, String>();
        values.put("id", "1");
        values.put("street", "123");
        values.put("number", "123");
        values.put("surburb", "123@gmail.com");
        values.put("city", "123");
        values.put("province", "gmail");
    }

    @org.testng.annotations.Test
    public void getHumanResourceLocation() throws Exception {
        HumanResourceLocation humanResourceLocation = HumanResourceLocationFactory.getHumanResourceLocation(values,28);
        assertEquals("gmail", humanResourceLocation.getProvince());

    }
}
