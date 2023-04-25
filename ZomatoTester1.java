class ZomatoTester1{
public static void main(String zomato1[]){
System.out.println("main started");
String itemName="veg biriyani";
double priceForSingle=Zomato1.searchItem(itemName);
double priceWithQuantity=Zomato1.searchItem(itemName, 3);
System.out.println("the price of"+ itemName+" is"+ priceForSingle);
System.out.println("the price of"+ itemName+"is" + priceWithQuantity);
System.out.println("main ended");
}
}