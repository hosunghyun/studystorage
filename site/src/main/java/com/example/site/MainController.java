package com.example.site;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @Autowired
    private final ItemService itemService;
    public MainController(ItemService itemService) {
        this.itemService = itemService;
   }

    @GetMapping({"/", "/index", "/home"})
    public String index() {
        return "index";
    }

    @GetMapping("/list")
    public String list(Model model) {
        List<Item> items = itemService.getItemByPage();
        model.addAttribute("items", items);
        return "/list";
    }
}
