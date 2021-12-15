package Question4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) throws ParseException {
        Date twoThousand = new GregorianCalendar(2000, Calendar.JANUARY, 1).getTime();
        Date nineteenHundred = new GregorianCalendar(1990, Calendar.JANUARY, 1).getTime();
        Movie a = new Movie("Hangover", new GregorianCalendar(2003, Calendar.FEBRUARY, 15).getTime(),
                Arrays.asList("John", "Frank"), "Mill");
        Movie b = new Movie("Hangover 2", new GregorianCalendar(1987, Calendar.AUGUST, 03).getTime(),
                Arrays.asList("Leo", "Hazard", "Mendy"), "Brian");
        Movie c = new Movie("Hangover 3", new GregorianCalendar(2020, Calendar.DECEMBER, 01).getTime(),
                Arrays.asList("Kane", "Alli"), "Pep");
        Movie d = new Movie("Hangover 4", new GregorianCalendar(1997, Calendar.JUNE, 24).getTime(),
                Arrays.asList("Lewa", "Zlatan"), "Cristiano");


        List<Movie> movieList = new ArrayList<>();
        movieList.add(a);
        movieList.add(b);

        List<Movie> sadList = new ArrayList<>();
        sadList.add(c);
        sadList.add(d);

        Genre cosmetic = new Genre(movieList);
        Genre tragedy = new Genre(sadList);

        List<Genre> genreList = new ArrayList<>();
        genreList.add(cosmetic);
        genreList.add(tragedy);

        Netflix netflix = new Netflix(genreList);


        netflix.list.stream()
                .flatMap(genre -> genre.list.stream())
                .filter(movie -> movie.ReleaseDate.before(twoThousand))
                .forEach(movie -> movie.Title = movie.Title + "(Classic)");


        List<Movie> ans = netflix.list.stream().flatMap(genre -> genre.list.stream()).sorted(new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o2.ReleaseDate.compareTo(o1.ReleaseDate);
            }
        }).limit(3).collect(Collectors.toList());


        List<Movie> listOfAllMovie = netflix.list.stream().flatMap(genre -> genre.list.stream()).collect(Collectors.toList());
        Predicate<Movie> dateBefore2000 = movie -> movie.ReleaseDate.before(twoThousand);
        Predicate<Movie> dateAfter1990 = movie -> movie.ReleaseDate.after(nineteenHundred);
        printMovieInRange((ArrayList<Movie>) listOfAllMovie, dateBefore2000, dateAfter1990);


        for(Movie movie : listOfAllMovie) addReleaseYear(movie);


        Collections.sort(listOfAllMovie, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.Title.compareTo(o2.Title);
            }
        });
    }

    private static void printMovieInRange(ArrayList<Movie> res, Predicate<Movie> condition1, Predicate<Movie> condition2){
        for (Movie movie: res) {
            if(condition1.test(movie) && condition2.test(movie)){
                System.out.println(movie.Title);
            }
        }
    }

    private static void addReleaseYear(Movie movie) {
        SimpleDateFormat dayFormat = new SimpleDateFormat("yyyy");
        String year = dayFormat.format(movie.ReleaseDate);
        movie.Title = movie.Title + year;
    }
}
