package model;

import java.util.ArrayList;
import java.util.List;

public class MovieStore {
    private List<Movie> movies;

    public MovieStore() {
        this.movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public List<Movie> filterByGenre(String genre) {
        return movies.stream().filter(movie -> movie.getGenre().equals(genre)).toList();
    }

    public List<Movie> sortByReleaseYear() {
        return movies.stream().sorted((l, r) -> Integer.compare(l.getReleaseYear(), r.getReleaseYear())).toList();
    }

    public List<Movie> getTopRatedMovies(int n) {
        return movies.stream()
                .sorted((r, l) -> Integer.compare(l.getReleaseYear(), r.getReleaseYear()))
                .limit(n)
                .toList();
    }
}
