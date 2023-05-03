class LibraryTester1{
public static void main(String name[]){
System.out.println("main started");
System.out.println("book names are added");
Library1.addBookName("The christmas egg");
Library1.addBookName("The magnificent map puzzle book");
Library1.addBookName("Tea is so intoxicating");
Library1.addBookName("dangerous ages");
Library1.addBookName("chatterton square");
Library1.addBookName("father");
Library1.addBookName("reading room");
Library1.addBookName("castle skull");
Library1.addBookName("my husband simon");
Library1.addBookName("RS agaraxala");
Library1.addBookName("O The brave music");
Library1.addBookName("mazines");
Library1.addBookName("sparadhaspurti");
Library1.addBookName("GATE2023");
Library1.addBookName("current affairs");
Library1.addBookName("English grammer");
Library1.addBookName("autography");
Library1.getBookNames();

System.out.println("updated book names are");
Library1.updateBookNames("father", "The home");
Library1.getBookNames();

String bookName=Library1.getBookName("The home");
System.out.println("search book Name is " + bookName);
System.out.println("main ended");
}
}