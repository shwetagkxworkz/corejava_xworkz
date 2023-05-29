package com.xworkz.movie;

public class MovieTester {
    public static void main(String[] args) {
        Screen screen=new Screen();
        Movie movie=new Movie(screen);
        movie.screen.toDisplay();
    }
}
