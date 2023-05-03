class TeatreTester{
public static void main(String name[]){
System.out.println("main started");
System.out.println("movie names are added");
Teatre.addMovies("kranti");
Teatre.addMovies("vikrant ronna");
Teatre.addMovies("yuvratna");
Teatre.addMovies("kantara");
Teatre.addMovies("trible riding");
Teatre.addMovies("RRR");
Teatre.addMovies("KGF");
Teatre.addMovies("orange");
Teatre.addMovies("pushpa");
Teatre.addMovies("shivaji suratkal");

System.out.println("movies names are");
Teatre.getMovies();

System.out.println("updated Movie names are");
Teatre.updateMovies("KGF", "KGF2");
Teatre.getMovies();
System.out.println("main ended");
}
}