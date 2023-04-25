class Zomato1{

 
public static double searchItem(String itemName){
 double price=0.00;	
System.out.println("searchItem method started");
if ("veg biriyani"==itemName){
System.out.println("thankyou for selecting"+ itemName);
price=230.70;
}
if ("masala dose"==itemName){
System.out.println("thankyou for selecting"+ itemName);
price=50.00;
}
if ("gobi"==itemName){
System.out.println("thankyou for selecting"+ itemName);
price=60.30;
}
if ("biriyani"==itemName){
System.out.println("thankyou for selecting"+ itemName);
price=100.30;
}
if ("roti kurma"==itemName){
System.out.println("thankyou for selecting"+ itemName);
price=200.10;
}
if ("pizza"==itemName){
System.out.println("thankyou for selecting"+ itemName);
price=150.80;
}
if ("french fries"==itemName){
System.out.println("thankyou for selecting"+ itemName);
price=150.60;
}
if ("veg biriyani"==itemName){
System.out.println("thankyou for selecting"+ itemName);
price=230.70;
}
if ("pulao"==itemName){
System.out.println("thankyou for selecting"+ itemName);
price=60.00;
}
if ("friend rice"==itemName){
System.out.println("thankyou for selecting"+ itemName);
price=100.30;
}
if ("hydrebada biriyani"==itemName){
System.out.println("thankyou for selecting"+ itemName);
price=230.50;
}
System.out.println("searchItem method ended");
return price;
}
public static double searchItem(String itemName, int quantity){
	double price=0.00;
System.out.println("search Item with quantity");
System.out.println("searchItem method started");
if ("veg biriyani"==itemName){
System.out.println("thankyou for selecting"+ itemName);
price=230.70* quantity;
}
if ("masala dose"==itemName){
System.out.println("thankyou for selecting"+ itemName);
price=50.00*quantity;
}
if ("gobi"==itemName){
System.out.println("thankyou for selecting"+ itemName);
price=60.30*quantity;
}
if ("biriyani"==itemName){
System.out.println("thankyou for selecting"+ itemName);
price=100.30*quantity;
}
if ("roti kurma"==itemName){
System.out.println("thankyou for selecting"+ itemName);
price=200.10*quantity;
}
if ("pizza"==itemName){
System.out.println("thankyou for selecting"+ itemName);
price=150.80*quantity;
}
if ("french fries"==itemName){
System.out.println("thankyou for selecting"+ itemName);
price=150.60*quantity;
}
if ("veg biriyani"==itemName){
System.out.println("thankyou for selecting"+ itemName);
price=230.70*quantity;
}
if ("pulao"==itemName){
System.out.println("thankyou for selecting"+ itemName);
price=60.00*quantity;
}
if ("friend rice"==itemName){
System.out.println("thankyou for selecting"+ itemName);
price=100.30*quantity;
}
if ("hydrebada biriyani"==itemName){
System.out.println("thankyou for selecting"+ itemName);
price=230.50*quantity;
}
System.out.println("searchItem method ended");
return price;
}
}
