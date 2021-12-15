import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Movie {
    String title;
    Date release;
    ArrayList actors;
    String director;

    public String getTitle() {
        return title;
    }



    public Date getRelease() {
        return release;
    }



    public ArrayList getActors() {
        return actors;
    }

    public void setActors(ArrayList actors) {
        this.actors = actors;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Movie(String title, Date release, ArrayList actors, String director) {
//        this.actors= new ArrayList();
        this.title = title;
        this.release = release;
        this.actors = actors;
        this.director = director;
    }
    public String getYear(){
        SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
        String year = yearFormat.format(release);
        return year;
    }

    public String addStringonTitle(Movie m){
        return this.getYear()+ this.title;


    }
}
