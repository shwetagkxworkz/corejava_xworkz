class Flipkart1{
public static double searchProduct(String productName ){
double price=0.00;
System.out.println("searchProduct method started");
if("phone"==productName){
System.out.println("thankyou for selecting"+ productName);
price=28999.00;
}
if("laptop"== productName){
System.out.println("thankyou for selecting"+ productName);
price=50999.00;
}
if("earbuds"== productName){
System.out.println("thankyou for selecting"+ productName);
price =1599.70;
}
if("iron"==productName){
System.out.println("thankyou for selecting"+ productName);
price= 999.50;
}
if("watch"==productName){
System.out.println("thankyou for selecting"+ productName);
price= 999.50;
}
if("kurta"==productName){
System.out.println("thankyou for selecting"+ productName);
price= 999.50;
}
if("hair straighter"==productName){
System.out.println("thankyou for selecting"+ productName);
price= 1699.80;
}
if("headphone"==productName){
System.out.println("thankyou for selecting"+ productName);
price= 2000.70;
}
if("gown"==productName){
System.out.println("thankyou for selecting"+ productName);
price= 5000.60;
}
if("earphone"==productName){
System.out.println("thankyou for selecting"+ productName);
price= 599.78;
}
if("guitar"==productName){
System.out.println("thankyou for selecting"+ productName);
price= 2999.75;
}
if("shoes"==productName){
System.out.println("thankyou for selecting"+ productName);
price= 999.00;
}
if("t shirts"==productName){
System.out.println("thankyou for selecting"+ productName);
price= 699.00;
}
if("jewellery set"==productName){
System.out.println("thankyou for selecting"+ productName);
price= 2000.50;
}
if("mixer"==productName){
System.out.println("thankyou for selecting"+ productName);
price= 4999.43;
}
System.out.println("searchProduct method ended");
return price;
}
public static double searchProduct(String productName, int quantity ){
double price=0.00;
System.out.println("search Product with quantity");
System.out.println("searchProduct method started");
if("phone"==productName){
System.out.println("thankyou for selecting"+ productName);
price=28999.00*quantity;
}
if("laptop"== productName){
System.out.println("thankyou for selecting"+ productName);
price=50999.00*quantity;
}
if("earbuds"== productName){
System.out.println("thankyou for selecting"+ productName);
price =1599.70*quantity;
}
if("iron"==productName){
System.out.println("thankyou for selecting"+ productName);
price= 999.50*quantity;
}
if("watch"==productName){
System.out.println("thankyou for selecting"+ productName);
price= 999.50*quantity;
}
if("kurta"==productName){
System.out.println("thankyou for selecting"+ productName);
price= 999.50*quantity;
}
if("hair straighter"==productName){
System.out.println("thankyou for selecting"+ productName);
price= 1699.80*quantity;
}
if("headphone"==productName){
System.out.println("thankyou for selecting"+ productName);
price= 2000.70*quantity;
}
if("gown"==productName){
System.out.println("thankyou for selecting"+ productName);
price= 5000.60*quantity;
}
if("earphone"==productName){
System.out.println("thankyou for selecting"+ productName);
price= 599.78*quantity;
}
if("guitar"==productName){
System.out.println("thankyou for selecting"+ productName);
price= 2999.75*quantity;
}
if("shoes"==productName){
System.out.println("thankyou for selecting"+ productName);
price= 999.00*quantity;
}
if("t shirts"==productName){
System.out.println("thankyou for selecting"+ productName);
price= 699.00*quantity;
}
if("jewellery set"==productName){
System.out.println("thankyou for selecting"+ productName);
price= 2000.50*quantity;
}
if("mixer"==productName){
System.out.println("thankyou for selecting"+ productName);
price= 4999.43*quantity;
}
System.out.println("searchProduct method ended");
return price;
}
}