class Swiggy1{
public static double searchItem(String itemName){
	double price=0.00;
System.out.println("searchItem method started");
if(itemName=="pavbhaji"){
System.out.println("thankyou for selecting"+ itemName);
price= 120.20;
}
if(itemName=="noodles"){
System.out.println("thankyou for selecting"+ itemName);
price= 100.20;
}
if(itemName=="sandwich"){
System.out.println("thankyou for selecting"+ itemName);
price= 70.78;
}
if(itemName=="burger"){
System.out.println("thankyou for selecting"+ itemName);
price= 120.20;
}
if(itemName=="gulabjamuna"){
System.out.println("thankyou for selecting"+ itemName);
price= 100.00;
}
if(itemName=="rasagulla"){
System.out.println("thankyou for selecting"+ itemName);
price= 150.20;
}
if(itemName=="idly"){
System.out.println("thankyou for selecting"+ itemName);
price= 30.20;
}
if(itemName=="uttapa"){
System.out.println("thankyou for selecting"+ itemName);
price= 70.60;
}
if(itemName=="uppama"){
System.out.println("thankyou for selecting"+ itemName);
price= 50.0;
}
if(itemName=="kheer"){
System.out.println("thankyou for selecting"+ itemName);
price= 100.10;
}
if(itemName=="puri bhaji"){
System.out.println("thankyou for selecting"+ itemName);
price= 90.89;
}
if(itemName=="pongal"){
System.out.println("thankyou for selecting"+ itemName);
price= 50.0;
}
if(itemName=="masala puri"){
System.out.println("thankyou for selecting"+ itemName);
price= 60.90;
}
System.out.println("searchItem metod ended");
return price;
}
public static double searchItem(String itemName, int quantity){
	double price=0.00;
System.out.println("searchItem method started");
if(itemName=="pavbhaji"){
System.out.println("thankyou for selecting"+ itemName);
price= 120.20*quantity;
}
if(itemName=="noodles"){
System.out.println("thankyou for selecting"+ itemName);
price= 100.20*quantity;
}
if(itemName=="sandwich"){
System.out.println("thankyou for selecting"+ itemName);
price= 70.78*quantity;
}
if(itemName=="burger"){
System.out.println("thankyou for selecting"+ itemName);
price= 120.20*quantity;
}
if(itemName=="gulabjamuna"){
System.out.println("thankyou for selecting"+ itemName);
price= 100.00*quantity;
}
if(itemName=="rasagulla"){
System.out.println("thankyou for selecting"+ itemName);
price= 150.20*quantity;
}
if(itemName=="idly"){
System.out.println("thankyou for selecting"+ itemName);
price= 30.20*quantity;
}
if(itemName=="uttapa"){
System.out.println("thankyou for selecting"+ itemName);
price= 70.60*quantity;
}
if(itemName=="uppama"){
System.out.println("thankyou for selecting"+ itemName);
price= 50.0*quantity;
}
if(itemName=="kheer"){
System.out.println("thankyou for selecting"+ itemName);
price= 100.10*quantity;
}
if(itemName=="puri bhaji"){
System.out.println("thankyou for selecting"+ itemName);
price= 90.89*quantity;
}
if(itemName=="pongal"){
System.out.println("thankyou for selecting"+ itemName);
price= 50.0*quantity;
}
if(itemName=="masala puri"){
System.out.println("thankyou for selecting"+ itemName);
price= 60.90*quantity;
}
System.out.println("searchItem metod ended");
return price;
}
}