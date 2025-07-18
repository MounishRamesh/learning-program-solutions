

package com.example.accountservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

    @GetMapping("/details")
    public String getAccountDetails() {
        return "Account details: [ID: 101, Name: Monish, Type: Savings]";
    }
}
