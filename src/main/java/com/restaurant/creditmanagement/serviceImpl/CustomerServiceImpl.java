package com.restaurant.creditmanagement.serviceImpl;

import com.restaurant.creditmanagement.entity.Customer;
import com.restaurant.creditmanagement.repository.CustomerRepository;
import com.restaurant.creditmanagement.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository){
        this.customerRepository=customerRepository;
    }

    @Override
    public Customer addCustomer(Customer customer) {
        if(customerRepository.existsByPhoneNumber(customer.getPhoneNumber())){
            throw new RuntimeException("Customer with this phone number already exists");
        }
        customer.setTotalCredit(0.0);

        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Customer does not exist with id: "+id));
    }

    @Override
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public void saveCustomer(Customer customer){
        customerRepository.save(customer);
    }
}
