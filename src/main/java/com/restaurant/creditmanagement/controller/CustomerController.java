package com.restaurant.creditmanagement.controller;

import com.restaurant.creditmanagement.entity.Customer;
import com.restaurant.creditmanagement.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers/add")
    public String showAddCustomerForm(Model model){

            model.addAttribute("customer",new Customer());
            return "add-customer";
    }

    @PostMapping("/customers/save")
    public String saveCustomer(Customer customer){

        customerService.saveCustomer(customer);

        return "redirect:/customers/add";
    }
}
