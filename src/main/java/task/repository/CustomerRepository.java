package task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import task.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
