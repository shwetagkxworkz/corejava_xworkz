class UbereatTester1{
public static void main(String name[]){
System.out.println("main started");
String itemName="chilli paneer";
double priceForSingle=Ubereat1.searchItem(itemName);
double priceWithQuantity=Ubereat1.searchItem(itemName,2);
System.out.println("the price of"+ itemName+ "is"+ priceForSingle);
System.out.println("the price of"+ itemName+ "is"+ priceWithQuantity);
System.out.println("main ended");
}
}