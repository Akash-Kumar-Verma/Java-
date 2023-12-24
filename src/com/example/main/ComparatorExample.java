package com.example.main;

import java.util.ArrayList;
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
//for Comparing the value based on name
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
        list.add(new Movie("Dilwale", 7.3, 2015));
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));


        RatingCompare ratingCompare = new RatingCompare();

        //pass the object of rating compare into list.sort
        list.sort(ratingCompare);
        System.out.println("Movies after sorting Rating : ");
        for (Movie movie : list) {
            System.out.println(movie.getName() + " " +
                    movie.getRating() + " " +
                    movie.getYear());
        }

        //creating the object of name compare class
        NameCompare nameCompare = new NameCompare();
        //pass the object of name compare into list.sort
        list.sort(nameCompare);
        System.out.println("Movies after sorting Name: ");
        for (Movie movie : list) {
            System.out.println(movie.getName() + " " +
                    movie.getRating() + " " +
                    movie.getYear());
        }
    }
}
