class MobileShopTester1{
public static void main(String name[]){
System.out.println("main started");
System.out.println("mobiles names are added");
MobileShop1.addMobileName("samsung");
MobileShop1.addMobileName("redmi");
MobileShop1.addMobileName("realme");
MobileShop1.addMobileName("vivo");
MobileShop1.addMobileName("oppo");
MobileShop1.addMobileName("nokia");
MobileShop1.addMobileName("iphone");
MobileShop1.addMobileName("poco");
MobileShop1.addMobileName("moto");
MobileShop1.addMobileName("galaxy");
MobileShop1.addMobileName("oppo A15");

System.out.println("mobile names are");
MobileShop1.getMobileNames();

System.out.println("updated Mobile names are");
MobileShop1.updateMobileNames("redmi", "redmi note 12 pro");
MobileShop1.getMobileNames();

String mobileName=MobileShop1.getMobileNames("moto");
System.out.println("search menu is " + mobileName);
System.out.println("main ended");
}
}