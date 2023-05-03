class RestaurantTester{
public static void main(String name[]){
System.out.println("main started");
System.out.println("menu are added");
Restaurant.addMenu("gobbi");
Restaurant.addMenu("noddles");
Restaurant.addMenu("veg biriyani");
Restaurant.addMenu("dosa");
Restaurant.addMenu("idali");
Restaurant.addMenu("fried rice");
Restaurant.addMenu("paneer masala");
Restaurant.addMenu("pizza");
Restaurant.addMenu("burger");
Restaurant.addMenu("kesari bath");
Restaurant.addMenu("paneer roll");
Restaurant.addMenu("rasagulla");
Restaurant.addMenu("masala rice");
Restaurant.addMenu("puri bhaji");
Restaurant.addMenu("pani puri");

System.out.println("menu is");
Restaurant.getMenu();

System.out.println("updated menu is");
Restaurant.updateMenu("pizza", "maggie");
Restaurant.getMenu();
System.out.println("main started");
}
}