package task.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import task.entity.Customer;
import task.exception.CustomerNotFoundException;
import task.repository.CustomerRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;

    public Customer createCustomer(Customer customer) {
        Customer savedCustomer = customerRepository.save(customer);
        return savedCustomer;
    }

    public List<Customer> findAllCustomers() {
        List<Customer> customers = customerRepository.findAll();
        if (customers.isEmpty()) {
            throw new CustomerNotFoundException("Xəta baş verdi !! Bazada müştəri yoxdur !!");
        }
        return customers;
    }
}