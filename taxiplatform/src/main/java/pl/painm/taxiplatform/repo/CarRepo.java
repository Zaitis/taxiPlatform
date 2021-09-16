package pl.painm.taxiplatform.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.painm.taxiplatform.model.Car;

@Repository
public interface CarRepo extends JpaRepository<Car, Long> {
}
