package za.ac.cput.factory;

import org.junit.Test;
import org.testng.annotations.BeforeMethod;
import za.ac.cput.domain.Administrator.Administrator;
import za.ac.cput.factory.administrator.AdministratorFactory;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class AdministratorTest {

    Map<String,String> values;

    @BeforeMethod
    public void setUp() throws Exception {
        values = new HashMap<String, String>();
        values.put("id","1");
        values.put("staffNumber","123");
    }

    @org.testng.annotations.Test
    public void getPerson() throws Exception {
        Administrator administrator = AdministratorFactory.getAdministrator(values);
        assertEquals("123",administrator.getStaffNumber());
    }

}
