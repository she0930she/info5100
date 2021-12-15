import java.util.ArrayList;

public class Genre {
    String type;
    ArrayList movies;


    public Genre(String type) {
        this.type = type;
        this.movies= new ArrayList();
    }

    public void addMovieInList(Movie m){
        movies.add(m);
    }

    public String getType() {
        return type;
    }

    public ArrayList getMovies() {
        return movies;
    }
}
