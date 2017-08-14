package za.ac.cput.repositories;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import za.ac.cput.domain.humanResource.HumanResource;
import za.ac.cput.factory.humanResource.HumanResourceFactory;
import za.ac.cput.repositories.impl.HumanResourceRepositoriesImpl;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertNull;

public class HumanResourceRepositiesTest {

    Map<String,String> values;
    HumanResourceRepositories repository;

    @BeforeMethod
    public void setUp() throws Exception {
        repository = HumanResourceRepositoriesImpl.getInstance();
        values = new HashMap<String, String>();
        values.put("id","1");
        values.put("name","male");
        values.put("surname","black");
        values.put("email","black@gmail.com");
    }

    @Test
    public void testCreate() throws Exception {
        HumanResource humanResource = HumanResourceFactory.getHumanResource(values);
        repository.create(humanResource);
        assertEquals("black", humanResource.getSurname());
    }

    @Test(dependsOnMethods = "testCreate")
    public void testRead() throws Exception {
        HumanResource updateHumanResource = repository.read("1");
        assertEquals("male",updateHumanResource.getName());
    }

    @Test
    public void testUpdate() throws Exception {

        HumanResource updateHumanResource = repository.read("1");
        HumanResource newHumanResource = new HumanResource.Builder()
                .name(values.get("name"))
                .surname(values.get("surname"))
                .email(values.get("email"))
                .id(values.get("id"))
                .build();
        repository.update(newHumanResource);
        HumanResource UpdatePerson = repository.read("1");
        assertEquals("black@gmail.com", UpdatePerson.getEmail());

    }

    @Test
    public void testDelete() throws Exception {
        repository.delete("1");
        HumanResource HumanResourceContact = repository.read("1");
        assertNull(HumanResourceContact);
    }
}
