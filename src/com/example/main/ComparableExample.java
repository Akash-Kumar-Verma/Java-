package com.example.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie implements Comparable<Movie> {
    String name;
    double rating;
    int year;

    Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(Movie o) {
        return this.getYear()-o.getYear();
    }
}


public class ComparableExample{
    public static void main(String[] args) {
        ArrayList<Movie> list=new ArrayList<>();
        list.add(new Movie("Race 3",  3.3,2021));
        list.add(new Movie("Breaking Bad",  9.3,2011));
        list.add(new Movie("Pathan",  6.3,2023));
        list.add(new Movie("Animal",  7.3,2023));

        //lambda exp
       // Collections.sort(list, (o1, o2) -> (int) (o1.getRating()-o2.getRating()));

        Collections.sort(list);
        System.out.println("Movies after sorting : ");
        for (Movie movie: list)
        {
            System.out.println(movie.getName() + " " +
                    movie.getRating() + " " +
                    movie.getYear());
        }
    }
}
