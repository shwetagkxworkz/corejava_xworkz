class MobileShop{
static String mobileNames[]={"null","null", "null", "null", "null", "null","null", "null", "null", "null"};
static int index;
public static boolean addMobileName(String name){
System.out.println("addMobileNames method started");
boolean isAdded=false;
if(mobileNames!=null){
mobileNames[index++]=name;
isAdded=true;
System.out.println("mobile name is added");
}
else{
System.out.println("mobile name is null");
}
System.out.println("addMobileNames method ended");
return isAdded;
}
public static void getMobileNames(){
System.out.println("getMobileNames method started");
for (int i=0;i<mobileNames.length;i++){
System.out.println(mobileNames[i]);
}
System.out.println("getMobileNames method ended");
return ;
}
public static boolean updateMobileNames(String oldName, String updatedName){
System.out.println("updateMobileNames method started");
boolean isUpdated=false;
for(int i=0;i<mobileNames.length;i++){
if(mobileNames[i]==oldName){
mobileNames[i]=updatedName;
isUpdated=true;
System.out.println(mobileNames[i]);
}
}
System.out.println("updateMobileNames method ended");
return isUpdated;
}
}