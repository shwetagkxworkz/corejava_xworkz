class FlipkartTester1{
public static void main(String name[]){
System.out.println("main started");
String productName="phone";
double priceForSingle=Flipkart1.searchProduct(productName);
double priceWithQuantity=Flipkart1.searchProduct(productName,4);
System.out.println("the price of"+ productName+ "is"+ priceForSingle);
System.out.println("the price of"+ productName + "is"+ priceWithQuantity);
System.out.println("main ended");

}
}