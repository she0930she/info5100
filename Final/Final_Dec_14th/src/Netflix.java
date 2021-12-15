import java.util.ArrayList;

public class Netflix {
    ArrayList <Genre> genre_list;

    public Netflix() {
        this.genre_list = new ArrayList<>();
    }

    public void addGenre(Genre g){

        genre_list.add(g);
    }

    public ArrayList<Genre> getGenre_list() {
        return genre_list;
    }
}
