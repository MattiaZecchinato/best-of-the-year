package org.lessons.java.best_of_the_year;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BestOfTheYearController {

    String name = "mattia";

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("name", name);

        return "index";
    }
}
