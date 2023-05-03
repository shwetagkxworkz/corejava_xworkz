class Mall{
static String shopNames[]={"null","null", "null", "null", "null", "null","null", "null", "null", "null", "null", "null", "null", "null","null"};
static int index;
public static boolean addShopName(String name){
System.out.println("addShopName method started");
boolean isAdded=false;
if(shopNames!=null){
shopNames[index++]=name;
isAdded=true;
System.out.println("shop name is added");
}
else{
System.out.println("shop name is null");
}
System.out.println("addShopName method ended");
return isAdded;
}
public static void getShopName(){
System.out.println("getShopName method started");
for (int i=0;i<shopNames.length;i++){
System.out.println(shopNames[i]);
}
System.out.println("getShopName method ended");
return ;
}
public static boolean updateShopName(String oldName, String updatedName){
System.out.println("updateShopName method started");
boolean isUpdated=false;
for(int i=0;i<shopNames.length;i++){
if(shopNames[i]==oldName){
shopNames[i]=updatedName;
isUpdated=true;
System.out.println(shopNames[i]);
}
}
System.out.println("updateShopName method ended");
return isUpdated;
}
}