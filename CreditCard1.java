class CreditCard1{
static String names[]={"SBI", "BOI", "Canara", "axix", "karnataka", "central", "mysore", "vikasa", "ICICI", "Citi", "kotak", "baroda", "HSBC", "HDFC"};
public static void main(String shweta[])
{
System.out.println(" main started");
getNames();
System.out.println(" main ended");
}
public static void getNames(){
System.out.println(" calling getNames method ");
System.out.println("list of credit card names ");
for (int i=0; i<names.length; i++)
{
System.out.println(names[i]);
}
System.out.println("ended getNames method");
return;
}
}
