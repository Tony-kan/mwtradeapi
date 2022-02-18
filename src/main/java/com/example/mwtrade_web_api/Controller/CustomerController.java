package com.example.mwtrade_web_api.Controller;

import com.example.mwtrade_web_api.Entities.Customer;
import com.example.mwtrade_web_api.Services.CustomerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path="/v3/MW_Trade/Home/profile/customer")
@Api("Customer")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @ApiOperation("List all Customers who registered ")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Successfully retrieved list of Customers"),
                    @ApiResponse(code = 401, message = "You are not authorized to view those Customers"),
                    @ApiResponse(code = 403, message = "Accessing the Customer you were trying to reach is forbidden"),
                    @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
            }
    )
    @GetMapping
    public List<Customer> viewAllCustomers(){

        return  customerService.getAllCustomersDetails();
    }

//    public ResponseEntity<List<Customer>> viewAllCustomers(){
//        List<Customer> customers = customerService.getAllCustomersDetails();
//
//        customers.forEach(customer -> {
//           customer.add(linkTo(methodOn(CustomerController.class).viewAllCustomers()).withSelfRel());
//
//            Long customerId= customer.getCustomerId();
//            customer.add(linkTo(methodOn(CustomerController.class).viewYourProfile(customerId)).withRel("View-Your-Profile"));
//
//            customer.add(linkTo(methodOn(CustomerController.class).removeCustomer(customerId)).withRel("delete-customer"));
//
//           customer.add(linkTo(methodOn(CustomerController.class).newCustomer(customer)).withRel("New-Customer"));
//
//            customer.add(linkTo(methodOn(CustomerController.class).updateCustomerDetails(customer.getCustomerId(),
//                    customer.getEmail(),
//                    customer.getUserName(),
//                    customer.getPassWord(),
//                    customer.getMobileNo(),
//                    customer.getAddress1(),
//                    customer.getAddress2(),
//                    customer.getRegion(),
//                    customer.getDistrict(),
//                    customer.getPostalCode())).withRel("update-Your-profile"));
//        });
//
//
//        return new ResponseEntity<List<Customer>>(customers,HttpStatus.OK);
//    }

    @ApiOperation("View A your Profile ")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Successfully retrieved your Profile details"),
                    @ApiResponse(code = 401, message = "You are not authorized to view your profile"),
                    @ApiResponse(code = 403, message = "Accessing the information you were trying to reach is forbidden"),
                    @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
            }
    )
   @GetMapping(path="/{customerId}")
    public Optional<Customer> viewYourProfile(@PathVariable("customerId") Long customerId) {

        return customerService.getCustomerDetails(customerId);
    }
//   public ResponseEntity<Optional<Customer>> viewYourProfile(@PathVariable("customerId") Long customerId) {
//
//     Optional<Customer> customerOptional =customerService.getCustomerDetails(customerId);
//
//       customerOptional.map(customer -> {
//           customer.add(linkTo(methodOn(CustomerController.class).viewYourProfile(customerId)).withSelfRel());
//
//           customer.add(linkTo(methodOn(CustomerController.class).viewAllCustomers()).withRel("View-All-Customers"));
//
//           customer.add(linkTo(methodOn(CustomerController.class).updateCustomerDetails(customerId,
//                   customer.getEmail(),
//                   customer.getUserName(),
//                   customer.getPassWord(),
//                   customer.getMobileNo(),
//                   customer.getAddress1(),
//                   customer.getAddress2(),
//                   customer.getRegion(),
//                   customer.getDistrict(),
//                   customer.getPostalCode())).withRel("Update-Your-profile"));
//
//           customer.add(linkTo(methodOn(CustomerController.class).removeCustomer(customerId)).withRel("delete-Customers"));
//
//           return ResponseEntity.ok(customer);
//
//       });
//
//        return new ResponseEntity<Optional<Customer>>(customerOptional,HttpStatus.OK);
//   }


  @ApiOperation(value = "Register a New Customer")
    @PostMapping(path="/admin/newcustomer")
  public void newCustomer(@RequestBody Customer customer){

      customerService.addNewCustomer(customer);
  }
//    public Object newCustomer(@RequestBody Customer customer){
//
//        customerService.addNewCustomer(customer);
//
//        return null;
//    }

    @ApiOperation(value = "Update A Customer's Details")
    @PutMapping(path="/admin/updateCustomer/{customerId}")
    public void updateCustomerDetails(
            @PathVariable("customerId") Long customerId,
            @RequestParam(required = false) String email,
            @RequestParam(required = false) String userName,
            @RequestParam(required = false) String password,
            @RequestParam(required = false) String mobileNo,
            @RequestParam(required = false) String address1,
            @RequestParam(required = false) String address2,
            @RequestParam(required = false) String region,
            @RequestParam(required = false) String district,
            @RequestParam(required = false) String postalCode){
        customerService.updateCustomer(customerId,
                email,
//                userName,
                password
//                mobileNo,
//                address1,
//                address2,
//                region,
//                district,
//                postalCode
        );
    }
//    public Object updateCustomerDetails(
//            @PathVariable("customerId") Long customerId,
//            @RequestParam(required = false) String email,
//            @RequestParam(required = false) String userName,
//            @RequestParam(required = false) String password,
//            @RequestParam(required = false) String mobileNo,
//            @RequestParam(required = false) String address1,
//            @RequestParam(required = false) String address2,
//            @RequestParam(required = false) String region,
//            @RequestParam(required = false) String district,
//            @RequestParam(required = false) String postalCode){
//        customerService.updateCustomer(customerId,
//                email,
//                userName,
//                password,
//                mobileNo,
//                address1,
//                address2,
//                region,
//                district,
//                postalCode);
//
//        return null;
//    }

    @ApiOperation(value = "Remove A Customer from the Database")
    @DeleteMapping(path="/admin/deletecustomer/{customerId}")
    public void removeCustomer(@PathVariable("customerId")  Long customerId){

        customerService.deleteCustomer(customerId);
    }
//    public Object removeCustomer(@PathVariable("customerId")  Long customerId){
//
//        customerService.deleteCustomer(customerId);
//
//       return null;
//    }
}


