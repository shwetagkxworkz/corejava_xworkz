class MobileShopTester{
public static void main(String name[]){
System.out.println("main started");
System.out.println("mobiles names are added");
MobileShop.addMobileName("samsung");
MobileShop.addMobileName("redmi");
MobileShop.addMobileName("realme");
MobileShop.addMobileName("vivo");
MobileShop.addMobileName("oppo");
MobileShop.addMobileName("nokia");
MobileShop.addMobileName("iphone");
MobileShop.addMobileName("poco");
MobileShop.addMobileName("moto");
MobileShop.addMobileName("galaxy");

System.out.println("mobile names are");
MobileShop.getMobileNames();

System.out.println("updated Mobile names are");
MobileShop.updateMobileNames("redmi", "redmi note 12 pro");
MobileShop.getMobileNames();
System.out.println("main ended");
}
}