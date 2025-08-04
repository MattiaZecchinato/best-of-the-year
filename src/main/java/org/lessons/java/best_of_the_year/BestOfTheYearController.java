package org.lessons.java.best_of_the_year;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BestOfTheYearController {

    ArrayList<Movie> bestMovie = new ArrayList<>();
    ArrayList<Song> bestSong = new ArrayList<>();

    String name = "mattia";

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("name", name);

        return "index";
    }

    private ArrayList<Movie> getBestMovie() {
        return bestMovie;
    }

    private ArrayList<Song> getBestSong() {
        return bestSong;
    }
}
