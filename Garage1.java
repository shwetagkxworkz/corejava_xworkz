class Garage1{
static String workersName[]={"suraj", "akash", "praveen", "abdul", "krishna", "lakshaman", "hanuman", "ram", "prasanna", "altafa", "mustafa", "reddy", "rakesh", "ranbeer", "rustum"};
public static void main(String name[])
{
System.out.println("main started");
getWorkersName();
System.out.println("main ended");
}
public static void getWorkersName(){
System.out.println("calling getWorkersName method");
System.out.println(" list of workers name");
for (int i=0; i<workersName.length; i++){
System.out.println(workersName[i]);
}
System.out.println("end getWorkersName method");
return;

}
}


