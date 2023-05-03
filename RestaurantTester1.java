class RestaurantTester1{
public static void main(String name[]){
System.out.println("main started");
System.out.println("menu are added");
Restaurant1.addMenu("gobbi");
Restaurant1.addMenu("noddles");
Restaurant1.addMenu("veg biriyani");
Restaurant1.addMenu("dosa");
Restaurant1.addMenu("idali");
Restaurant1.addMenu("fried rice");
Restaurant1.addMenu("paneer masala");
Restaurant1.addMenu("pizza");
Restaurant1.addMenu("burger");
Restaurant1.addMenu("kesari bath");
Restaurant1.addMenu("paneer roll");
Restaurant1.addMenu("rasagulla");
Restaurant1.addMenu("masala rice");
Restaurant1.addMenu("puri bhaji");
Restaurant1.addMenu("pani puri");
Restaurant1.addMenu("masala puri");

System.out.println("menu is");
Restaurant1.getMenu();

System.out.println("updated menu is");
Restaurant1.updateMenu("pizza", "maggie");
Restaurant1.getMenu();

String item=Restaurant1.getMenu("maggie");
System.out.println("search menu is " + item);
System.out.println("main ended");
}
}