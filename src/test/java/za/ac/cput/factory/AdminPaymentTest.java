package za.ac.cput.factory;

import org.testng.annotations.BeforeMethod;
import za.ac.cput.domain.Administrator.AdminPayment;
import za.ac.cput.domain.Administrator.Administrator;
import za.ac.cput.factory.administrator.AdminPaymentFactory;
import za.ac.cput.factory.administrator.AdministratorFactory;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class AdminPaymentTest {

    Map<String,String> values;

    @BeforeMethod
    public void setUp() throws Exception {
        values = new HashMap<String, String>();
        values.put("id","1");
        values.put("bank","123");
        values.put("accountNumber","1");
    }

    @org.testng.annotations.Test
    public void getPerson() throws Exception {
        AdminPayment administratorPayment = AdminPaymentFactory.getAdminPayment(values,25);
        assertEquals("1",administratorPayment.getAccountNumber());
    }
}
