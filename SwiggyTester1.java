class SwiggyTester1{
public static void main(String name[]){
System.out.println("main started");
String itemName="noodles";
double priceForSingle=Swiggy1.searchItem(itemName);
double priceWithQuantity=Swiggy1.searchItem(itemName,4);
System.out.println("the price of"+ itemName+ "is"+ priceForSingle);
System.out.println("the price of"+ itemName+ "is"+ priceWithQuantity);
System.out.println("main ended");
}
}