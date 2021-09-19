package pl.painm.taxiplatform.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.painm.taxiplatform.model.Driver;

@Repository
public interface DriverRepo extends JpaRepository<Driver, Long> {
    Driver findByLogin(String login);
}
