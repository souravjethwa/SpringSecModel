package com.ssjethwa.springSec.controller;

import com.ssjethwa.springSec.model.Customer;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustController {

    private List<Customer> custList= new ArrayList<>(
            List.of(new Customer(1,"Sourav"),
                    new Customer(2,"Sumit"))
    );

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @GetMapping("/customers")
    public List<Customer> getCustomers(){
        return custList;
    }

    @PostMapping("/addCustomer")
    public Customer addCustomer(@RequestBody Customer customer){
        custList.add(customer);
        return customer;
    }
}
