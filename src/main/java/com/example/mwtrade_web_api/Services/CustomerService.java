package com.example.mwtrade_web_api.Services;

import com.example.mwtrade_web_api.Entities.Customer;
import com.example.mwtrade_web_api.Repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomersDetails() {
        return customerRepository.findAll();
    }

    public Optional<Customer> getCustomerDetails(Long customerId) {
        Optional<Customer> optionalCustomer =customerRepository.findById(customerId);
        return  optionalCustomer;
    }


    public void addNewCustomer(Customer customer) {
     Optional<Customer> customerOptional =customerRepository.findByUsernameandEmail(customer.getUserName(),customer.getEmail());
     if(customerOptional.isPresent()){
         throw  new IllegalStateException("An email or username already taken");
     }
     customerRepository.save(customer);

    }

    @Transactional
    public void updateCustomer(Long customerId,
                               String email,
                               String userName,
                               String password,
                               String mobileNo,
                               String address1,
                               String address2,
                               String region,
                               String district,
                               String postalCode) {
        Customer customer =customerRepository.findById(customerId).orElseThrow(() ->
                new IllegalStateException("Customer with id "+customerId+" is not in the database "));

        if(email!=null &&
        !Objects.equals(customer.getEmail(),email)){
            customer.setEmail(email);
        }
        if(userName !=null &&
    !Objects.equals(customer.getUserName(),userName)){
            customer.setUserName(userName);
        }
        if(password !=null &&
                !Objects.equals(customer.getPassWord(),password)){
            customer.setPassWord(password);
        }
        if( mobileNo!=null &&
                !Objects.equals(customer.getMobileNo(),mobileNo)){
            customer.setMobileNo(mobileNo);
        }
        if(address1 !=null &&
                !Objects.equals(customer.getAddress1(),address1)){
            customer.setAddress1(address1);
        }
        if( address2!=null &&
                !Objects.equals(customer.getAddress2(),address2)){
            customer.setAddress2(address2);
        }
        if( region!=null &&
                !Objects.equals(customer.getRegion(),region)){
            customer.setRegion(region);
        }
        if(district !=null &&
                !Objects.equals(customer.getDistrict(),district)){
            customer.setDistrict(district);
        }
        if( postalCode!=null &&
                !Objects.equals(customer.getPostalCode(),postalCode)){
            customer.setPostalCode(postalCode);
        }
        customer.setModified_At(new Date());

    }

    public void deleteCustomer(Long customerId) {
        boolean exist=customerRepository.existsById(customerId);
        if(!exist)
        {
            throw  new IllegalStateException("Product with id "+customerId+"DOes not exist");
        }
        customerRepository.deleteById(customerId);
    }

}
