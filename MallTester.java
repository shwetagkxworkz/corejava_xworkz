class MallTester{
public static void main(String name[]){
System.out.println("main started");
System.out.println("shop names are added");
Mall.addShopName("MAX");
Mall.addShopName("trends");
Mall.addShopName("pantaloons");
Mall.addShopName("easy buy");
Mall.addShopName("dominos");
Mall.addShopName("adidas");
Mall.addShopName("mother care");
Mall.addShopName("super dry");
Mall.addShopName("westside");
Mall.addShopName("melorra");
Mall.addShopName("lenskart");
Mall.addShopName("Mc donalds");
Mall.addShopName("reliance");
Mall.addShopName("soch");
Mall.addShopName("vivo");

System.out.println("shop names are");
Mall.getShopName();

System.out.println("updated shop names are");
Mall.updateShopName("easy buy", "bata");
Mall.getShopName();
System.out.println("main ended");
}
}