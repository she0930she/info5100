import com.sun.tools.javah.Gen;

import java.util.*;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        int[][] room={
                {0,0,0,0},
                {0,0,0,0},
                {-1,0,0,0},
                {0,0,-1,0},

        } ;
        Robot robot = new Robot (room );


        //Q4
        Netflix netflix= new Netflix();
        Genre comody= new Genre("Comody");
        Genre horror= new Genre("horror");
        Genre happy= new Genre("happy");

        netflix.addGenre(comody);
        netflix.addGenre(horror);
        netflix.addGenre(happy);

        ArrayList <String> actors= new ArrayList<>();
        actors.add("Brad Pitt");
        actors.add("Angolina");
        actors.add("Leonardo");

        Date d1= new GregorianCalendar(2000, Calendar.JANUARY, 10).getTime();
        Date d2= new GregorianCalendar(1990, Calendar.MARCH, 21).getTime();
        Date d3= new GregorianCalendar(1800, Calendar.JUNE, 5).getTime();
        Date d4= new GregorianCalendar(2020, Calendar.AUGUST, 5).getTime();
        Date d5= new GregorianCalendar(2019, Calendar.SEPTEMBER, 5).getTime();


        Movie m1= new Movie("Titanic", d1, actors, "Stephen");
        Movie m2= new Movie("Romeo", d2, actors, "Emilia");
        Movie m3= new Movie("A city of a thousand planets", d3, actors, "Pam");
        Movie m4= new Movie("Pyrimid", d4, actors, "Josh");
        Movie m5= new Movie("Holidays", d5, actors, "Mile Kameron");

        //Q4_1_____list of movies
        comody.addMovieInList(m1);
        horror.addMovieInList(m2);
        horror.addMovieInList(m3);
        happy.addMovieInList(m4);
        happy.addMovieInList(m5);


        Date date2000 = new GregorianCalendar(2000, Calendar.JANUARY, 1).getTime();
        Date date1990 = new GregorianCalendar(1990, Calendar.JANUARY, 1).getTime();

        Predicate<Movie> before2000 = movie -> movie.release.before(date2000 ) ;
        Predicate<Movie> after1990 = movie -> movie.release.before(date2000) ;

        ArrayList<Genre> gen_lis;

        //Classic
//        netflix.getGenre_list().stream().flatMap(g-> g.getMovies().stream()).forEach(ovie -> System.out.println(ovie..));
        horror.getMovies().stream()
                .map(m-> m);



        //predicate
        netflix.getGenre_list().stream().flatMap(g-> g.getMovies().stream())
                .filter(before2000).filter(after1990)
                .forEach(m-> System.out.println(m));



//        netflix.getGenre_list().stream().flatMap(g-> g.getMovies().stream())
//                .flatMap(m-> before2000.and(after1990).test(m1.getYear()))
//                .forEach(m-> System.out.println(m));


        //addtitle
        netflix.getGenre_list().stream().flatMap(g-> g.getMovies().stream())
                .flatMap(Movie m-> m)
                .forEach(m-> System.out.println(m));


        //sort
        netflix.getGenre_list().stream().flatMap(genre -> genre.getMovies().stream())
                .sorted((Movie mm1, Movie mm2)-> mm1.getYear().compareTo(mm2.getYear()) )
                .forEach(m-> System.out.println(m));


    }
}
