class LibraryTester{
public static void main(String name[]){
System.out.println("main started");
System.out.println("book names are added");
Library.addBookName("The christmas egg");
Library.addBookName("The magnificent map puzzle book");
Library.addBookName("Tea is so intoxicating");
Library.addBookName("dangerous ages");
Library.addBookName("chatterton square");
Library.addBookName("father");
Library.addBookName("reading room");
Library.addBookName("castle skull");
Library.addBookName("my husband simon");
Library.addBookName("RS agaraxala");
Library.addBookName("O The brave music");
Library.addBookName("mazines");
Library.addBookName("sparadhaspurti");
Library.addBookName("GATE2023");
Library.addBookName("current affairs");
System.out.println("English grammer");
Library.getBookNames();

System.out.println("updated book names are");
Library.updateBookNames("father", "The home");
Library.getBookNames();
System.out.println("main started");
}
}