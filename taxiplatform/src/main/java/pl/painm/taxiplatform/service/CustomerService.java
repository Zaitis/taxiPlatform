package pl.painm.taxiplatform.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.painm.taxiplatform.model.Customer;
import pl.painm.taxiplatform.repo.CustomerRepo;

@Service
public class CustomerService {
    private CustomerRepo customerRepo;

    @Autowired
    public CustomerService(CustomerRepo customerRepo){
        this.customerRepo=customerRepo;
    }

    public void  saveAs(Customer customer) {
        customerRepo.save(customer);
    }

    public Customer findByMail(String mail){
        Customer customer =customerRepo.findByMail(mail);
        return customer;
    }
}
