package za.ac.cput.factory.administrator;

import za.ac.cput.domain.Administrator.Administrator;

import java.util.Map;

public class AdministratorFactory {

    public static Administrator getAdministrator(Map<String, String> values) {
        Administrator administrator = new Administrator.Builder()
                .id(values.get("id"))
                .staffNumber(values.get("staffNumber"))
                .build();
        return administrator;

    }

}
