public class Store {

    private Movie[] movies;

    public Store() {
        // TODO
        this.movies=new Movie[10];
    }

    public Movie getMovie(int index) {
        // TODO 
        Movie copy=new Movie(movies[index]);
        return copy;
    }

    public void setMovie(int index, Movie movie) {
        // TODO 
        Movie copy=new Movie(movie);
        this.movies[index]=copy;
    }


    public String toString() {
        String temp = "";
        for (Movie movie : movies) {
            temp += movie.toString() + "\n";
        }
        return temp;
    }

}
