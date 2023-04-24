class Cable{
static String  brandName;
static int price;
static String  connector;
static String colour;
static String  cable;

public static void main(String shweta[]){
	brandName=" bluerigger";
	price= 468;
	connector=" optic";
	colour=" black, blue";
	cable=" fibre optic";
	
	brandName=" amazon basic";
	price=999 ;
	connector=" USB";
	colour=" black";
	cable=" USB";

System.out.println("cable brand name " + brandName);
System.out.println(" cable price " + price);
System.out.println("cable connector type " + connector);
System.out.println("cable colour " + colour);
System.out.println(" cable type " + cable);
}
}