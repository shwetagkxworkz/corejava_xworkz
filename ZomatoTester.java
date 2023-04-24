class ZomatoTester{
public static void main(String zomato[]){
System.out.println("main started");
String itemName="veg biriyani";
double price=Zomato.searchItem(itemName);
System.out.println("the price of"+ itemName+" is"+ price);
System.out.println("main ended");
}
}