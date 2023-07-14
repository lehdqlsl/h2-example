package com.example.h2example.controller;

import com.example.h2example.entity.RecentTransaction;
import com.example.h2example.repository.TransactionsRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class WebController {
    private final TransactionsRepository transactionsRepository;

    public WebController(@Qualifier("jpaTransactionsRepository") TransactionsRepository transactionsRepository) {
        this.transactionsRepository = transactionsRepository;
    }

    @GetMapping("/")
    public String index(Model model) {
        List<RecentTransaction> all = transactionsRepository.findAll();
        model.addAttribute("persons", all);
        return "index";
    }
}
