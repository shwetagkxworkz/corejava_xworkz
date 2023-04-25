class Ubereat1{
public static double searchItem(String itemName){
	double price=0.00;
System.out.println("searchItem method started");
if(itemName=="kesari bath"){
System.out.println("thankyou for selecting"+ itemName);
price= 120.20;
}
if(itemName=="vadasambhara"){
System.out.println("thankyou for selecting"+ itemName);
price= 100.20;
}
if(itemName=="paneer pakoda"){
System.out.println("thankyou for selecting"+ itemName);
price= 70.78;
}
if(itemName=="aloo tikki"){
System.out.println("thankyou for selecting"+ itemName);
price= 120.20;
}
if(itemName=="paneer kadhi"){
System.out.println("thankyou for selecting"+ itemName);
price= 100.00;
}
if(itemName=="rasamallai"){
System.out.println("thankyou for selecting"+ itemName);
price= 150.20;
}
if(itemName=="jilebi"){
System.out.println("thankyou for selecting"+ itemName);
price= 30.20;
}
if(itemName=="dahipuri"){
System.out.println("thankyou for selecting"+ itemName);
price= 70.60;
}
if(itemName=="dam biriyani"){
System.out.println("thankyou for selecting"+ itemName);
price= 50.0;
}
if(itemName=="chilli paneer"){
System.out.println("thankyou for selecting"+ itemName);
price= 100.10;
}
if(itemName=="puri bhaji"){
System.out.println("thankyou for selecting"+ itemName);
price= 90.89;
}
if(itemName=="masala bath"){
System.out.println("thankyou for selecting"+ itemName);
price= 50.0;
}
if(itemName=="shavagi bath"){
System.out.println("thankyou for selecting"+ itemName);
price= 60.90;
}
System.out.println("searchItem metod ended");
return price;
}
public static double searchItem(String itemName, int quantity){
	double price=0.00;
System.out.println("searchItem method started");
if(itemName=="kesari bath"){
System.out.println("thankyou for selecting"+ itemName);
price= 120.20*quantity;
}
if(itemName=="vadasambhara"){
System.out.println("thankyou for selecting"+ itemName);
price= 100.20*quantity;
}
if(itemName=="paneer pakoda"){
System.out.println("thankyou for selecting"+ itemName);
price= 70.78*quantity;
}
if(itemName=="aloo tikki"){
System.out.println("thankyou for selecting"+ itemName);
price= 120.20*quantity;
}
if(itemName=="paneer kadhi"){
System.out.println("thankyou for selecting"+ itemName);
price= 100.00*quantity;
}
if(itemName=="rasamallai"){
System.out.println("thankyou for selecting"+ itemName);
price= 150.20*quantity;
}
if(itemName=="jilebi"){
System.out.println("thankyou for selecting"+ itemName);
price= 30.20*quantity;
}
if(itemName=="dahipuri"){
System.out.println("thankyou for selecting"+ itemName);
price= 70.60*quantity;
}
if(itemName=="dam biriyani"){
System.out.println("thankyou for selecting"+ itemName);
price= 50.0*quantity;
}
if(itemName=="chilli paneer"){
System.out.println("thankyou for selecting"+ itemName);
price= 100.10*quantity;
}
if(itemName=="puri bhaji"){
System.out.println("thankyou for selecting"+ itemName);
price= 90.89*quantity;
}
if(itemName=="masala bath"){
System.out.println("thankyou for selecting"+ itemName);
price= 50.0*quantity;
}
if(itemName=="shavagi bath"){
System.out.println("thankyou for selecting"+ itemName);
price= 60.90*quantity;
}
System.out.println("searchItem metod ended");
return price;
}
}