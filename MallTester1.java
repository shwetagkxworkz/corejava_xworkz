class MallTester1{
public static void main(String name[]){
System.out.println("main started");
System.out.println("shop names are added");
Mall1.addShopName("MAX");
Mall1.addShopName("trends");
Mall1.addShopName("pantaloons");
Mall1.addShopName("easy buy");
Mall1.addShopName("dominos");
Mall1.addShopName("adidas");
Mall1.addShopName("mother care");
Mall1.addShopName("super dry");
Mall1.addShopName("westside");
Mall1.addShopName("melorra");
Mall1.addShopName("lenskart");
Mall1.addShopName("Mc donalds");
Mall1.addShopName("reliance");
Mall1.addShopName("soch");
Mall1.addShopName("vivo");
Mall1.addShopName("johnson");

System.out.println("shop names are");
Mall1.getShopName();

System.out.println("updated shop names are");
Mall1.updateShopName("easy buy", "bata");
Mall1.getShopName();

String shopName=Mall1.getShopName("MAX");
System.out.println("search shop Name is " + shopName);
System.out.println("main ended");
}
}