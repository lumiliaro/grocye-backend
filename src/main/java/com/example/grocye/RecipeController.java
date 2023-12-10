package com.example.grocye;

import org.springframework.web.bind.annotation.*;

@RestController
public class RecipeController {
    @GetMapping("/recipes")
    public String index() {
        return "index";
    }

    @GetMapping("/recipes/create")
    public String create() {
        return "create";
    }

    @PostMapping("/recipes")
    public String store() {
        return "store";
    }

    @GetMapping("/recipes/{id}")
    public String show() {
        return "show";
    }

    @GetMapping("/recipes/{id}/edit")
    public String edit() {
        return "edit";
    }

    @PutMapping("/recipes/{id}")
    public String update() {
        return "update";
    }

    @DeleteMapping("/recipes/{id}")
    public String destroy() {
        return "destroy";
    }
}
