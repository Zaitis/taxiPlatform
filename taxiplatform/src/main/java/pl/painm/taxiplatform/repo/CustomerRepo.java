package pl.painm.taxiplatform.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.painm.taxiplatform.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {

    Customer findByMail(String mail);
}
