package pro.sky.recipesbook.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class InfoController {
@GetMapping
public String hello() {
    return "Приложение стартовало!";
}
@GetMapping("/info")
    public String info() {
    return "Web-приложение Книга рецептов, Алексей Корниенко, 04.03.2023г.";
}
}
