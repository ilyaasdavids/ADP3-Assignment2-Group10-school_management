package za.ac.cput.repository;

import za.ac.cput.domain.Employee;
import za.ac.cput.domain.Name;

import java.util.Set;

public interface INameRepository extends IRepository<Name, String >{

    public Set<Name> getAll();
}