package za.ac.cput.service;

import za.ac.cput.domain.EmployeeAddress;
import za.ac.cput.repository.EmployeeAddressRepository;

import java.util.Set;

public class EmployeeAddressServices implements IEmployeeAddressServices{
     private final EmployeeAddressRepository repository;
     private static  IEmployeeAddressServices SERVICES;

     private EmployeeAddressServices(){
         this.repository = EmployeeAddressRepository.getRepository();
     }

     public static IEmployeeAddressServices getServices() {
         if (SERVICES == null) {
            SERVICES = new EmployeeAddressServices();
         }
         return SERVICES;
     }

    @Override
    public Set<EmployeeAddress> getAll() {
        return this.repository.getAll();
    }

    @Override
    public EmployeeAddress create(EmployeeAddress employeeAddress) {
        return this.repository.create(employeeAddress);
    }

    @Override
    public EmployeeAddress read(String staffId) {
        return this.repository.read(staffId);
    }

    @Override
    public EmployeeAddress update(EmployeeAddress employeeAddress) {
        return this.repository.update(employeeAddress);
    }

    @Override
    public boolean delete(String staffId) {
        return this.repository.delete(staffId);
    }
}