package com.example.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class RatingCompare implements Comparator<Movie>{
    @Override
    public int compare(Movie m1, Movie m2)
    {
        if (m1.getRating() < m2.getRating())
            return -1;
        if (m1.getRating() > m2.getRating())
            return 1;
        else
            return 0;
    }
}
class NameCompare implements Comparator<Movie>{
    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.name.compareTo(o2.name);
    }
}
public class ComparatorExample {
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<>();
        list.add(new Movie("Race 3", 3.3, 2022));
        list.add(new Movie("Breaking Bad", 9.3, 2010));
        list.add(new Movie("Pathan", 6.3, 2023));

        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(list, ratingCompare);
        System.out.println("Movies after sorting : ");
        for (Movie movie : list) {
            System.out.println(movie.getName() + " " +
                    movie.getRating() + " " +
                    movie.getYear());
        }

        NameCompare nameCompare = new NameCompare();
        Collections.sort(list, nameCompare);
        System.out.println("Movies after sorting : ");
        for (Movie movie : list) {
            System.out.println(movie.getName() + " " +
                    movie.getRating() + " " +
                    movie.getYear());
        }
    }
}
