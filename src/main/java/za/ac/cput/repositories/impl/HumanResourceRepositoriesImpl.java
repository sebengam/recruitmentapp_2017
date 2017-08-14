package za.ac.cput.repositories.impl;

import za.ac.cput.domain.humanResource.HumanResource;
import za.ac.cput.repositories.HumanResourceRepositories;

import java.util.HashMap;
import java.util.Map;

public class HumanResourceRepositoriesImpl implements HumanResourceRepositories {
    private static HumanResourceRepositoriesImpl respository = null;

    private Map<String,HumanResource> humanResourceTable;

    private HumanResourceRepositoriesImpl() {
        humanResourceTable = new HashMap<String, HumanResource>();
    }

    public static HumanResourceRepositoriesImpl getInstance(){
        if(respository==null)
            respository = new HumanResourceRepositoriesImpl();
        return respository;
    }

    public HumanResource create(HumanResource humanResource) {
        humanResourceTable.put(humanResource.getId(),humanResource);
        HumanResource saved = humanResourceTable.get(humanResource.getId());
        return saved;
    }

    public HumanResource read(String id) {
        HumanResource person = humanResourceTable.get(id);
        return person;
    }

    public HumanResource update(HumanResource demographics) {
        humanResourceTable.put(demographics.getId(),demographics);
        HumanResource update = humanResourceTable.get(demographics.getId());
        return update;
    }

    public void delete(String id) {
        humanResourceTable.remove(id);

    }

}
