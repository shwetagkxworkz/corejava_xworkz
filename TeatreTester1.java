class TeatreTester1{
public static void main(String name[]){
System.out.println("main started");
System.out.println("movie names are added");
Teatre1.addMovies("kranti");
Teatre1.addMovies("vikrant ronna");
Teatre1.addMovies("yuvratna");
Teatre1.addMovies("kantara");
Teatre1.addMovies("trible riding");
Teatre1.addMovies("RRR");
Teatre1.addMovies("KGF");
Teatre1.addMovies("orange");
Teatre1.addMovies("pushpa");
Teatre1.addMovies("shivaji suratkal");
Teatre1.addMovies("yajamana");

System.out.println("movies names are");
Teatre1.getMovies();

System.out.println("updated Movie names are");
Teatre1.updateMovies("KGF", "KGF2");
Teatre1.getMovies();

String movieName=Teatre1.getMovies("yuvratna");
System.out.println("search movie name is " + movieName );
System.out.println("main ended");
}
}