class Restaurant1{
static String menu[]={"null","null", "null", "null", "null", "null","null", "null", "null", "null", "null", "null", "null", "null","null"};
static int index;
public static boolean addMenu(String name){
System.out.println("addMenu method started");
boolean isAdded=false;
if(menu!=null && index<menu.length){
menu[index++]=name;
isAdded=true;
System.out.println("menu is added");
}
else{
System.out.println("menu is reached max value");
}
System.out.println("addMenu method ended");
return isAdded;
}
public static void getMenu(){
System.out.println("getMenu method started");
for (int i=0;i<menu.length;i++){
System.out.println(menu[i]);
}
System.out.println("getMenu method ended");
return ;
}
public static boolean updateMenu(String oldName, String updatedName){
System.out.println("updateMenu method started");
boolean isUpdated=false;
for(int i=0;i<menu.length;i++){
if(menu[i]==oldName){
menu[i]=updatedName;
isUpdated=true;
System.out.println(menu[i]);
}
}
System.out.println("updateMenu method ended");
return isUpdated;
}
public static String getMenu(String name){
	System.out.println("getMenu method started");
	for(int i=0;i<menu.length;i++){
		if(menu[i].equals(name))
			return name;
		else{
			System.out.println("menu is not found");
		}
}
System.out.println("getMenu method ended");
return "no menu";
}
}