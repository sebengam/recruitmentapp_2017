package za.ac.cput.factory.humanResource;


import za.ac.cput.domain.humanResource.HumanResource;

import java.util.Map;

public class HumanResourceFactory
{
    public static HumanResource getHumanResource(Map<String, String> values)
    {
        HumanResource company = new HumanResource.Builder()
                .name(values.get("name"))
                .surname(values.get("surname"))
                .email(values.get("email"))
                .id(values.get("id"))
                .build();
        return company;

    }

}
