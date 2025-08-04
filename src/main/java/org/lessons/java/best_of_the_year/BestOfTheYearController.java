package org.lessons.java.best_of_the_year;

import java.util.ArrayList;

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

    @GetMapping("/movies")
    public String movies(Model model) {
        ArrayList<Movie> moviesList = getBestMovies();

        String bestMoviesList = "";

        for (int i = 0; i < moviesList.size(); i++) {
            bestMoviesList += moviesList.get(i).getTitle();

            if (i == moviesList.size() - 1) {
                bestMoviesList += ".";
            } else {
                bestMoviesList += ", ";
            }
        }

        model.addAttribute("bestMoviesList", bestMoviesList);

        return "movies";
    }

    @GetMapping("/songs")
    public String songs(Model model) {
        ArrayList<Song> songsList = getBestSongs();

        String bestSongsList = "";

        for (int i = 0; i < songsList.size(); i++) {
            bestSongsList += songsList.get(i).getTitle();

            if (i == songsList.size() - 1) {
                bestSongsList += ".";
            } else {
                bestSongsList += ", ";
            }
        }

        model.addAttribute("bestSongsList", bestSongsList);

        return "songs";
    }

    private ArrayList<Movie> getBestMovies() {
        ArrayList<Movie> bestMovie = new ArrayList<>();

        Movie titanic = new Movie(1, "Titanic");
        Movie spaceJam = new Movie(2, "Space Jam");
        Movie theFounder = new Movie(3, "The Founder");
        Movie godzilla = new Movie(4, "Godzilla");

        bestMovie.add(titanic);
        bestMovie.add(spaceJam);
        bestMovie.add(theFounder);
        bestMovie.add(godzilla);

        return bestMovie;
    }

    private ArrayList<Song> getBestSongs() {
        ArrayList<Song> bestSong = new ArrayList<>();

        Song espresso = new Song(1, "Espresso");
        Song oldTownRoad = new Song(2, "old Town Road");
        Song telepatia = new Song(3, "Telepatia");
        Song houdini = new Song(4, "Houdini");

        bestSong.add(espresso);
        bestSong.add(oldTownRoad);
        bestSong.add(telepatia);
        bestSong.add(houdini);

        return bestSong;
    }
}
