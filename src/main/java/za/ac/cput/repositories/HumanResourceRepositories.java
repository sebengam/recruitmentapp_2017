package za.ac.cput.repositories;

import za.ac.cput.domain.humanResource.HumanResource;

public interface HumanResourceRepositories {
    HumanResource create(HumanResource humanResource);

    HumanResource read(String id);

    HumanResource update(HumanResource humanResource);

    void delete(String id);

}
