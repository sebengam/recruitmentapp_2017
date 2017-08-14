package za.ac.cput.factory.humanResource;


import za.ac.cput.domain.humanResource.HumanResourceLocation;

import java.util.Map;

/**
 * Created by Tank on 4/23/2016.
 */
public class HumanResourceLocationFactory
{
    public static HumanResourceLocation getHumanResourceLocation (Map<String, String> values,double number)
    {
        HumanResourceLocation humanResourceLocation = new HumanResourceLocation.Builder()
                .number(number)
                .street(values.get("street"))
                .surburb(values.get("surburb"))
                .city(values.get("city"))
                .province(values.get("province"))
                .build();
        return humanResourceLocation;

    }
}
